package sprint1.services;
import java.util.List;

import sprint1.entity.Pedido;

public class PedidoService {

    static public Double getTotal(List<Pedido> lista) {

        Double resultado = lista.stream()
                .map(Pedido::getValorTotal)
                .reduce(0.0, (subtotal, item) -> subtotal + item);

        return resultado;
    }

}
