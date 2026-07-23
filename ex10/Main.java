package estudos_java_basico.ex10;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Produto> carrinho = List.of(
                new Livro("Clean Code", 120.0),
                new Eletronico("Smartphone X", 2500.0),
                new Livro("Domain-Driven Design", 150.0),
                new Eletronico("Monitor 27", 1200.0));

        Double valorTotal = 0.0;
        
        System.out.println();
        System.out.println("Exercicio 10");
        System.out.printf("Produto - [TIPO] => R$ Valor \n");
        System.out.println();

        for (Produto item : carrinho) {

            Double preco;

            if (item instanceof Tributavel) {
                preco = ((Tributavel) item).calcularImposto();
            } else {
                preco = item.getPreco();
            }

            System.out.printf("%s - [%s] => R$ %s \n", item.getNome(), item.getTipo(), preco);
            valorTotal = valorTotal + preco;

        }
        System.out.println();
        System.out.println("Valor total - R$: " + valorTotal);
    }
}
