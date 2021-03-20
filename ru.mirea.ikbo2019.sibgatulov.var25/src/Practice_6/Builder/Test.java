package Practice_6.Builder;

public class Test {
    public static void main(String[] args) {
        Character Warrior = new Character
                .CharBuilder("Warrior")
                .Race("Orc").Gender("male")
                .Appearance("Bulky").create();

        Character Mage = new Character
                .CharBuilder("Mage")
                .Race("Elf").Gender("female")
                .Appearance("Slimmer").create();

        Character Dovahkin = new Character
                .CharBuilder("Assassin")
                .Race("Wood Elf").Gender("male")
                .Appearance("Slimmer").create();

        Character Thief = new Character
                .CharBuilder("Thief")
                .Race("Каджита не крала").Gender("male")
                .Appearance("Super Slimmer").create();

        System.out.println(Warrior);
        System.out.println(Mage);
        System.out.println(Dovahkin);
        System.out.println(Thief);
    }
}
