/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Test Sniper, expected output: Player: Normal Player: Sniper | | | | | | | | |
 * | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |
 * | |N| | | | | | | | | | | | | | | | | | | | | |S| | | | | | | | | | | | | | |
 * | | | | | | | | | | | | | | | | | | | | | | |
 * 
 * | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |
 * | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |S| | | | |
 * | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |
 */
public class TestSniper {

    public static void main(String[] args) {

        Player[] players = { new Player(5, 4, "Normal"), new Sniper(5, 6, "Sniper") };
        BattleField f = new BattleField(10, 10);
        PUBFGame g = new PUBFGame(f, players);
        g.phase4PrintBattleField();
        g.playOneRound();

    }
}
