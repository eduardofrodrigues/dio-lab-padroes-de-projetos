package one.digitalinnovation.gof.singleton;

/**
 * Singleton "pregiçoso"
 *
 * @author eduardofrodrigues
 */
public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder instacia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstacia() {
        return InstanceHolder.instacia;
    }
}
