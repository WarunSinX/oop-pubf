/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Test Wanderer, expected output: Player: Wan | | | | | | | | | | | | | | | | |
 * | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |
 * | | | | | | | | | | | | | | | |W| | | | | | | | | | | | | | | | | | | | | | |
 * | | | | | | | | | | | | | | |
 */
public class TestWanderer {

    public static void main(String[] args) {

        Player[] players = { new Wanderer(5, 5, "Wan") };
        BattleField f = new BattleField(10, 10);
        PUBFGame g = new PUBFGame(f, players);
        g.phase2PlayersMove();
        g.phase4PrintBattleField();

    }
}
