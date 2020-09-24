/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Test simple play() Expected output: Round 1 | | | | | | | | | | | | | | | | |
 * | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |
 * | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |
 * | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |
 * 
 * There is no winner! Player: Bb Player: dd Round 1 | | | | | | | | | | | | | |
 * | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |
 * | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |B| | | | |
 * | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |d| |
 * |
 * 
 * Round 2 | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |
 * | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |
 * | | | | | | | | | | | | | | | | | | | | | | | |B| | | | | | | | | | | | | | |
 * | | | | | | | | | | | | | | | | |d| |
 * 
 * Round 3 | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |
 * | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |
 * | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |B| | | |
 * | | | | | | | | | | | | | | | | | |d|
 * 
 * Round 4 | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |
 * | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |
 * | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |
 * | | | | | | |B| | | | | | | | | | |d|
 * 
 * Round 5 | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |
 * | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |
 * | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |
 * | | | | | | | | | | | | | | | | | |B|
 * 
 * The winner is Bb
 */
public class Test8 {
    public static void main(String[] args) {
        Player[] players = {};
        BattleField f = new BattleField(10, 12);
        PUBFGame g = new PUBFGame(f, players);
        g.play(10);

        Player[] players2 = { new Player(9, 6, "Bb"), new Player(6, 11, "dd") };
        g = new PUBFGame(f, players2);
        g.play(10);

    }

}
