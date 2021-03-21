package Practice_7.FlyWeight;

public class Plate implements Primitive {
    private double radius;
    private double depth;

    public Plate(double radius, double depth) {
        this.radius = radius;
        this.depth = depth;
    }

    @Override
    public void wash(Situational context) { }

    @Override
    public String toString() {
        return "Тарелок " +
                " радиуса " + radius +
                " и глубины " + depth;
    }
}
