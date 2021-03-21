package Practice_7.FlyWeight;

import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;

public class Dishes implements Primitive {

    private List<Primitive> dishes;

    public Dishes(Primitive ... primitives){
        this.dishes = new LinkedList<Primitive>();
        this.dishes.addAll(Arrays.asList(primitives));
    }

    @Override
    public void wash(Situational context) {
        for(Primitive d: dishes){
            d.wash(context);
        }
    }

    @Override
    public String toString() {
        return " " + dishes;
    }
}
