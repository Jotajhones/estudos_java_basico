package estudos_java_basico.ex10;

public class Eletronico extends Produto implements Tributavel {

    public Eletronico(String nome, Double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularImposto() {
        return this.preco * 1.15;
    }

    public String getTipo() {
        return "Eletronico";
    }
}
