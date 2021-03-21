package Practice_8.Visitor;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args){
        ArrayList<Element> places = new ArrayList<>();

        University university = new University("МИРЭА", "метро");
        Policlinic policlinic = new Policlinic(15, "бесплатную");
        Home home = new Home(5, "Китай город");

        places.add(policlinic);
        places.add(university);
        places.add(home);

        Visitor student = new StudentVisitor();
        for(Element st: places){
            st.Accept(student);
        }
    }
}
