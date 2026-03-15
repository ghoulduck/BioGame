public class Root extends Producer {
    private static int numRoots = 0;

    public Root(int rate, int upgradeLevel) {
        super(rate, upgradeLevel);
        this.setUpgradeLevel(upgradeLevel);
        this.setRate(rate);
        numRoots++;
    }

    public void doReaction(Chloroplast chloroplast) {

    }

    public static int getNumRoots() {
        return numRoots;
    }

    @Override
    public String toString() {
        return "Rate: " + this.getRate() + " Upgrade Level: " + this.getUpgradeLevel();
    }
}