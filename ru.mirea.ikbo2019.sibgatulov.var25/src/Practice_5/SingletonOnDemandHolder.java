package Practice_5;

public class SingletonOnDemandHolder {
    private  SingletonOnDemandHolder() {
        System.out.println("Singleton On Demand Holder. \n" +
                "Потокобезопасен, высокая производительность в многопоточности, но\n" +
                "нужна гарантия корректной инициализации объекта класса SingletonOnDemandHolder");
    }
    public static class SingletonHolder {
        public static final SingletonOnDemandHolder HOLDER_INSTANCE = new SingletonOnDemandHolder();

    }

    public static SingletonOnDemandHolder getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
}
