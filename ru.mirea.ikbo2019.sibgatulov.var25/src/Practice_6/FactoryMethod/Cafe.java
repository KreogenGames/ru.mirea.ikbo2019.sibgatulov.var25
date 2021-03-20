package Practice_6.FactoryMethod;

public abstract class Cafe {
    protected abstract Coffee cookCoffee(KindOfCoffee coffee);

    public void buyCoffee(KindOfCoffee coffee) {
        Coffee coffee1 = cookCoffee(coffee);
        System.out.println("Вы купили " + coffee1.getKindOfCoffee());
    }
}
