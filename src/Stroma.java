public class Stroma extends Reactor {
    private static int numStroma = 0;
    protected static int upgradeLevel;

    public Stroma(int rate, int upgradeLevel, boolean dependent) {
        super(rate, upgradeLevel, dependent);
        this.setUpgradeLevel(upgradeLevel);
        this.setRate(rate);
        this.setDependent(false);
        numStroma++;
    }

    public static int getNumStroma() {
        return numStroma;
    }

    // implement
    public void react() {

    }

    public void setUpgradeLevel(int upgradeLevel) {
        Stroma.upgradeLevel = upgradeLevel;
    }

    public int getUpgradeLevel() {
        return Stroma.upgradeLevel;
    }

    @Override
    public String toString() {
        return "Rate: " + this.getRate() + " Upgrade Level: " + this.getUpgradeLevel();
    }
}