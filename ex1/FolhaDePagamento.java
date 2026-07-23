package estudos_java_basico.ex1;

import java.util.List;

public class FolhaDePagamento {

    public static void main(String[] args) {
        List<Funcionario> funcionarios = List.of(
                new Desenvolvedor("Alice", 5000.0),
                new Desenvolvedor("Bob", 4500.0),
                new Gerente("Carlos", 8000.0),
                new Desenvolvedor("Diana", 5200.0),
                new Gerente("Eva", 9500.0));

        double custoTotalFolha = 0.0;

        System.out.println();
        for (Funcionario funcionario : funcionarios) {
            double salarioFinal = funcionario.calcularSalario();
            custoTotalFolha += salarioFinal;

            System.out.printf("%s (%s) - R$ %.2f%n",
                    funcionario.getNome(),
                    funcionario.obterCargo(),
                    salarioFinal);
        }

        System.out.printf("%nCusto total da folha: R$ %.2f%n", custoTotalFolha);
        System.out.println();

        List<Autenticavel> usuarios = List.of(
                new Gerente("Carlos", 8000.0),
                new Cliente("João"),
                new Gerente("Eva", 9500.0),
                new Cliente("Maria"));

        System.out.println("Lista de autenticação");
        System.out.println();
        for (Autenticavel user : usuarios) {

            System.out.printf("Autenticated => %b \n",
                    user.autenticar("1234"));
        }
        System.out.println();

        RelatorioFinanceiro<Funcionario> rel = new RelatorioFinanceiro<>(funcionarios);
        System.out.println(rel.salvar());
        rel.imprimir();

        List<Funcionario> listaSalva = rel.getFuncionarios();
        System.out.println("Mensagem para os Devs!");
        for (Funcionario func : listaSalva) {

            if (func instanceof Desenvolvedor) {
                System.out.printf("%s, não esqueça de fazer o commit do seu código hoje! \n", func.getNome());
            }
        }
        System.out.println();

        List<MetodoPagamento> metodos = List.of(
                new PagamentoPix(),
                new PagamentoCartao(),
                new PagamentoBoleto());

        for (MetodoPagamento metodo : metodos) {

            String temp = metodo.processar(150.0);

            if (temp.contains("%d")) {
                temp = temp.replace("%d", "150,00");
                System.out.println(temp);
            } else {
                System.out.println("Problema interno ao retornar a resposta!");
            }
        }

        System.out.println();
        System.out.println("Ex 9");
        System.out.println(listaSalva.get(0));

        Desenvolvedor dev = new Desenvolvedor("Alice", 5000.00);

        System.out.println();
        System.out.println(listaSalva.get(0).getNome());
        System.out.println(dev.getNome());

        System.out.println();
        System.out.println(dev.equals(listaSalva.get(0)));
        System.out.println(dev.equals(listaSalva.get(1)));
        System.out.println();
    }
}