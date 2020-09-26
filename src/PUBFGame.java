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
        int check=0;
        for (int i = 1; i <= maxNumRounds; i++) {
            for(int j=0; j<= players.length; j++){
                players[j].isAlive();
                 check++;
            }
            //check the players that alive.    
            if (check>0) { //if check more than 0 its mean have players alive.
                System.out.println("Round " + i);
                
                
            } else {
                System.out.println("There is no winner.");
                break;
            }
            
            for (int k = 0; k < players.length; k++) {
                if (players[k].isAlive()) {
                    System.out.println(players[k].getName() + " survives!");
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
        for (int i = 0; i < players.length; i++) {
            for (int j = i; j < players.length; j++) {
                if (players[i].isAlive() && players[j + 1].isAlive()) {
                    if (players[i].getX() == players[j + 1].getX() && players[i].getY() == players[j + 1].getY()) {
                        players[i].setHealth(0);
                        players[j + 1].setHealth(0);
                    }
                }
            }
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
