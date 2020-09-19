public class PUBFGame {
    private Player[] players;
    private BattleField battleField;

    public PUBFGame(BattleField f, Player[] p) {
        // Please implement this
        this.battleField = f;
        this.players = p;

    }

    // maxNumRounds is another class for num the round.
    // not finished will be up to date.
    public void play(int maxNumRounds) {
        // Please implement this
        for (int i = 1; i <= maxNumRounds; i++) {
            if (players[0].isAlive()) { // in if about the game is not over yet.(all player is alive)
                System.out.println("Round " + i);
                // players[i].isAlive() AJ. told that player 1 will always to win. So not to
                // loop for find all players that alive.
            } else {
                System.out.println("There is no winner.");
                break;
            }
            for (int j = 0; j < players.length; j++) {
                if (players[j].isAlive()) {
                    System.out.println(players[j].getName() + " survives!");
                }
            }

        }
    }

    public boolean playOneRound() {
        phase1PlayersTakeAction();
        phase2PlayersMove();
        phase3RemoveInvalidPlayers();
        phase4PrintBattleField();
        return phase5FindWinner();
    }

    protected void phase1PlayersTakeAction() {
        // Please implement this

        // start check around in each player.

        // alive players can shoot , Dead can't
    }

    protected void phase2PlayersMove() {
        // Please implement this
    }

    protected void phase3RemoveInvalidPlayers() {
        // Please implement this
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

    protected boolean phase5FindWinner() {
        // Please implement this
        int countPL = 0;
        for (int i = 0; i < players.length; i++) {
            if (players[i].isAlive()) {
                countPL++;
            }
        }
        if (countPL == 1 || countPL == 0)
            return false;
        else
            return true;
    }
}