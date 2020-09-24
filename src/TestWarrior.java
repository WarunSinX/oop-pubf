/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Test Warrior, expected output: Player: Normal Player: War | | | | | | | | | |
 * | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |
 * |N| | | | | | | | | | |W| | | | | | | | | | | | | | | | | | | | | | | | | | |
 * | | | | | | | | | | | | | | | | | | | | | |
 * 
 * | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |
 * | | | | | | | | | | | | | | | | | | | | | | |W| | | | | | | | | | | | | | | |
 * | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |
 */
public class TestWarrior {

    public static void main(String[] args) {

        Player[] players = { new Player(5, 4, "Normal"), new Warrior(5, 5, "War") };
        BattleField f = new BattleField(10, 10);
        PUBFGame g = new PUBFGame(f, players);
        g.phase4PrintBattleField();
        g.playOneRound();

    }
}
