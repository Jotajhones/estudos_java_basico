package sprint2;

import java.util.List;

import sprint1.entity.*;
import sprint1.services.*;
import sprint2.entity.*;

public class Main {

    public static void main(String[] args) {

        List<Usuario> usuarios = List.of(
                new Usuario("Ana", 25, true),
                new Usuario("João", 30, false),
                new Usuario("Carlos", 22, true));

        List<Pedido> pedidos = List.of(
                new Pedido(1, 150.50),
                new Pedido(2, 300.0),
                new Pedido(3, 50.0));

        ContaBancaria conta = new ContaBancaria(150.0);

        System.out.println();
        System.out.println("Ex - 6");
        // System.out.println("R$ " + conta.sacar(100.0));
        // System.out.println(conta.sacar(100.0));
        System.out.println();

        System.out.println("Ex - 7");
        // System.out.println(UsuarioService.hasNome(usuarios, "ANAa"));
        // System.out.println(UsuarioService.hasNome(usuarios, "carLOS"));
        System.out.println();

        System.out.println("Ex - 8");
        // System.out.println(PedidoService.findById(pedidos, "as"));
        // System.out.println(PedidoService.findById(pedidos, "5"));
        System.out.println();

        try (ConexaoDummy conexao = new ConexaoDummy()) {

            System.out.println("Ex - 8");
            System.out.println(PedidoService.findById(pedidos, "3"));
            // System.out.println(PedidoService.findById(pedidos, "5"));
            System.out.println();

        } catch (Exception e) {

            System.out.println("EXCEPTION DO MAIN");
        }

        System.out.println(Controller.controllerFail("1"));
    }

}
