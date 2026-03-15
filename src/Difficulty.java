public class Difficulty {
    private int difficultyRating;
    private final double multiplier;
    private final int rate;
    private final String name;

    public Difficulty(int difficultyRating) {
        switch(difficultyRating) {
            case 2: this.name = "Medium"; multiplier = 1; rate = 1; break;
            case 3: this.name = "Hard"; multiplier = 2; rate = 2; break;
            default: this.name = "Easy"; multiplier = .5; rate = 3; break;
        }
    }

    public double getMultiplier() {
        return multiplier;
    }

    public int getRate() {
        return rate;
    }

    public String getName() {
        return name;
    }
}
