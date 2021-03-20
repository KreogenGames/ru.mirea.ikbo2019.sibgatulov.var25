package Practice_5;

public class SingletonDoubleChLog {
    private static volatile SingletonDoubleChLog INSTANCE;

    private SingletonDoubleChLog() {
        System.out.println("Singleton Double Checked Locking. \n" +
                "Потокобезопасно, высокая производительность в многопоточной среде.\n" +
                "Не поддерживается на ранних версиях Java, ниже 1.5.\n" +
                "Не будет корректно работать без volatile или final");
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
