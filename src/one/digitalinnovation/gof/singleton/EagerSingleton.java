package one.digitalinnovation.gof.singleton;

/**
 * Singleton "apressado"
 *
 * @author CordeiroAboumrad
 */
public class EagerSingleton {

    private static EagerSingleton instancia = new EagerSingleton();

    private EagerSingleton(){
        super();
    }

    public static EagerSingleton getInstancia() {
        return instancia;
    }
}
