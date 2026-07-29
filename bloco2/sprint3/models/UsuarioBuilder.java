package sprint3.models;

import java.util.Date;

public interface UsuarioBuilder {

    UsuarioBuilder setId(int id);
    UsuarioBuilder setNome(String nome);
    UsuarioBuilder setEmail(String email);
    UsuarioBuilder setCpf(String cpf);
    UsuarioBuilder setTelefone(String telefone);
    UsuarioBuilder setDataNascimento(Date dataNascimento);
}
