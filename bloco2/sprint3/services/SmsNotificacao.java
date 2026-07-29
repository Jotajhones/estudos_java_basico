package sprint3.services;

import sprint3.models.Notificacao;

public class SmsNotificacao implements Notificacao {

    public SmsNotificacao() {}

    public void enviar() {
        System.out.println("SMS Enviado");
    }

}
