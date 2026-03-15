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

    public int getType() {
        return type;
    }

    public Chloroplast getChloroplast() {
        return chloroplast;
    }
    private void start() {
        startTime = System.currentTimeMillis();
    }

    private boolean end() {
        return System.currentTimeMillis() - startTime <= processTime;
    }

    abstract void generate();

    abstract boolean canGenerate();

}
