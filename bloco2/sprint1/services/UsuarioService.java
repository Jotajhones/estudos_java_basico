package sprint1.services;

import java.util.List;
import java.util.stream.Collectors;

import sprint1.entity.Usuario;
import sprint2.exception.EntidadeNaoEncontradaException;

public class UsuarioService {

    public static List<String> isActiveNomes(List<Usuario> lista) {

        List<String> resultado = lista.stream()
                .filter(Usuario::getStatus)
                .map(Usuario::getNome)
                .collect(Collectors.toList());

        return resultado;
    }

    public static String hasNome(List<Usuario> lista, String nome) {

        String resultado = lista.stream()
                .filter(usuario -> usuario.getNome().toLowerCase().equals(nome.toLowerCase()))
                .findFirst()
                .map(Usuario::getNome)
                .orElseThrow(() -> new EntidadeNaoEncontradaException("Não encontrado fia"));

        return resultado;
    }
}