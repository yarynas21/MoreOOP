package lotr;

import java.util.Random;
import kick.KingStrategy;

public class King extends Character {

    private static Random rand = new Random();

    public King() {
        super(generateRandomValue(), generateRandomValue(), new KingStrategy());
    }

    private static int generateRandomValue() {
        return rand.nextInt(11) + 5;
    }
}