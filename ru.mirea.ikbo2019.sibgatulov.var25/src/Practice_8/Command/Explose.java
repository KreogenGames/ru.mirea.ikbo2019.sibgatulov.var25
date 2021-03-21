package Practice_8.Command;

public class Explose implements Command {
    private BuildHouseReceiver object;

    public Explose(BuildHouseReceiver object){
        this.object = object;
    }

    @Override
    public void run() {
        object.exploseHouse();
    }
}
