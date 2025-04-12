package example_three_game_characters;


public class Warrior extends Character {


    public Warrior(String charaterName, String charaterHeath, int strength) {
        super(charaterName, charaterHeath, strength);
    }

    private Warrior(Warrior warrior) {
        super(warrior);
    }

    public void addSkill(String skillName, String skillDescription) {
        super.addSkill(skillName, skillDescription);
    }

    @Override
    public Character clone() {
        return new Warrior(this);
    }
}
