package Practice_7.FlyWeight;

import  java.awt.Color;

public class Test {
    public static void main(String[] args){
        Primitive primitives[] = {
                DishMaker.createCups(5, 25),
                DishMaker.createPlates(12, 10),
                DishMaker.createSpoon(),
        };

        Dishes dishes = DishMaker.createDishes(primitives);
        Situational context = new Situational(23, 4, 4, Color.ORANGE);
        dishes.wash(context);
        System.out.println("Посуда из " + dishes + " в количестве " + context + " вымыта");
    }
}
