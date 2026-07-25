package sprint1.services;

import java.util.List;

import sprint1.entity.Transacao;

public class TransacaoService {

    static public String transactionValidator(List<Transacao> lista) {

        boolean suspicious = lista.stream()
                .map(Transacao::getValor)
                .anyMatch(item -> item > 10000.0);

        boolean valid = lista.stream()
                .map(Transacao::getValor)
                .allMatch(item -> item > 0);

        return ("Suspeita: " + suspicious + ", Valida: " + valid);
    }

    static public boolean isSuspicious(List<Transacao> lista) {

        boolean resultado = lista.stream()
                .map(Transacao::getValor)
                .anyMatch(item -> item > 10000.0);

        return resultado;
    }

    static public boolean isValid(List<Transacao> lista) {

        boolean resultado = lista.stream()
                .map(Transacao::getValor)
                .allMatch(item -> item > 0);

        return resultado;
    }
}
