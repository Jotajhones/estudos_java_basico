package sprint1.entity;

public class Usuario {
    
    String nome;
    int idade;
    boolean statusAtivo;

    public Usuario(String nome, int idade, boolean statusAtivo) {
        this.nome = nome;
        this.idade = idade;
        this.statusAtivo = statusAtivo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
    
    public boolean getStatus() {
        return statusAtivo;
    }
}
