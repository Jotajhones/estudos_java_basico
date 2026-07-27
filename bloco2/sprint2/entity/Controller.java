package sprint2.entity;

import sprint2.exception.DatabaseException;

public class Controller {

    public static String controllerFail(String a) {

        try {
            int b = Integer.parseInt(a);
            Service.services(b);
            return "Sucesso! Requisição completada.";

        } catch (DatabaseException e) {

            return "Erro 500: Erro interno no servidor";
        }
    }
}
