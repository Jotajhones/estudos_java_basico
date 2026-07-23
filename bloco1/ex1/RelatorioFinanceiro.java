package estudos_java_basico.ex1;

import java.util.ArrayList;
import java.util.List;

public class RelatorioFinanceiro<E extends Funcionario> implements Salvavel, Imprimivel {

    private List<E> lista;
    private List<E> listaSalva;

    public RelatorioFinanceiro(List<E> lista) {
        this.lista = lista;
    }

    @Override
    public void imprimir() {

        double custoTotalFolha = 0.0;

        System.out.println();
        for (E funcionario : this.lista) {
            double salarioFinal = funcionario.calcularSalario();
            custoTotalFolha += salarioFinal;

            System.out.printf("%s (%s) - R$ %.2f%n",
                    funcionario.getNome(),
                    funcionario.obterCargo(),
                    salarioFinal);
        }

        System.out.printf("%nCusto total da folha: R$ %.2f%n", custoTotalFolha);
        System.out.println();
    }

    @Override
    public String salvar() {
        this.listaSalva = new ArrayList<>(this.lista);
        return "lista Salva Com sucesso";
    }

    public List<E> getFuncionarios() {
        return this.listaSalva;
    }

}
