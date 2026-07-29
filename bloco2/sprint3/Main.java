package sprint3;

import sprint3.config.ConfiguracaoBancoDados;
import sprint3.entity.*;
import sprint3.factory.NotificacaoFactory;
import sprint3.models.Notificacao;
import sprint3.services.*;

public class Main {

    public static void main(String[] args) {

        ConfiguracaoBancoDados config1 = ConfiguracaoBancoDados.getInstance();
        ConfiguracaoBancoDados config2 = ConfiguracaoBancoDados.getInstance();

        System.out.println(config1 == config2);

        Notificacao notificacao = NotificacaoFactory.getType("EmAiL");
        notificacao.enviar();

        Notificacao notificacao1 = NotificacaoFactory.getType("sms");
        notificacao1.enviar();

        Carrinho compra1 = new Carrinho();
        compra1.setEstrategia(new FretePac());
        System.out.println(compra1.executarCalculo(25.0));

        Carrinho compra2 = new Carrinho();
        compra2.setEstrategia(new FreteSedex());
        System.out.println(compra2.executarCalculo(25.0));

        Carrinho compra3 = new Carrinho();
        compra3.setEstrategia(new FreteTransportadora());
        System.out.println(compra3.executarCalculo(25.0));

        UsuarioPayload user = new UsuarioPayload();
        user.setNome("João").setEmail("Emai");
        User usuarioFinal = user.getUser();
        System.out.println(usuarioFinal);

        GerenciadorEventos evento = new GerenciadorEventos();

        evento.gerenciador(new ServicoLog());
        evento.gerenciador(new ServicoBoasVindasEmail());
        evento.dispararEvento("João");
    }
}