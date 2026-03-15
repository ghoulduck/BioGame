public abstract class Producer {
    private int rate;
    private static int upgradeLevel;
    abstract void setUpgradeLevel(int upgradeLevel);
    public abstract int getUpgradeLevel();
    private int type;
    private int processTime;
    private long startTime;
    private long endTime;
    private static Chloroplast chloroplast;
    private boolean generating;

    public Producer(int rate, int upgradeLevel, Chloroplast chloroplast) {
        this.rate = rate;
        Producer.upgradeLevel = upgradeLevel;
        Producer.chloroplast = chloroplast;

        switch (upgradeLevel) {
            case 2:
                processTime = 2000;
                break;
            case 3:
                processTime = 1000;
                break;
            default:
                processTime = 5000;
                break;
        }
    }

    public int getRate() {
        return rate;
    }
    public void setRate(int rate) {
        this.rate = rate;
    }

    public void increaseUpgradeLevel() {
        upgradeLevel++;
        switch (upgradeLevel) {
            case 2:
                processTime = (int) (2000 * Game.getMultiplier());
                break;
            case 3:
                processTime = (int) (1000 * Game.getMultiplier());
                break;
            default:
                processTime = (int) (5000 * Game.getMultiplier());
                break;
        }
    }

    public int getType() {
        return type;
    }

    public static Chloroplast getChloroplast() {
        return chloroplast;
    }

    public boolean isGenerating() {
        return generating;
    }

    public void setGenerating(boolean generating) {
        this.generating = generating;
    }

    public void start() {
        startTime = System.currentTimeMillis();
        generating = true;
    }

    public boolean isFinished() {
        return System.currentTimeMillis() - startTime <= processTime;
    }

    abstract void generate();

    abstract boolean canGenerate();

}
