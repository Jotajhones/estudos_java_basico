package sprint1.entity;
public class Funcionario {

    String nome;
    String departamento;
    Double salario;

    public Funcionario(String nome, String departamento, Double salario) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;

    }

    public String getDepartamento() {
        return departamento;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }

}
