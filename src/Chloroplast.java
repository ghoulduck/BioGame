public class Chloroplast {
    private int glucose;
    private int oxygen;
    private int hydrogen;
    private int sun;
    private int co2;
    private int water;
    private ProducerListEnhanced producers;

    public Chloroplast() {
        glucose = 6;
        oxygen = 0;
        hydrogen = 0;
        sun = 0;
        co2 = 0;
        water = 0;
        producers = new ProducerListEnhanced();
    }

    public synchronized int getGlucose() {
        return glucose;
    }

    public synchronized void setGlucose(int glucose) {
        this.glucose = glucose;
    }

    public synchronized int getOxygen() {
        return oxygen;
    }

    public synchronized void setOxygen(int oxygen) {
        this.oxygen = oxygen;
    }

    public synchronized int getHydrogen() {
        return hydrogen;
    }

    public synchronized void setHydrogen(int hydrogen) {
        this.hydrogen = hydrogen;
    }

    public synchronized int getSun() {
        return sun;
    }

    public synchronized void setSun(int sun) {
        this.sun = sun;
    }

    public synchronized int getCo2() {
        return co2;
    }

    public synchronized void setCo2(int co2) {
        this.co2 = co2;
    }

    public ProducerListEnhanced getProducers() {
        return producers;
    }

    public void setProducers(ProducerListEnhanced producers) {
        this.producers = producers;
    }

    public synchronized int getWater() {
        return water;
    }

    public synchronized void setWater(int water) {
        this.water = water;
    }

    public void addToProducers(Producer p) {
        producers.add(p);
    }

    public void iterateProducers() {
        for (int i = 0; i < producers.size(); i++) {
            Producer p = producers.get(i);
            if (p.canGenerate()) {
                GenerateTask task = new GenerateTask(p);
                task.start();
            }
        }
    }

    public String toString() {
        return "Glucose: " + glucose + "\nOxygen: " + oxygen + "\nHydrogen: " + hydrogen + "\nSun: " + sun + "\nCo2: " + co2 + "\nWater: " + water + "\nNum Pigments: " + Pigment.getNumPigments() + "\nNum Roots: " + Root.getNumRoots() + "\nNum Stomata: " + Stomata.getNumStomata() + "\nNum Stroma: " + Stroma.getNumStroma() + "\nNum Thylakoids: " + Thylakoid.getNumThylakoids() + "\n";
    }

    public synchronized void buy(String p) {
        if (glucose >= 6) {
            switch (p.toLowerCase()) {
                case "thylakoid":
                    this.addToProducers(new Thylakoid(Game.getRate(), Thylakoid.upgradeLevel, true));
                    glucose -= 6;
                    return;
                case "stroma":
                    this.addToProducers(new Stroma(Game.getRate(), Stroma.upgradeLevel, false));
                    glucose -= 6;
                    return;
                case "pigment":
                    this.addToProducers(new Pigment(Game.getRate(), Pigment.upgradeLevel, this));
                    glucose -= 6;
                    return;
                case "stomata":
                    this.addToProducers(new Stomata(Game.getRate(), Stomata.upgradeLevel, this));
                    glucose -= 6;
                    return;
                case "root":
                    this.addToProducers(new Root(Game.getRate(), Stomata.upgradeLevel, this));
                    glucose -= 6;
                    return;
            }
        }
    }
}