package kick;

import java.util.Random;
import lotr.Character;

public class KingStrategy implements KickStrategy {
    private static Random rand = new Random();

    @Override
    public void kick(Character whokick, Character opponent) {
        opponent.setHp(opponent.getHp() - generateRandomValue());
        System.out.println("I'm King haha!");
    }
    private static int generateRandomValue() {
        return rand.nextInt(11) + 5;
    }
}
