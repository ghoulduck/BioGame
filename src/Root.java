public class Root extends Producer {
    private static int numStomata = 0;
    protected static int upgradeLevel;

    public Root(int rate, int upgradeLevel, Chloroplast chloroplast) {
        super(rate, upgradeLevel, chloroplast);
        this.setUpgradeLevel(upgradeLevel);
        this.setRate(rate);
        numStomata++;
    }

    public static int getNumRoots() {
        return numStomata;
    }

    public void setUpgradeLevel(int upgradeLevel) {
        Root.upgradeLevel = upgradeLevel;
    }

    public int getUpgradeLevel() {
        return Root.upgradeLevel;
    }

    // implement
    public void generate() {
        // this.start();

        while (true) {
            if (isFinished()) {
                setGenerating(false);
                break;
            }
        }

        Chloroplast chloroplast = Stomata.getChloroplast();
        chloroplast.setWater(chloroplast.getWater() + getRate());
    }

    public boolean canGenerate() {
        return isGenerating();
    }

    @Override
    public String toString() {
        return "Rate: " + this.getRate() + " Upgrade Level: " + this.getUpgradeLevel();
    }
}