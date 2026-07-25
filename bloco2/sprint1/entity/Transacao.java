package sprint1.entity;
public class Transacao {
    
    int id;
    Double valor;
    String tipo;

    public Transacao(int id, Double valor, String tipo) {
        this.id = id;
        this.valor = valor;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }   

    public String getTipo() {
        return tipo;
    }

    public Double getValor() {
        return valor;
    }

}
