package sprint1.services;

import java.util.List;
import java.util.stream.Collectors;

import sprint1.entity.Pedido;
import sprint1.entity.Usuario;
import sprint2.exception.EntidadeNaoEncontradaException;

public class PedidoService {

    static public Double getTotal(List<Pedido> lista) {

        Double resultado = lista.stream()
                .map(Pedido::getValorTotal)
                .reduce(0.0, (subtotal, item) -> subtotal + item);

        return resultado;
    }

    public static int findById(List<Pedido> lista, String id) {

        try {
            int intId = Integer.valueOf(id);

             int resultado = lista.stream()
                    .filter(item -> item.getId() == intId)
                    .findFirst()
                    .map(Pedido::getId)
                    .orElseThrow(() -> new IndexOutOfBoundsException("Não vai dar não fia"));

            return resultado;

        } catch (NumberFormatException e) {
            throw new NumberFormatException("Nõ foi possivel conveter seu numero informe um numero valido!");
        }

    }

}
