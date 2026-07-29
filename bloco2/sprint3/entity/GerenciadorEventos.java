package sprint3.entity;

import java.util.ArrayList;
import java.util.List;

import sprint3.models.OuvinteNovoUsuario;

public class GerenciadorEventos {
    
    private List<OuvinteNovoUsuario> observer = new ArrayList<>();

    public boolean gerenciador(OuvinteNovoUsuario observer) {
        return this.observer.add(observer);
    }

    public void dispararEvento(String nome) {
       for(OuvinteNovoUsuario ouvinte : observer) {
            ouvinte.onUsuarioCriado(nome);
       }

    }
}
