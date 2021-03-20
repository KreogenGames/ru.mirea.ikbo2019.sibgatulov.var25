package Practice_5;

public class UnlazySingleton {
    private static final UnlazySingleton INSTANCE = new UnlazySingleton();

    private UnlazySingleton() {
        System.out.println("Singleton Unlazy. \n" +
                "Простой и прозрачный код, потокобезопасен, " +
                "высокая производительность в многопоточной среде.\n" +
                "Не ленивая реализация");
    }

    public static UnlazySingleton getInstance() {
        return INSTANCE;
    }
}
