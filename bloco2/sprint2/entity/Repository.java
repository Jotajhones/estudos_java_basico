package sprint2.entity;

import sprint2.exception.DatabaseException;

public class Repository {

    public static void repositoryFails(int a) {
        throw new DatabaseException("Falha catastrófica no banco ao buscar o ID: " + a);
    }
}