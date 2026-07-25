package sprint1.services;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import sprint1.entity.Produto;

public class ProdutoService {

    public static List<String> getTop3(List<Produto> lista) {

        List<String> resultado = lista.stream()
                .sorted(Comparator.comparing(Produto::getPreco).reversed())
                .limit(3)
                .map(Produto::getNome)
                .collect(Collectors.toList());

        return resultado;
    }
}
