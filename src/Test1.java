/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Test player's functionality Expected output: O Player name: Oak Alive?: true
 * Is at (3,3)?: false Is at (3,3)?: true
 */
public class Test1 {
    public static void main(String[] args) {
        int maxX = 5, maxY = 8;

        int locX = 2, locY = 3;
        Player player = new Player(locX, locY, "Oak");
        player.print();
        System.out.println();
        System.out.println("Player name: " + player.getName());
        System.out.println("Alive?: " + player.isAlive());
        System.out.println("Is at (3,3)?: " + player.isAt(3, 3));
        player.move(maxX, maxY);
        System.out.println("Is at (3,3)?: " + player.isAt(3, 3));
    }
}
