package Practice_7.FlyWeight;

import java.util.HashMap;
import java.util.Map;

public abstract class DishMaker {
    private static Spoon oneSpoon;
    private static Map<Double, Cup> cups;
    private static Map<Double, Plate> plates;

    static {
        cups = new HashMap<Double, Cup>();
        plates = new HashMap<Double, Plate>();
    }

    public static synchronized Dishes createDishes(Primitive ... dishes) {
        return new Dishes(dishes);
    }

    public static synchronized Cup createCups(double radius, double height) {
        if (cups.get(3.14*radius*radius * height) == null) {
            cups.put(3.14*radius*radius*height, new Cup(radius, height));
        }

        return cups.get(3.14*radius*radius*height);
    }

    public static synchronized Plate createPlates(double radius, double depth) {
        if (plates.get(radius * depth) == null) {
            plates.put(radius*depth, new Plate(radius, depth));
        }

        return plates.get(radius*depth);
    }

    public static synchronized Spoon createSpoon() {
        if (oneSpoon == null) {
            oneSpoon = new Spoon();
        }

        return oneSpoon;
    }
}
