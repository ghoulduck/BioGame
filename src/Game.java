import java.util.Scanner;

public class Game {
    static boolean fullscreen;
    private Chloroplast chloroplast;
    private Inter inter;

    /* public static void main(String[] args) {
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
    } */

    public Game() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Fullscreen? ");
        fullscreen = scanner.nextLine().equalsIgnoreCase("yes");

        Chloroplast chloroplast = new Chloroplast();
        Inter inter = new Inter();
    }

    public static boolean getFullscreen() {
        return fullscreen;
    }

    public void update() {
        for (int i = 0; i < chloroplast.getProducers().size(); i++) {
            Producer current =  chloroplast.getProducers().get(i);

            switch (current.getType()) {
                case 1:
            }
        }
    }
}
