package sprint2.entity;

public class ConexaoDummy implements AutoCloseable{
    
    public ConexaoDummy() {
        System.out.println("ConexaoDummy: Conexão Aberta");
    }

    @Override
    public void close() throws Exception {
        System.out.println("ConexaoDummy: Conexão Fechada");
    }
}
