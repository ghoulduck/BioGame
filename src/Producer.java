public abstract class Producer {
    private int rate;
    private int upgradeLevel;
    private int seconds;

    public Producer(int rate, int upgradeLevel) {
        this.upgradeLevel = upgradeLevel;
    }

    public int getRate() {
        return rate;
    }
    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getUpgradeLevel() {
        return upgradeLevel;
    }

    public void setUpgradeLevel(int upgradeLevel) {
        this.upgradeLevel = upgradeLevel;
    }

    public void increaseUpgradeLevel() {
        upgradeLevel++;
    }

}
