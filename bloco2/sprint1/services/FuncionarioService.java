package sprint1.services;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import sprint1.entity.Funcionario;

public class FuncionarioService {

    public static Map<String, List<String>> agruparByDepartamento(List<Funcionario> lista) {

        Map<String, List<String>> resultado = lista.stream()
                .collect(Collectors.groupingBy(Funcionario::getDepartamento,
                        Collectors.mapping(Funcionario::getNome,
                                Collectors.toList())));

        return resultado;
    }

}
