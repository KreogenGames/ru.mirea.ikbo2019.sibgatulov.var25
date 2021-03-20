package Practice_6.FactoryMethod;

public class Test {
    public static void main(String[] args) {
        System.out.println("Star hit Cafe кофейня в ТЦ Авеню на станции метро Юго-Западная");
        StarHitCafe cafe = new StarHitCafe();
        cafe.buyCoffee(KindOfCoffee.Cappuccino);
        cafe.buyCoffee(KindOfCoffee.Latte);
        cafe.buyCoffee(KindOfCoffee.Espresso);
        cafe.buyCoffee(KindOfCoffee.Mokkaccino);
    }
}
