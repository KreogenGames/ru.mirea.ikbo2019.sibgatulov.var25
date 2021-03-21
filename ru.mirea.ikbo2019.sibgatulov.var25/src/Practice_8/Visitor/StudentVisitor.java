package Practice_8.Visitor;

public class StudentVisitor implements Visitor {
    @Override
    public void visit(Home home) {
        System.out.println("Вы отправились в дом номер " +
                home.getNumber() + " на улице " + home.getStreet());
    }

    @Override
    public void visit(Policlinic policlinic) {
        System.out.println("Вы отправились в "  +
                policlinic.getType() + " поликлинику номер " + policlinic.getNum());
    }

    @Override
    public void visit(University university) {
        System.out.println("Вы отправились в университет " +
                university.getName() + " на " + university.getTransport());
    }
}
