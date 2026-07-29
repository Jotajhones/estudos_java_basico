package sprint3.services;

import sprint3.models.OuvinteNovoUsuario;

public class ServicoLog implements OuvinteNovoUsuario{

    public void onUsuarioCriado(String nome) {
        System.out.println("Usuario criado com sucesso: " + nome);
    }
    
}
