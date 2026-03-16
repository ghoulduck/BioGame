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

    public void generate() {
        start();
    }

    public boolean canGenerate() {
        if (isGenerating()) {
            if (isFinished()) {
                Chloroplast chloroplast = Producer.getChloroplast();
                chloroplast.setWater(chloroplast.getWater() + getRate());
                setGenerating(false);
                return false;
            }
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Rate: " + this.getRate() + " Upgrade Level: " + this.getUpgradeLevel();
    }
}