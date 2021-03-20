package Practice_6.Prototype;

public class Load {
    private Saves save;

    public Load(){}

    public Load(Saves save){
        this.save = save;
    }

    public Load copy(){
        return new Load();
    }

    public Saves getType(){
        return save;
    }

    public void setSave(Saves save) {
        this.save = save;
    }

    @Override
    public String toString() {
        return "Пробуем " +
                "загрузить " + save;
    }
}
