package estudos_java_basico.ex10;

public abstract class Produto {

    public String nome;
    public Double preco;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Double getPreco() {
        return this.preco;
    }

    public String getNome() {
        return this.nome;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract String getTipo();
}
