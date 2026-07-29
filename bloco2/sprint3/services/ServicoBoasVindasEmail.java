package sprint3.services;

import sprint3.models.OuvinteNovoUsuario;

public class ServicoBoasVindasEmail implements OuvinteNovoUsuario{


    public void onUsuarioCriado(String nome) {
        System.out.println("Seja bem vindo: "+nome);
    } 
    
}

