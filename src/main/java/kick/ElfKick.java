package kick;
import lotr.Character;
public class ElfKick implements KickStrategy {
    @Override
    public void kick(Character whokick, Character opponent) {
        if (whokick.getPower() < opponent.getPower()) {
            whokick.setPower(whokick.getPower() - 1);
        } else {
            opponent.setHp(0);
        }
        System.out.println("I'm not so strong, but I also can kick smn!");
    }
}