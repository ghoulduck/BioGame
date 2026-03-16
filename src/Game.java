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

        gameLoop();
    }

    public static boolean getFullscreen() {
        return fullscreen;
    }

    public void gameLoop() {
        int targetFPS = 2;
        long frameTime = 1000 / targetFPS;

        while (true) {
            long startTime = System.currentTimeMillis();

            update();
            updateConsole();

            long elapsedTime = System.currentTimeMillis() - startTime;
            long sleepTime = frameTime - elapsedTime;

            if (sleepTime > 0) {
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public void updateConsole() {
        System.out.print("\033[2J\033[H");

        System.out.println("BioFactory");
        System.out.println("═════════════════════════════════════════");
        System.out.println();

        System.out.println("Output Resources:");
        System.out.println("  Glucose:   " + String.format("%6d", chloroplast.getGlucose()));
        System.out.println("  Oxygen:    " + String.format("%6d", chloroplast.getOxygen()));
        System.out.println("  Hydrogen:  " + String.format("%6d", chloroplast.getHydrogen()));
        System.out.println();

        System.out.println("Input Resources:");
        System.out.println("  Sun:       " + String.format("%6d", chloroplast.getSun()));
        System.out.println("  CO2:       " + String.format("%6d", chloroplast.getCo2()));
        System.out.println("  Water:     " + String.format("%6d", chloroplast.getWater()));
        System.out.println();

        System.out.println("Producers:");
        System.out.println("  Pigments:  " + String.format("%3d", Pigment.getNumPigments()));
        System.out.println("  Roots:     " + String.format("%3d", Root.getNumRoots()));
        System.out.println("  Stomata:   " + String.format("%3d", Stomata.getNumStomata()));
        System.out.println("  Stroma:    " + String.format("%3d", Stroma.getNumStroma()));
        System.out.println("  Thylakoids:" + String.format("%3d", Thylakoid.getNumThylakoids()));
        System.out.println();
    }

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