
public class Cliente implements Autenticavel {

    String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public boolean autenticar(String senha) {
        return senha == "cliente123" ? true : false;
    }
    
}
