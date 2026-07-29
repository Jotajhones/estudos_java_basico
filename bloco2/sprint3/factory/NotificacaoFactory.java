package sprint3.factory;

import sprint3.models.Notificacao;
import sprint3.services.EmailNotificacao;
import sprint3.services.SmsNotificacao;

public class NotificacaoFactory {

    public static Notificacao getType(String type) {

        if (type.toLowerCase().equals("sms")) {
            return new SmsNotificacao();

        }

        if (type.toLowerCase().equals("email")) {
            return new EmailNotificacao();
        }

        throw new IllegalArgumentException("Tipo de notificação inválido!");
    }
}
