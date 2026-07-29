package sprint3.config;

public class ConfiguracaoBancoDados {

    private static volatile ConfiguracaoBancoDados instance;
    private String url;

    private ConfiguracaoBancoDados(String url) {
        this.url = url;
     }

    public static ConfiguracaoBancoDados getInstance() {

        if (instance == null) {

            synchronized (ConfiguracaoBancoDados.class) {

                if (instance == null) {
                    instance = new ConfiguracaoBancoDados("http://url:8080/configdb");
                }
            }
        }
        return instance;
    }

    public String getUrl() {
        return url;
    }
}
