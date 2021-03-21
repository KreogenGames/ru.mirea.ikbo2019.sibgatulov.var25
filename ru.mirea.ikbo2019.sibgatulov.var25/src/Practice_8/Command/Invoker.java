package Practice_8.Command;

public class Invoker {
    private Command create;
    private Command destroy;

    public Invoker(Command create, Command destroy){
        this.create = create;
        this.destroy = destroy;
    }

    public void Creation(){
        create.run();
    }

    public void Destruction(){
        destroy.run();
    }
}
