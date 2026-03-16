public class Chloroplast {
    private int glucose;
    private int oxygen;
    private int hydrogen;
    private int sun;
    private int co2;
    private int water;
    private ProducerListEnhanced producers;
    private ThreadListEnhanced producersThread;

    public Chloroplast() {
        glucose = 0;
        oxygen = 0;
        hydrogen = 0;
        sun = 0;
        co2 = 0;
        water = 0;
        producers = new ProducerListEnhanced();
        producersThread = new ThreadListEnhanced();
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

    public void addToProducers(Producer p) {
        GenerateTask task = new GenerateTask(p);
        producers.add(p);
        producersThread.add(task);
        task.start();
        // producersThread.get(producersThread.size() - 1).start();
    }

    public void iterateProducers() {
        for (int i = 0; i < producers.size(); i++) {
            GenerateTask g = producersThread.get(i);
            Producer p = producers.get(i);
        }
    }

    public String toString() {
        return "Glucose: " + glucose + "\nOxygen: " + oxygen + "\nHydrogen: " + hydrogen + "\nSun: " + sun + "\nCo2: " + co2 + "\nWater: " + water + "\nNum Pigments: " + Pigment.getNumPigments() + "\nNum Roots: " + Root.getNumRoots() + "\nNum Stomata: " + Stomata.getNumStomata() + "\nNum Stroma: " + Stroma.getNumStroma() + "\nNum Thylakoids: " + Thylakoid.getNumThylakoids() + "\n";
    }

    public boolean buy(String p) {
        if (glucose > 6) {
            switch (p.toLowerCase()) {
                case "thylakoid":
                    this.addToProducers(new Thylakoid(Game.getRate(), Thylakoid.upgradeLevel, true));
                    return true;
                case "stroma":
                    this.addToProducers(new Stroma(Game.getRate(), Stroma.upgradeLevel, false));
                    return true;
                case "pigment":
                    this.addToProducers(new Pigment(Game.getRate(), Pigment.upgradeLevel, this));
                    return true;
                case "stomata":
                    this.addToProducers(new Stomata(Game.getRate(), Stomata.upgradeLevel, this));
                    return true;
                case "root":
                    this.addToProducers(new Root(Game.getRate(), Stomata.upgradeLevel, this));
                    return true;
                default:
                    return false;
            }
        } else {
            return false;
        }
    }
}