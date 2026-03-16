public abstract class Reactor extends Producer {
    private int product;
    private int waste;
    private boolean dependent;
    protected static int upgradeLevel;
    private final Chloroplast chloroplast;


    public Reactor(int rate, int upgradeLevel, boolean dependent) {
        super(rate, upgradeLevel, Producer.getChloroplast());
        this.setRate(rate);
        this.setUpgradeLevel(upgradeLevel);
        this.dependent = dependent;
        this.chloroplast = Producer.getChloroplast();
    }

    public boolean isDependent() {
        return dependent;
    }

    // does nothing
    public abstract void generate();

    public abstract boolean canGenerate();

    public void setDependent(boolean dependent) {
        this.dependent = dependent;
    }

    abstract void react();
}
