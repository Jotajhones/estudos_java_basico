
public class PagamentoCartao implements MetodoPagamento{

    @Override
    public String processar(double valor) {
        return ("Processando R$ %d via Cartão");
    }
    
}
