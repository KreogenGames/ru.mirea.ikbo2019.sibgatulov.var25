package Practice_5;

public class SingletonSynchAccessor {

    private static SingletonSynchAccessor instance;

    private SingletonSynchAccessor(){
        System.out.println("Singleton Synchronized Accessor. \n" +
                "Потоко безопасен, низкая производительность в многопоточности");
    }

    public static synchronized SingletonSynchAccessor getInstance() {
        if (instance == null) {
            instance = new SingletonSynchAccessor();
        }
        return instance;
    }
}
