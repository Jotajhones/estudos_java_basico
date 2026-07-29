package sprint3.entity;

import java.util.Date;
import sprint3.models.UsuarioBuilder;
import sprint3.entity.User;

public class UsuarioPayload implements UsuarioBuilder {

    private int id;
    private String nome;
    private String email;
    private String cpf;
    private String telefone;
    private Date dataNascimento;

    @Override
    public UsuarioBuilder setId(int id) {
        this.id = id;
        return this;
    }

    @Override
    public UsuarioBuilder setNome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public UsuarioBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    @Override
    public UsuarioBuilder setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    @Override
    public UsuarioBuilder setTelefone(String telefone) {
        this.telefone = telefone;
        return this;
    }

    @Override
    public UsuarioBuilder setDataNascimento(Date dataNascimento) {
        this.dataNascimento = new Date();
        return this;
    }

    public User getUser() {
        return new User(id, nome, email, cpf, telefone, dataNascimento);
    }

}
