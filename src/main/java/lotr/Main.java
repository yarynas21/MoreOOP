package lotr;

import static lotr.CharacterFactory.createCharacter;

public class Main {

    public static void main(String[] args) {

        Character c1 = createCharacter();
        Character c2 = createCharacter();
        GameManager game = new GameManager();
        game.fight(c1, c2);
    }
}