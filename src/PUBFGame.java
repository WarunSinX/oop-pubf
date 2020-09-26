import java.util.ArrayList;

public class PUBFGame {
    private Player[] players;
    private BattleField battleField;

    public PUBFGame(BattleField f, Player[] p) {
        // Please implement this
        this.battleField = f;
        this.players = p;

        for (Player player : players) {
            System.out.println("Player: " + player.getName());
        }
    }

    public void play(int maxNumRounds) {
        // Please implement this
        int check = 0;
        for (int i = 1; i <= maxNumRounds; i++) {
            check = 0;
            for (int j = 0; j < players.length; j++) {
                if (players[j].isAlive())
                    check++;
            }
            // check the players that alive.
            if (check == 1) { // if check more than 0 its mean have players alive.
                break;
            } else if (check > 1) {
                System.out.println("Round " + i);
                this.playOneRound();
            } else {
                System.out.println("There is no winner!");
                break;
            }

        }

        for (int k = 0; k < players.length; k++) {
            if (players[k].isAlive()) {
                System.out.println("The winner is " + players[k].getName() + "!");
            }
        }
    }

    public boolean playOneRound() {
        phase1PlayersTakeAction();
        phase2PlayersMove();
        phase3RemoveInvalidPlayers();
        phase4PrintBattleField();
        return phase5Gameover();
    }

    protected void phase1PlayersTakeAction() {
        // Please implement this
        // start check around in each player.
        // use int distance = Math.abs(x1-x0) + Math.abs(y1-y0);
        int distance;
        for (int i = 0; i < players.length; i++) {
            if (players[i].isAlive()) {
                for (int j = 0; j < players.length; j++) {
                    if (i != j) {
                        if (players[j].isAlive()) {
                            distance = Math.abs(players[j].getX() - players[i].getX())
                                    + Math.abs(players[j].getY() - players[i].getY());
                            // get distance to check with atkRange to check that can shoot or not?
                            if (players[i].getAtkRange() >= distance) {
                                // setHealth the player[j] that was shooted by player[i]
                                players[j].setHealth(players[i].getHealth() - players[j].getAtkDmg());
                            }
                        }
                    }
                }
            }
        }
        // alive players can shoot , Dead can't
    }

    protected void phase2PlayersMove() {
        // Please implement this
        for (int i = 0; i < players.length; i++) {
            if (players[i].isAlive()) {
                players[i].move(battleField.getMaxX(), battleField.getMaxY());
            }
        }
    }

    protected void phase3RemoveInvalidPlayers() {
        // Please implement this

        ArrayList<Integer> stupidPlayerIndex = new ArrayList<Integer>();

        for (int i = 0; i < players.length; i++) {
            for (int j = i; j < players.length - 1; j++) {
                if (players[i].isAlive() && players[j + 1].isAlive()) {
                    if (players[i].getX() == players[j + 1].getX() && players[i].getY() == players[j + 1].getY()) {
                        stupidPlayerIndex.add(i);
                        stupidPlayerIndex.add(j + 1);
                    }
                }
            }
        }

        for (int i = 0; i < stupidPlayerIndex.size(); i++) {
            players[stupidPlayerIndex.get(i)].setHealth(0);
        }
    }

    protected void phase4PrintBattleField() {
        for (int j = 0; j < battleField.getMaxY(); j++) {
            System.out.print("|");
            for (int i = 0; i < battleField.getMaxX(); i++) {
                boolean havePlayer = false;
                for (Player p : players) {
                    if (p.isAlive() && p.isAt(i, j)) {
                        p.print();
                        havePlayer = true;
                    }
                }
                if (!havePlayer)
                    System.out.print(" |");
                else
                    System.out.print("|");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    protected boolean phase5Gameover() {
        // Please implement this
        int countPL = 0;
        for (int i = 0; i < players.length; i++) {
            if (players[i].isAlive()) {
                countPL++;
            }
        }
        if (countPL == 1 || countPL == 0)
            return true;
        else
            return false;
    }
}
