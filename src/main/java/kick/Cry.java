package kick;
import lotr.Character;

public class Cry implements KickStrategy{
    @Override
    public void kick(Character whokick, Character opponent) {
        System.out.println("🫠🥲😓😢😰🥺🥺");
    }
}
