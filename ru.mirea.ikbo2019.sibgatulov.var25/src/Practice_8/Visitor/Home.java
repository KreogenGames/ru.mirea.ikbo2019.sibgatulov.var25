package Practice_8.Visitor;

public class Home implements Element {
    private int Number;
    private String street;

    public Home(){}

    public Home(int Number, String street){
        this.Number = Number;
        this.street = street;
    }

    public int getNumber() {
        return Number;
    }

    public String getStreet() {
        return street;
    }

    @Override
    public void Accept(Visitor visitor) {
        visitor.visit(this);
    }
}
