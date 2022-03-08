package one.digitalinnovation.gof.strategy;

public class TesteStrategy {
    public static void main(String[] args) {
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        ComportamentoAgressivo agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(normal);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();

    }
}
