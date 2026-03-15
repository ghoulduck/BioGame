import java.util.Scanner;

public class Game {
    boolean fullscreen;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Start Game? ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            boolean fullscreen = false;
            System.out.println("Fullscreen?");
            if (scanner.nextLine().equalsIgnoreCase("yes")) {
                fullscreen = true;
            }

            Game game = new Game();

        } else {
            return;
        }

        while (true) {
            System.out.println("Close Game?");
            if (scanner.nextLine().equalsIgnoreCase("yes")) {
                return;
            }
        }
    }

    public Game() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fullscreen? ");
        fullscreen = scanner.nextLine().equalsIgnoreCase("yes");

        Chloroplast chloroplast = new Chloroplast();
        Interface inter = new Interface();
    }
}
