public abstract class Reactor extends Producer {
    private int product;
    private int waste;
    private boolean dependent;


    public Reactor(int rate, int upgradeLevel, boolean dependent) {
        super(rate, upgradeLevel, Game.getChloroplast());
        this.setRate(rate);
        this.setUpgradeLevel(upgradeLevel);
        this.dependent = dependent;
    }

    public boolean isDependent() {
        return dependent;
    }

    public int generate() {
        return 0;
    }

    public void setDependent(boolean dependent) {
        this.dependent = dependent;
    }

    abstract public int react();
}
