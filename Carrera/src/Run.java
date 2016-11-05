/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leslie Callejas
 */
public class Run {
   
    static Animal Liebre;
    static Animal Tortuga;

    public static void main(String arg[]) throws InterruptedException {
        Liebre = new Animal(8, " Liebre");
        Tortuga = new Animal(10, " Tortuga");
        Tortuga.start();
        Liebre.start();
    }
}

