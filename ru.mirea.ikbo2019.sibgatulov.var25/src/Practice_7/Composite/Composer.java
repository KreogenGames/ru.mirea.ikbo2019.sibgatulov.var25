package Practice_7.Composite;

public interface Composer {

    public Number value();
    public void add(Composer part);
    public void remove(Composer part);
    public Composer getChild(int index);
}
