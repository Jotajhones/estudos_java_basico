package estudos_java_basico.ex1;

public class Gerente extends Funcionario implements Autenticavel {

    public Gerente(String nome, Double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public Double calcularSalario() {
        return super.calcularSalario() + 2000.0;
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