/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Test phase3RemoveInvalidPlayers() Expected output: Player: Oak Player: Bb
 * Player: Cc Player: Ddd Player: Eee Player: FF | | | | | | | | | | | | | | | |
 * | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |
 * | | | | | | | | | | | | | | | | | | | | |B| | | | | | | | | | | | | | | | | |
 * | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |
 */
public class Test6 {
    public static void main(String[] args) {
        Player[] players = {};
        BattleField f = new BattleField(10, 12);
        PUBFGame g = new PUBFGame(f, players);
        g.phase3RemoveInvalidPlayers();

        Player[] players2 = { new Player(2, 5, "Oak"), new Player(9, 6, "Bb"), new Player(7, 11, "Cc"),
                new Player(7, 11, "Ddd"), new Player(7, 11, "Eee"), new Player(2, 5, "FF") };
        g = new PUBFGame(f, players2);
        g.phase3RemoveInvalidPlayers();
        g.phase4PrintBattleField();

    }

}
