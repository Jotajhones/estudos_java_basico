package estudos_java_basico.ex1;

public class PagamentoBoleto implements MetodoPagamento{

    @Override
    public String processar(double valor) {
        return ("Processando R$ %d via Boleto");
    }
    
}
