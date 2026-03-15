public class Stomata extends Producer {
    private static int numStomata = 0;
    protected static int upgradeLevel;

    public Stomata(int rate, int upgradeLevel) {
        super(rate, upgradeLevel);
        this.setUpgradeLevel(upgradeLevel);
        this.setRate(rate);
        numStomata++;
    }

    public static int getNumThylakoids() {
        return numStomata;
    }

    public void setUpgradeLevel(int upgradeLevel) {
        Stomata.upgradeLevel = upgradeLevel;
    }

    public int getUpgradeLevel() {
        return Stomata.upgradeLevel;
    }

    // implement
    public void generate() {

    }

    @Override
    public String toString() {
        return "Rate: " + this.getRate() + " Upgrade Level: " + this.getUpgradeLevel();
    }
}