public class ProducerList {
    private Producer[] thylakoids = new Thylakoid[0];
    private Producer[] stroma = new Stroma[0];
    private Producer[] pigments;
    private Producer[] roots;
    private Producer[] stomata;

    // getter and setter functions
    // mainly implemented as an alternative to the ArrayList class
    // more performant???

    public Producer[] getThylakoids() {
        return thylakoids;
    }

    // custom implementation of an ArrayList - esque function
    public void addThylakoid(int rate, int level) {

        // checks if there is already an empty spot
        for (int i = 0; i < thylakoids.length; i++) {
            if (thylakoids[i] == null) {
                thylakoids[i] = new Thylakoid(rate, level, false);
                return;
            }
        }

        // if not adds another spot
        Producer[] temp = new Thylakoid[thylakoids.length + 1];
        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1) {
                temp[i] = new Thylakoid(rate, level,false);
                break;
            }
            temp[i] = thylakoids[i];
        }
        thylakoids = temp;
    }

    // yet to implement the rest as I still have to code in the objects

    public Producer[] getStroma() {
        return stroma;
    }

    public void addStroma(int rate, int level) {

        // checks if there is already an empty spot
        for (int i = 0; i < stroma.length; i++) {
            if (stroma[i] == null) {
                stroma[i] = new Stroma(rate, level, false);
                return;
            }
        }

        // if not adds another spot
        Producer[] temp = new Stroma[stroma.length + 1];
        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1) {
                temp[i] = new Stroma(rate, level, false);
                break;
            }
            temp[i] = stroma[i];
        }
        stroma = temp;
    }

    public Producer[] getPigments() {
        return pigments;
    }

    public void addPigment(int rate, int level) {

        // checks if there is already an empty spot
        for (int i = 0; i < pigments.length; i++) {
            if (pigments[i] == null) {
                pigments[i] = new Pigment(rate, level);
                return;
            }
        }

        // if not adds another spot
        Producer[] temp = new Pigment[pigments.length + 1];
        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1) {
                temp[i] = new Pigment(rate, level);
                break;
            }
            temp[i] = pigments[i];
        }
        pigments = temp;
    }

    public Producer[] getRoots() {
        return roots;
    }

    public void addRoot(int rate, int level) {

        // checks if there is already an empty spot
        for (int i = 0; i < roots.length; i++) {
            if (roots[i] == null) {
                roots[i] = new Root(rate, level);
                return;
            }
        }

        // if not adds another spot
        Producer[] temp = new Root[roots.length + 1];
        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1) {
                temp[i] = new Root(rate, level);
                break;
            }
            temp[i] = roots[i];
        }
        roots = temp;
    }

    public Producer[] getStomata() {
        return stomata;
    }

    public void addStomata(int rate, int level) {

        // checks if there is already an empty spot
        for (int i = 0; i < stomata.length; i++) {
            if (stomata[i] == null) {
                stomata[i] = new Stomata(rate, level);
                return;
            }
        }

        // if not adds another spot
        Producer[] temp = new Stomata[stomata.length + 1];
        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1) {
                temp[i] = new Stomata(rate, level);
                break;
            }
            temp[i] = stomata[i];
        }
        stomata = temp;
    }
}