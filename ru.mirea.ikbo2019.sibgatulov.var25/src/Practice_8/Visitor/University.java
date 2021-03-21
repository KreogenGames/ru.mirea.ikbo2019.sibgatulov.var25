package Practice_8.Visitor;

public class University implements  Element {
    private String name;
    private String transport;

    public University(){};

    public University(String name, String transport){
        this.transport = transport;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getTransport() {
        return transport;
    }

    @Override
    public void Accept(Visitor visitor) {
        visitor.visit(this);
    }
}
