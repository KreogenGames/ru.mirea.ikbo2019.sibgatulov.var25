package Practice_8.Visitor;

public interface Visitor {
    void visit(Policlinic policlinic);
    void visit(University university);
    void visit(Home home);
}
