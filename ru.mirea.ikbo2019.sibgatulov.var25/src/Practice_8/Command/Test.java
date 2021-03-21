package Practice_8.Command;

public class Test {
    public static void main(String[] args){
        BuildHouseReceiver object = new BuildHouseReceiver();

        Command create = new Build(object);
        Command destroy = new Explose(object);

        Invoker state = new Invoker(create, destroy);

        System.out.println("Вы зашли в игру.\n");
        state.Creation();
        state.Destruction();
    }
}
