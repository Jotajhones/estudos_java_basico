package sprint3.entity;

import java.util.Date;

public class User {
    public int id;
    public String nome;
    public String email;
    public String cpf;
    public String telefone;
    public Date dataNascimento;

    public User(int id, String nome, String email, String cpf, String telefone, Date dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataNascimento = new Date();
    }

    @Override
    public String toString() {
        return "User { " +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                ", data='" + dataNascimento + '\'' +
                " }";
    }
}
