package example_three_game_characters;

import java.util.HashMap;
import java.util.Map;

public class CharacterRegistery {

    private Map<String, Character> characters = new HashMap<>();

    public void registerCharacter(String type, Character character) {
        characters.put(type, character);
    }

    public Character createCharacter(String type) {
        return characters.get(type).clone();
    }

}
