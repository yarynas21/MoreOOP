package lotr;

import java.util.Random;
import kick.KnightStrategy;

public class Knight extends Character {

    private static Random rand = new Random();

    public Knight() {
        super(generateRandomValue(), generateRandomValue(), new KnightStrategy());
    }

    private static int generateRandomValue() {
        return rand.nextInt(11) + 2;
    }
}