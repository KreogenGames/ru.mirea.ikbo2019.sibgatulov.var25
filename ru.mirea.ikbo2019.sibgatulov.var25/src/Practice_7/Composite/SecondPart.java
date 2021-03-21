package Practice_7.Composite;

public class SecondPart implements Composer {
    private Float val;

    public SecondPart(float val){
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
