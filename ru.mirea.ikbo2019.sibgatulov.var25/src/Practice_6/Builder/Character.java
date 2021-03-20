package Practice_6.Builder;

public class Character {
    private final String charClass;
    private final String charRace;
    private final String charGender;
    private final String charAppearance;

    public static class CharBuilder {
        private final String charClass;
        private String charRace;
        private String charGender;
        private String charAppearance;

        public CharBuilder Gender(String charGender){
            this.charGender = charGender;
            return this;
        }

        public CharBuilder Race(String charRace) {
            this.charRace = charRace;
            return this;
        }

        public CharBuilder(String charClass) {
            this.charClass = charClass;
        }

        public CharBuilder Appearance(String charAppearance) {
            this.charAppearance = charAppearance;
            return this;
        }

        public Character create() {
            return new Character(this);
        }
    }
    private Character(CharBuilder builder) {
        charGender = builder.charGender;
        charRace = builder.charRace;
        charClass = builder.charClass;
        charAppearance = builder.charAppearance;
    }

    @Override
    public String toString() {
        return "Character{" +
                "charClass='" + charClass + '\'' +
                ", charRace='" + charRace + '\'' +
                ", charGender='" + charGender + '\'' +
                ", charAppearance='" + charAppearance + '\'' +
                '}';
    }
}
