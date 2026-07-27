package sprint1.entity;
public class Pedido {
    
    int id;
    Double valorTotal;

    public Pedido(int id, Double valorTotal) {
        this.id = id;
        this.valorTotal = valorTotal;
    }

    public int getId() {
        return id;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

}
