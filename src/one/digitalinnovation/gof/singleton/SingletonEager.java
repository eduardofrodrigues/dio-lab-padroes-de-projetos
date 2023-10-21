package one.digitalinnovation.gof.singleton;

/**
 * Singleton "apressado"
 * @author eduardofrodrigues
 */
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstacia() {
        return instancia;
    }
}
