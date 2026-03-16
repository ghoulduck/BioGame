import java.util.Scanner;

public class Game {
    static boolean fullscreen;
    private Difficulty difficulty = null;
    private Chloroplast chloroplast;
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

        chloroplast = new Chloroplast();
        inter = new Inter();

        chloroplast.addToProducers(new Pigment(rate, 1, chloroplast));
        chloroplast.addToProducers(new Root(rate, 1, chloroplast));
        chloroplast.addToProducers(new Stomata(rate, 1, chloroplast));
        chloroplast.addToProducers(new Stroma(rate, 1, false));
        chloroplast.addToProducers(new Thylakoid(rate, 1, true));

        initConsole();
        gameLoop();
    }

    public static boolean getFullscreen() {
        return fullscreen;
    }

    public void gameLoop() {
        initConsole();

        while (true) {
            update();
            updateConsole();
            chloroplast.iterateProducers();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void updateConsole() {
        System.out.print("\033[H"); // move cursor to top

        System.out.println("BioFactory");
        System.out.println("-----------------");

        System.out.println("Glucose: " + chloroplast.getGlucose());
        System.out.println("Oxygen: " + chloroplast.getOxygen());
        System.out.println("Hydrogen: " + chloroplast.getHydrogen());

        System.out.println();

        System.out.println("Sun: " + chloroplast.getSun());
        System.out.println("CO2: " + chloroplast.getCo2());
        System.out.println("Water: " + chloroplast.getWater());

        System.out.println();

        System.out.println("Producers");
        System.out.println("Pigments: " + Pigment.getNumPigments());
        System.out.println("Roots: " + Root.getNumRoots());
        System.out.println("Stomata: " + Stomata.getNumStomata());
        System.out.println("Stroma: " + Stroma.getNumStroma());
        System.out.println("Thylakoids: " + Thylakoid.getNumThylakoids());
    }

    public void initConsole() {
        for (int i = 0; i < 15; i++) {
            System.out.println();
        }
    }

    // unfinished
    public void update() {
        chloroplast.iterateProducers();
    }

    public Chloroplast getChloroplast() {
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