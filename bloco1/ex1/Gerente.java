
public class Gerente extends Funcionarios implements Autenticavel {

    public Gerente(String nome, Double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public Double calcularSalario() {
        Double salario = super.calcularSalario();
        return salario + 2000.0;
    }

    @Override
    public String obterCargo() {
        return "Gerente";
    }

    @Override
    public boolean autenticar(String senha) {
        return senha == "1234" ? true : false;
    }
}