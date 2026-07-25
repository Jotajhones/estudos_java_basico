import java.util.List;
import java.util.Map;

import sprint1.services.*;
import sprint1.entity.*;

public class Main {

        public static void main(String[] args) {

                List<Usuario> usuarios = List.of(
                                new Usuario("Ana", 25, true),
                                new Usuario("João", 30, false),
                                new Usuario("Carlos", 22, true));

                List<Produto> produtos = List.of(
                                new Produto("Notebook", 5000.0),
                                new Produto("Mouse", 150.0),
                                new Produto("Teclado", 300.0),
                                new Produto("Monitor", 1200.0));

                List<Funcionario> funcionarios = List.of(
                                new Funcionario("Alice", "TI", 6000.0),
                                new Funcionario("Bob", "Vendas", 4000.0),
                                new Funcionario("Charlie", "TI", 7000.0));

                List<Pedido> pedidos = List.of(
                                new Pedido(1, 150.50),
                                new Pedido(2, 300.0),
                                new Pedido(3, 50.0));

                List<Transacao> transacoes = List.of(
                                new Transacao(1, 500.0, "PIX"),
                                new Transacao(2, 12000.0, "TED"),
                                new Transacao(3, 150.0, "BOLETO"));

                List<String> nomesAtivos = UsuarioService.isActiveNomes(usuarios);
                List<String> produtosTop3 = ProdutoService.getTop3(produtos);
                Map<String, List<String>> funcionariosGroup = FuncionarioService.agruparByDepartamento(funcionarios);
                Double pedidoValorTotal = PedidoService.getTotal(pedidos);
                String isValid = TransacaoService.transactionValidator(transacoes);

                imprimirListaBruta("Ex - 1 | Users ativos", nomesAtivos);
                imprimirListaBruta("Ex - 2 | Três mais Caros", produtosTop3);

                System.out.println();
                System.out.println("Ex - 3 | grouping");
                System.out.println(funcionariosGroup);
                System.out.println();

                System.out.println();
                System.out.println("Ex - 4 | reduce");
                System.out.println("O valor total é: " + pedidoValorTotal);
                System.out.println();

                System.out.println();
                System.out.println("Ex - 5 | any & allMatch");
                System.out.println(isValid);
                System.out.println();

        }

        public static void imprimirListaBruta(String ex, List<String> lista) {
                System.out.println();
                System.out.println(ex);
                System.out.println(lista);
                System.out.println();
        }
}