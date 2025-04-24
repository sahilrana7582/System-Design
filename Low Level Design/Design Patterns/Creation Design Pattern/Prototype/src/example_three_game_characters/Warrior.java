package example_three_game_characters;
import java.awt.*;


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

    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(100, 100, 100, 100);
    }
}
