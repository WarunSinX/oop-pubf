/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Test phase2PlayersMove() Expected output: Player: Oak Player: Bb Player: Cc |
 * | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |
 * | | | | | | | | | | | | | | | | | | |O| | | | | | | | | | | | | | | | | | | |
 * | | | | | | | |B| | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |
 * | | | | | | | | | | | |C| |
 * 
 */
public class Test5 {
    public static void main(String[] args) {
        Player[] players = {};
        BattleField f = new BattleField(10, 12);
        PUBFGame g = new PUBFGame(f, players);
        g.phase2PlayersMove();

        Player[] players2 = { new Player(2, 5, "Oak"), new Player(9, 6, "Bb"), new Player(7, 11, "Cc") };
        g = new PUBFGame(f, players2);
        g.phase2PlayersMove();
        g.phase4PrintBattleField();

    }

}
