package sprint2.entity;

import sprint2.exception.SaldoInsuficienteException;

public class ContaBancaria {

    Double saldo;

    public ContaBancaria(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double sacar(Double valor) {

        if (this.saldo >= valor) {

            this.saldo = this.saldo - valor;
            return saldo;
        } else {
            throw new SaldoInsuficienteException("Você não tem saldo para sacar R$ " + valor + ". Seu Saldo R$ " + this.saldo);
        }
    }
}
