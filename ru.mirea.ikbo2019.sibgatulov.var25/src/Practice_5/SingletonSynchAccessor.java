package Practice_5;

public class SingletonSynchAccessor {//Потоко безопасен, низкая производительность в многопоточности

    private static SingletonSynchAccessor instance;

    private SingletonSynchAccessor(){
        System.out.println("Singleton Synchronized Accessor");
    }

    public static synchronized SingletonSynchAccessor getInstance() {
        if (instance == null) {
            instance = new SingletonSynchAccessor();
        }
        return instance;
    }
}
