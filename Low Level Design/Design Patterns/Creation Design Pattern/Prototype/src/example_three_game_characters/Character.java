package example_three_game_characters;

import java.util.HashMap;
import java.util.Map;

public abstract class Character implements Prototype{
    private String charaterName;
    private String charaterHeath;
    private int strength;
    private Map<String, String> skills;

    protected Character(String charaterName, String charaterHeath, int strength) {
        this.charaterName = charaterName;
        this.charaterHeath = charaterHeath;
        this.strength = strength;
        this.skills = new HashMap<>();
    }

    protected Character(Character character) {
        this.charaterName = character.charaterName;
        this.charaterHeath = character.charaterHeath;
        this.strength = character.strength;
        this.skills = character.skills;
    }

    @Override
    public abstract Character clone();

    public void addSkill(String skillName, String skillDescription) {
        this.skills.put(skillName, skillDescription);
    }

    @Override
    public String toString() {
        return "Character [charaterName=" + charaterName + ", charaterHeath=" + charaterHeath + ", strength=" + strength + ", skills=" + skills + "]";
    }
}
