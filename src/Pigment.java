public class Pigment extends Producer {
    private static int numPigments = 0;

    public Pigment(int rate, int upgradeLevel) {
        super(rate, upgradeLevel);
        this.setUpgradeLevel(upgradeLevel);
        this.setRate(rate);
        numPigments++;
    }

    public void doReaction(Chloroplast chloroplast) {

    }

    public static int getNumPigments() {
        return numPigments;
    }

    @Override
    public String toString() {
        return "Rate: " + this.getRate() + " Upgrade Level: " + this.getUpgradeLevel();
    }
}