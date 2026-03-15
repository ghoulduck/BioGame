public class Thylakoid extends Producer {
    private static int numThylakoids = 0;

    public Thylakoid(int rate, int upgradeLevel) {
        super(rate, upgradeLevel);
        this.setUpgradeLevel(upgradeLevel);
        this.setRate(rate);
        numThylakoids++;
    }

    public void doReaction(Chloroplast chloroplast) {

    }

    public static int getNumThylakoids() {
        return numThylakoids;
    }

    @Override
    public String toString() {
        return "Rate: " + this.getRate() + " Upgrade Level: " + this.getUpgradeLevel();
    }
}