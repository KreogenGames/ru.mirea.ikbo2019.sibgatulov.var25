package Practice_7.FlyWeight;

public class Cup implements Primitive {
    private double radius;
    private double height;

    public Cup(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void wash(Situational context) {    }

    @Override
    public String toString() {
        return "Чашек " +
                " радиуса " + radius +
                " и высоты " + height;
    }
}
