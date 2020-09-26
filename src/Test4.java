/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Test phase5Gameover() Expected output: Player: Oak Player: Oak Player: Bb
 * Pass!
 */
public class Test4 {
    public static void main(String[] args) {
        Player[] players = {};
        BattleField f = new BattleField(10, 12);
        PUBFGame g = new PUBFGame(f, players);
        if (!g.phase5Gameover()) {
            System.out.println("Fail1!");
            return;
        }

        Player[] players2 = { new Player(1, 2, "Oak") };
        g = new PUBFGame(f, players2);
        if (!g.phase5Gameover()) {
            System.out.println("Fail2!");
            return;
        }
        Player[] players3 = { new Player(1, 2, "Oak"), new Player(2, 2, "Bb") };
        g = new PUBFGame(f, players3);
        if (g.phase5Gameover()) {
            System.out.println("Fail3!");
            return;
        }

        System.out.println("Pass!");

    }

}
