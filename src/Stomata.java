public class Stomata extends Producer {
    private static int numStomata = 0;
    protected static int upgradeLevel;

    public Stomata(int rate, int upgradeLevel, Chloroplast chloroplast) {
        super(rate, upgradeLevel, chloroplast);
        this.setUpgradeLevel(upgradeLevel);
        this.setRate(rate);
        numStomata++;
    }

    public static int getNumStomata() {
        return numStomata;
    }

    public void setUpgradeLevel(int upgradeLevel) {
        Stomata.upgradeLevel = upgradeLevel;
    }

    public int getUpgradeLevel() {
        return Stomata.upgradeLevel;
    }


    public void generate() {
        // this.start();

        while (true) {
            if (isFinished()) {
                setGenerating(false);
                break;
            }
        }

        Chloroplast chloroplast = Stomata.getChloroplast();
        chloroplast.setCo2(chloroplast.getCo2() + getRate());
    }

    public boolean canGenerate() {
        return isGenerating();
    }

    @Override
    public String toString() {
        return "Rate: " + this.getRate() + " Upgrade Level: " + this.getUpgradeLevel();
    }
}