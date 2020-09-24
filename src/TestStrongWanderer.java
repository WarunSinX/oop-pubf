/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Test StrongWanderer Player: Normal Player: SWan Player: War | | | | | | | | |
 * | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |
 * | | |S| | | | | | | | |W| | | | | | | | |N| | |
 * 
 * | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |
 * | | | | | | | | | | | | |S| | | | | | | | | | | | | | | | | |N| |
 */
public class TestStrongWanderer {

    public static void main(String[] args) {

        StrongWanderer sw = new StrongWanderer(5, 5, "SWan");
        Player p = new Player(5, 7, "Normal");
        Warrior w = new Warrior(5, 6, "War");
        Player[] players = { p, sw, w };
        BattleField f = new BattleField(8, 8);
        PUBFGame g = new PUBFGame(f, players);
        g.phase4PrintBattleField();
        g.playOneRound();

    }

}
