public abstract class Reactor extends Producer {
    private int product;
    private int waste;
    private final boolean dependent;


    public Reactor(int rate, int upgradeLevel, boolean dependent) {
        super(rate, upgradeLevel);
        this.setRate(rate);
        this.setUpgradeLevel(upgradeLevel);
        this.dependent = dependent;
    }

    public boolean isDependent() {
        return dependent;
    }
}
