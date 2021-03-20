package Practice_5;

public class Test {
    public static void main(String[] args) {
        System.out.println("Первая реализация");
        SingletonDoubleChLog.getInstance();
        System.out.println("Вторая реализация");
        SingletonOnDemandHolder.getInstance();
        System.out.println("Третья реализация");
        SingletonSynchAccessor.getInstance();
    }
}
