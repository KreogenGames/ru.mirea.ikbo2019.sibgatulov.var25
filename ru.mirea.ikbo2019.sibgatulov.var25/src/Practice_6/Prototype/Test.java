package Practice_6.Prototype;

public class Test {
    public static void main(String[] args){
        Load early = new Load(Saves.earlySAVE);
        Load crashed = new Load(Saves.crashedSAVE);
        Load unlucky = new Load(Saves.unluckySAVE);

        System.out.println(early);
        System.out.println(crashed);
        System.out.println(unlucky);
    }
}
