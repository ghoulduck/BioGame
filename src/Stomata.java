public class Stomata extends Producer {
    private static int numStomata = 0;

    public Stomata(int rate, int upgradeLevel) {
        super(rate, upgradeLevel);
        this.setUpgradeLevel(upgradeLevel);
        this.setRate(rate);
        numStomata++;
    }

    public void doReaction(Chloroplast chloroplast) {

    }

    public static int getNumThylakoids() {
        return numStomata;
    }

    @Override
    public String toString() {
        return "Rate: " + this.getRate() + " Upgrade Level: " + this.getUpgradeLevel();
    }
}