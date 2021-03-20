package Practice_6.FactoryMethod;

public class StarHitCafe extends Cafe {
    @Override
    protected Coffee cookCoffee(KindOfCoffee coffee) {
        Coffee coffee1 = null;

        switch (coffee) {
            case Cappuccino:
                coffee1 = new StarHitCappuccino();
                break;
            case Espresso:
                coffee1 = new StarHitEspresso();
                break;
            case Latte:
                coffee1 = new StarHitLatte();
                break;
            case Mokkaccino:
                coffee1 = new StarHitMokkaccino();
                break;
        }
        return coffee1;
    }
}
