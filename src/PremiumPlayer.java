public class PremiumPlayer extends Player {
    public PremiumPlayer(int x, int y, String n) {
        super(x, y, n);
    }

    @Override
    public String getName() {
        return this.name + "¬__¬";
    }
}
