package Practice_6.AbstractFactory;

public interface ClockFactory {
    Clock createMechanicClock();
    Clock createQuartzClock();
}
