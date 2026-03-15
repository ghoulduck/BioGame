import java.util.Scanner;

public class Game {
    static boolean fullscreen;
    private Difficulty difficulty = null;
    private static Chloroplast chloroplast;
    private static Inter inter;
    private static double multiplier;
    private static int rate;

    public Game() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Fullscreen? ");
        fullscreen = scanner.nextLine().equalsIgnoreCase("yes");

        while (difficulty == null) {
            System.out.println("Difficulty? ");
            System.out.println("1 (Easy), 2 (Medium), 3 (Hard)");
            difficulty = new Difficulty(scanner.nextInt());
        }

        multiplier = difficulty.getMultiplier();
        rate = difficulty.getRate();

        Chloroplast chloroplast = new Chloroplast();
        Inter inter = new Inter();

        chloroplast.addToProducers(new Pigment(rate, 1, chloroplast));
        chloroplast.addToProducers(new Root(rate, 1, chloroplast));
        chloroplast.addToProducers(new Stomata(rate, 1, chloroplast));
        chloroplast.addToProducers(new Stroma(rate, 1, false));
        chloroplast.addToProducers(new Thylakoid(rate, 1, true));
    }

    public static boolean getFullscreen() {
        return fullscreen;
    }

    public static void gameLoop() {
        while (true) {

        }
    }


    // unfinished
    public void update() {
        for (int i = 0; i < chloroplast.getProducers().size(); i++) {
            Producer current =  chloroplast.getProducers().get(i);

            switch (current.getType()) {
                case 1:
            }
        }
    }

    public static Chloroplast getChloroplast() {
        return chloroplast;
    }

    public static Inter getInter() {
        return inter;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public static double getMultiplier() {
        return multiplier;
    }

    public static int getRate() {
        return rate;
    }


}
