package Practice_8.Visitor;

public class Policlinic implements Element {
    private int num;
    private String type;

    public Policlinic(){}

    public Policlinic(int num, String type){
        this.num = num;
        this.type = type;
    }

    public int getNum() {
        return num;
    }

    public String getType() {
        return type;
    }

    @Override
    public void Accept(Visitor visitor) {
        visitor.visit(this);
    }
}
