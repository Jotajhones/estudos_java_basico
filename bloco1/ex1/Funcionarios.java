
public abstract class Funcionarios {
    
    String nome;
    Double salarioBase;

    public Funcionarios(String nome, Double salarioBase) {
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


