package sprint3.services;

import sprint3.models.CalculadoraFrete;

public class Carrinho {
    
    private CalculadoraFrete estrategia;

    public void setEstrategia(CalculadoraFrete estrategia) {
        this.estrategia = estrategia;
    }

    public double executarCalculo(double valorPedido) {
        return estrategia.calcular(valorPedido);
    }
}
