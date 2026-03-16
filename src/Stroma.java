public class Stroma extends Reactor {
    private static int numStroma = 0;
    protected static int upgradeLevel;
    private Chloroplast chloroplast;

    public Stroma(int rate, int upgradeLevel, boolean dependent) {
        super(rate, upgradeLevel, dependent);
        this.setUpgradeLevel(upgradeLevel);
        this.setRate(rate);
        this.setDependent(false);
        chloroplast = Producer.getChloroplast();
        numStroma++;
    }

    public static int getNumStroma() {
        return numStroma;
    }

    public void react() {
        // Consume resources
        chloroplast.setCo2(chloroplast.getCo2() - 6);
        chloroplast.setHydrogen(chloroplast.getHydrogen() - 12);
        // Start the timer
        start();
        // DON'T BLOCK - return and let canGenerate() check when done
    }

    public void generate() {
        react();
    }

    public boolean canGenerate() {
        if (isGenerating()) {
            // Currently generating - check if we're done
            if (isFinished()) {
                // Time elapsed, produce the output
                chloroplast.setGlucose(chloroplast.getGlucose() + 6);
                setGenerating(false);
                return false;  // Can't generate again yet
            }
            // Still generating
            return false;
        }
        // Not generating - check if we have resources to start
        return chloroplast.getCo2() >= 6 && chloroplast.getHydrogen() >= 12;
    }

    public void setUpgradeLevel(int upgradeLevel) {
        Stroma.upgradeLevel = upgradeLevel;
    }

    public int getUpgradeLevel() {
        return Stroma.upgradeLevel;
    }

    @Override
    public String toString() {
        return "Rate: " + this.getRate() + " Upgrade Level: " + this.getUpgradeLevel();
    }
}