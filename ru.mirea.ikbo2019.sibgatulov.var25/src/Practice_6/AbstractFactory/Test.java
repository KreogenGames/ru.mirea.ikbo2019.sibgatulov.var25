package Practice_6.AbstractFactory;

public class Test {
    public static void main(String[] args) {
        NicaClock nicaClock = new NicaClock();
        nicaClock.createMechanicClock();
        nicaClock.createQuartzClock();
    }
}
