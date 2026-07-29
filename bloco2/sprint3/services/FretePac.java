package sprint3.services;

import sprint3.models.CalculadoraFrete;

public class FretePac implements CalculadoraFrete {

    public Double calcular(Double valorPedido) {
        return valorPedido;
    }
    
}