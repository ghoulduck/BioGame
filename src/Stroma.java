public class Stroma extends Reactor {
    private static int numStroma = 0;

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



    @Override
    public String toString() {
        return "Rate: " + this.getRate() + " Upgrade Level: " + this.getUpgradeLevel();
    }
}