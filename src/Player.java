public class Player {
    // attrb
    private int xLoc;
    private int yLoc;
    private int health;
    private String name;
    private int attackDamage;
    private int attackRange;

    public Player(int x, int y, String n) {
        // Please implement this
        this.xLoc = x;
        this.yLoc = y;
        this.health = 1;
        this.name = n;
        this.attackDamage = 1;
        this.attackRange = 1;

    }

    public void print() {
        // Please implement this
        System.out.print(this.name.charAt(0)); // charAt -> choose the letter in first array
    }

    public String getName() {
        // Please implement this
        return this.name;
    }

    public void move(int maxX, int maxY) {
        // Please implement this
        if (xLoc < maxX - 1) {
            this.xLoc = xLoc + 1;
        } else if (xLoc == maxX - 1)
            this.yLoc = yLoc - 1;

    }

    public boolean isAlive() {
        // Please implement this
        if (this.health == 0) {
            return false;
        } else
            return true;
    }

    public boolean isAt(int i, int j) {
        // Please implement this
        if (this.xLoc == i && this.yLoc == j) {
            return true;
        } else
            return false;
    }

    public void getAt() {
        System.out.print(xLoc + "," + yLoc);
    }

    public int getAtkDmg() {
        return this.attackDamage;
    }

    public int getAtkRange() {
        // use int distance = Math.abs(x1-x0) + Math.abs(y1-y0);
        // manhattan
        return this.attackRange;
    }
}