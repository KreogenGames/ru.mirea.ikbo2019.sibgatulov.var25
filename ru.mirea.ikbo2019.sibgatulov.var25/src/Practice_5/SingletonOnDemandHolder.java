package Practice_5;

public class SingletonOnDemandHolder {
    /*Потокобезопасен, высокая производительность в многопоточности, но
    нужна гарантия корректной инициализации объекта класса SingletonOnDemandHolder*/
    private  SingletonOnDemandHolder() {
        System.out.println("Singleton On Demand Holder");
    }
    public static class SingletonHolder {
        public static final SingletonOnDemandHolder HOLDER_INSTANCE = new SingletonOnDemandHolder();

    }

    public static SingletonOnDemandHolder getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
}
