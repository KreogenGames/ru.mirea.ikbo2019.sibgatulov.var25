package Practice_8.Command;

public class Build implements Command {
    private BuildHouseReceiver object;

    public Build(BuildHouseReceiver object){
        this.object = object;
    }

    @Override
    public void run() {
        object.buildHouse();
    }
}
