package estudos_java_basico.ex10;

public class Livro extends Produto {

    public Livro(String nome, Double preco) {
        super(nome, preco);
    }

    public String getTipo() {
        return "Livro";
    }

}
