public class Chloroplast {
    private static int glucose;
    private static int oxygen;
    private static int hydrogen;
    private static int sun;
    private static int co2;
    private static int water;
    private ProducerListEnhanced producers;

    public Chloroplast() {
        glucose = 0;
        oxygen = 0;
        hydrogen = 0;
        sun = 0;
        co2 = 0;
        this.water = 0;
    }

    public int getGlucose() {
        return glucose;
    }

    public static void setGlucose(int glucose) {
        glucose = glucose;
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

    public ProducerListEnhanced getProducers() {
        return producers;
    }

    public void setProducers(ProducerListEnhanced producers) {
        this.producers = producers;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }
}
