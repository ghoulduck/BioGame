public class Pigment extends Producer {
    private static int numStomata = 0;
    protected static int upgradeLevel;

    public Pigment(int rate, int upgradeLevel, Chloroplast chloroplast) {
        super(rate, upgradeLevel, chloroplast);
        this.setUpgradeLevel(upgradeLevel);
        this.setRate(rate);
        numStomata++;
    }

    public static int getNumThylakoids() {
        return numStomata;
    }

    public void setUpgradeLevel(int upgradeLevel) {
        Pigment.upgradeLevel = upgradeLevel;
    }

    public int getUpgradeLevel() {
        return Pigment.upgradeLevel;
    }

    // implement
    public void generate() {

    }

    public boolean canGenerate() {
        return true;
    }

    @Override
    public String toString() {
        return "Rate: " + this.getRate() + " Upgrade Level: " + this.getUpgradeLevel();
    }
}