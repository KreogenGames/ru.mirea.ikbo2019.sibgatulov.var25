package Practice_7.Composite;

public class FirstPart implements Composer {
    private Integer val;

    public FirstPart(int val){
        this.val = val;
    }

    @Override
    public void add(Composer part) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Composer part) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Composer getChild(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Number value() {
        return val;
    }
}
