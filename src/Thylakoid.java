public class Thylakoid extends Reactor {
    private static int numThylakoids = 0;
    protected static int upgradeLevel;
    private Chloroplast chloroplast;

    public Thylakoid(int rate, int upgradeLevel, boolean dependent) {
        super(rate, upgradeLevel, dependent);
        this.setUpgradeLevel(upgradeLevel);
        this.setRate(rate);
        this.setDependent(true);
        chloroplast = Producer.getChloroplast();
        numThylakoids++;
    }

    public static int getNumThylakoids() {
        return numThylakoids;
    }

    public void generate() {
        react();
    }

    // implement
    protected void react() {
        chloroplast.setSun(chloroplast.getSun() - 12);
        chloroplast.setWater(chloroplast.getWater() - 6);
        while (true) {
            if (isFinished()) {
                setGenerating(false);
                break;
            }
        }

        // traditionally, oxygen is vented, but for gameplay purposes I am leaving it to increment the oxygen counter
        chloroplast.setHydrogen(chloroplast.getHydrogen() + 12);
        chloroplast.setOxygen(chloroplast.getOxygen() + 6);
    }

    public boolean canGenerate() {
        return isGenerating() && chloroplast.getSun() >= 12 && chloroplast.getWater() >= 6;
    }

    public void setUpgradeLevel(int upgradeLevel) {
        Thylakoid.upgradeLevel = upgradeLevel;
    }

    public int getUpgradeLevel() {
        return Thylakoid.upgradeLevel;
    }

    @Override
    public String toString() {
        return "Rate: " + this.getRate() + " Upgrade Level: " + this.getUpgradeLevel();
    }
}