package sprint1.services;
import java.util.List;
import java.util.stream.Collectors;

import sprint1.entity.Usuario;

public class UsuarioService {

    public static List<String> isActiveNomes(List<Usuario> lista) {

        List<String> resultado = lista.stream()
                .filter(Usuario::getStatus)
                .map(Usuario::getNome)
                .collect(Collectors.toList());

        return resultado;
    }
}