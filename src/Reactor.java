public abstract class Reactor extends Producer {
    private int product;
    private int waste;
    private boolean dependent;
    protected static int upgradeLevel;


    public Reactor(int rate, int upgradeLevel, boolean dependent) {
        super(rate, upgradeLevel, Game.getChloroplast());
        this.setRate(rate);
        this.setUpgradeLevel(upgradeLevel);
        this.dependent = dependent;
    }

    public boolean isDependent() {
        return dependent;
    }

    // does nothing
    public void generate() {
        return;
    }

    public boolean canGenerate() {
        return false;
    }

    public void setDependent(boolean dependent) {
        this.dependent = dependent;
    }

    abstract public void react();
}
