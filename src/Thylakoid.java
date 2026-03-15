public class Thylakoid extends Reactor {
    private static int numThylakoids = 0;
    protected static int upgradeLevel;

    public Thylakoid(int rate, int upgradeLevel, boolean dependent) {
        super(rate, upgradeLevel, dependent);
        this.setUpgradeLevel(upgradeLevel);
        this.setRate(rate);
        this.setDependent(true);
        numThylakoids++;
    }

    public static int getNumThylakoids() {
        return numThylakoids;
    }

    // implement
    public void react() {

    }

    public void setUpgradeLevel(int upgradeLevel) {
        Thylakoid.upgradeLevel = upgradeLevel;
    }

    public int getUpgradeLevel() {
        return Thylakoid.upgradeLevel;
    }

    @Override
    public String toString() {
        return "Rate: " + this.getRate() + " Upgrade Level: " + this.getUpgradeLevel();
    }
}