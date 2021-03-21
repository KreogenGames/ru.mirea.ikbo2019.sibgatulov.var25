package Practice_7.Composite;

public class Test {
    public static void main(String[] args){
        Composer expr = new Parts();

        Composer a = new Parts(new FirstPart(55), new FirstPart(82));
        Composer b = new Parts(new FirstPart(20), new FirstPart(-54));

        expr.add(new FirstPart(354));
        expr.remove(a);
        expr.remove(b);
        expr.add(new SecondPart(5));

        System.out.println("Вычислим выражение: 354 - (55+82) - (20-54) + 5\n" +
                "Приведем к следующему виду: 354 - a - b + 5\n" +
                "Результат: " +expr.value());
        System.out.println("Элемент под индексом 0: " + expr.getChild(0));
        System.out.println("Элемент под индексом 1: " + expr.getChild(1));
    }
}
