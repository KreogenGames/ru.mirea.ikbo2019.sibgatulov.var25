package Practice_7.Composite;

import com.sun.jdi.FloatValue;

import java.util.ArrayList;
import java.util.List;

public class Parts implements Composer {

    private List<Composer> expression;

    public Parts(FirstPart... expression){ //Конструктор с переменным числом аргументов
        this.expression = new ArrayList<Composer>();

        for(FirstPart i: expression){
            this.expression.add(i);
        }
    }

    @Override
    public void add(Composer part) {
        expression.add(part);
    }

    @Override
    public void remove(Composer part) {
        if (part instanceof FirstPart) {
            expression.add(new FirstPart(-1*part.value().intValue()));
        } else {
            expression.add(new SecondPart(-1*part.value().floatValue()));
        }
    }

    @Override
    public Number value() {
        Number res = new Float(0);

        for (Composer part: expression) {
            res = res.floatValue() + part.value().floatValue();
        }

        return res;
    }

    @Override
    public Composer getChild(int index) {
        return expression.get(index);
    }

    @Override
    public String toString() {
        return "Parts{" +
                "expression=" + expression;
    }
}
