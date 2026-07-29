package sprint3.services;

import sprint3.models.*;

public class EmailNotificacao implements Notificacao{

    public EmailNotificacao() {}
    
    public void enviar() {
        System.out.println("EMAIL Enviado");
    }
}
