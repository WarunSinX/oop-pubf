/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Test playOneRound() Expected output: | | | | | | | | | | | | | | | | | | | |
 * | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |
 * | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |
 * | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |
 * 
 * Player: Oak Player: Bb Player: Cc Player: dd | | | | | | | | | | | | | | | |
 * | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |
 * | | | |O| | | | | | | | | | | | | | | | | | | | | | | | | | | |B| | | | | | |
 * | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |C| |
 * 
 * Player: Oak Player: Bb Player: Cc Player: dd | | | | | | | | | | | | | | | |
 * | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |
 * | | | |O| | | | | | | | | | | | | | | | | | | | | | | | | | | |B| | | | | | |
 * | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | | |
 */
public class Test7 {
        public static void main(String[] args) {
                Player[] players = {};
                BattleField f = new BattleField(10, 12);
                PUBFGame g = new PUBFGame(f, players);
                g.playOneRound();

                Player[] players2 = { new Player(2, 5, "Oak"), new Player(9, 6, "Bb"), new Player(7, 11, "Cc"),
                                new Player(6, 11, "dd") };
                g = new PUBFGame(f, players2);
                g.playOneRound();

                Player[] players3 = { new Player(2, 5, "Oak"), new Player(9, 6, "Bb"), new Player(8, 11, "Cc"),
                                new Player(9, 10, "dd") };
                g = new PUBFGame(f, players3);
                g.playOneRound();

        }

}
