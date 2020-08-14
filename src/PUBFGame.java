public class PUBFGame {
    private Player[] players;
    private BattleField battleField;

    public PUBFGame(BattleField f, Player[] p, int numPlayers) {
        // Please implement this
    }

    public void play(int maxNumRounds) {
        // Please implement this
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
    }
}