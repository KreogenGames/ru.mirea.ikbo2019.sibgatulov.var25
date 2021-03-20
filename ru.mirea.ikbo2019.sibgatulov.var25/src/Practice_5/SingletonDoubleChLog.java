package Practice_5;

public class SingletonDoubleChLog {
    private static volatile SingletonDoubleChLog INSTANCE;
    /*Потокобезопасно, высокая производительность в многопоточной среде.
        Не поддерживается на ранних версиях Java. Ниже 1.5.
        Не будет корректно работать без volatile или финал*/
    private SingletonDoubleChLog() {
        System.out.println("Singleton Double Checked Locking");
    }

    public static SingletonDoubleChLog getInstance() {
        if (INSTANCE == null) {
            synchronized (SingletonDoubleChLog.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonDoubleChLog();
                }
            }
        }
        return INSTANCE;
    }

}
