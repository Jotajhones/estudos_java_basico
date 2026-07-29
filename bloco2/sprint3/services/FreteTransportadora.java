package sprint3.services;

import sprint3.models.CalculadoraFrete;

public class FreteTransportadora implements CalculadoraFrete {

    public Double calcular(Double valorPedido) {
        return valorPedido * 1.08;
    }
}
