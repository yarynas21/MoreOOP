package lotr;

public class GameManager {

    private static final String line = "********************";;
    public static void fight(Character c1, Character c2) {
        System.out.println(line);
        System.out.println("First player: " + c1);
        System.out.println("Second player: " + c2);

        if (c1 instanceof Hobbit && c2 instanceof Hobbit) {
            System.out.println("Both characters are Hobbits :(");
            return;
        }
        if (c1 instanceof Knight && c2 instanceof Knight) {
            System.out.println("Both characters are Knights :(");
            return;
        }
        if (c1 instanceof King && c2 instanceof King) {
            System.out.println("Both characters are Kings :(");
            return;
        }
        if (c1 instanceof Elf && c2 instanceof Elf) {
            System.out.println("Both characters are Elfs :(");
            return;
        }
        int round = 1;
        while (c1.isAlive() && c2.isAlive()) {
            System.out.println(line);
            System.out.println("Round"+round);
            System.out.println("Fight!");
            System.out.println(line);
            System.out.println("First character kicking " + c2);
            c1.kick(c2);
            if (c2.isAlive()) {
                System.out.println("Second character kicking " + c1);
                c2.kick(c1);
            }
            else break;
            System.out.println(line);
            System.out.println("So, here are round results: ");
            System.out.println("First character: " + c1);
            System.out.println("Second character: " + c2);
            round++;
        }
        System.out.println(line);
        if (c1.isAlive())
            System.out.println("First character won!!!");
        else
            System.out.println("Second character won!!!");
    }
}