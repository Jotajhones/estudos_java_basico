
public class Desenvolvedor extends Funcionarios {

    public Desenvolvedor(String nome, Double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public String obterCargo() {
        return "Desenvolvedor";
    }

    public String toString() {
        String temp = "Dev: [nome] - Salário: [salario]";
        temp = temp.replace("[nome]", this.nome);
        temp = temp.replace("[salario]", this.salarioBase.toString());
        return temp;
    }

    public boolean equals(Object obj) {

        String nomeLocal = this.nome.toLowerCase();
        String nomeFunc = ((Funcionarios) obj).getNome().toLowerCase();

        if(nomeLocal.equals(nomeFunc)) {
            return true;
        } else {
            return false;
        }
    }
}
