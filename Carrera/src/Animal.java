/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leslie Callejas
 */
class Animal extends Thread {

    String Nombre;
    int Velocidad;

    public Animal(int V, String N) {
        Nombre = N;
        Velocidad = V;
    }

    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.print(Nombre);
            try {
                Thread.sleep(700 / Velocidad);
            } catch (Exception e) {;
            }
        }
        System.out.println("\n" + Nombre + " ha llegado a la meta ");
    }
    
}
