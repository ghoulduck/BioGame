public class Chloroplast {
    private int glucose;
    private int oxygen;
    private int hydrogen;
    private int sun;
    private int co2;
    private ProducerListEnhanced producers;

    public Chloroplast() {
        this.glucose = 0;
        this.oxygen = 0;
        this.hydrogen = 0;
        this.sun = 0;
        this.co2 = 0;
    }

    public int getGlucose() {
        return glucose;
    }

    public void setGlucose(int glucose) {
        this.glucose = glucose;
    }

    public int getOxygen() {
        return oxygen;
    }

    public void setOxygen(int oxygen) {
        this.oxygen = oxygen;
    }

    public int getHydrogen() {
        return hydrogen;
    }

    public void setHydrogen(int hydrogen) {
        this.hydrogen = hydrogen;
    }

    public int getSun() {
        return sun;
    }

    public void setSun(int sun) {
        this.sun = sun;
    }

    public int getCo2() {
        return co2;
    }

    public void setCo2(int co2) {
        this.co2 = co2;
    }

    public void updateValues() {
        for (int i = 0; i < producers.size(); i++) {
            Producer producer = producers.get(i);

        }
    }
}
