package estudos_java_basico.ex1;

public abstract class Funcionario {
    
    String nome;
    Double salarioBase;

    public Funcionario(String nome, Double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase; 
    }

    public Double calcularSalario() {
        return this.salarioBase;
    }

    public String getNome() {
        return this.nome;
    }

    public abstract String obterCargo();
}


