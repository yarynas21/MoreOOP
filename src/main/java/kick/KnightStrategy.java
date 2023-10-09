package kick;
import lotr.Character;

import java.util.Random;

public class KnightStrategy implements KickStrategy{

    private static Random rand = new Random();

    @Override
    public void kick(Character whokick, Character opponent) {
        opponent.setHp(opponent.getHp() - generateRandomValue());
        System.out.println("You will die haha!");
    }
    private static int generateRandomValue() {
        return rand.nextInt(11) + 2;
    }
}
