package one.digitalinnovation.gof.singleton;

public class TesteSingleton {
    public static void main(String[] args) {
        SingletonEager eager = SingletonEager.getInstacia();
        System.out.println(eager);
        eager = SingletonEager.getInstacia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstacia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstacia();
        System.out.println(lazyHolder);

        SingletonLazy lazy = SingletonLazy.getInstacia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstacia();
        System.out.println(lazy);
    }
}
