public class Stroma extends Producer {
    private static int numStroma = 0;

    public Stroma(int rate, int upgradeLevel) {
        super(rate, upgradeLevel);
        this.setUpgradeLevel(upgradeLevel);
        this.setRate(rate);
        numStroma++;
    }

    public void doReaction(Chloroplast chloroplast) {

    }

    public static int getNumStroma() {
        return numStroma;
    }

    @Override
    public String toString() {
        return "Rate: " + this.getRate() + " Upgrade Level: " + this.getUpgradeLevel();
    }
}