public class Wanderer extends Player {
    public Wanderer(int x, int y, String n) {
        super(x, y, n);
    }

    @Override
    public void move(int maxX, int maxY) {
        if (yLoc < maxY - 1) {
            yLoc += 1;
        } else if (xLoc < maxX - 1) {
            xLoc += 1;
        }
    }
}
