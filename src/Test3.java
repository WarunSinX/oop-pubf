/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Test BattleField's methods Expected output: Testcase passes!
 */
public class Test3 {
    public static void main(String[] args) {
        BattleField b = new BattleField(10, 15);
        if (b.getMaxX() == 10 && b.getMaxY() == 15)
            System.out.println("Testcase passes!");
        else
            System.out.println("Testcase fails");
    }

}
