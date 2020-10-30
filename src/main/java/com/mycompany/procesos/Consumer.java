/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.procesos;

import java.util.Queue;

/**
 *
 * @author adrian
 */
public class Consumer extends Thread {

    private Queue<Proceso> cola;

    public Consumer(Queue<Proceso> cola) {
        this.cola = cola;
    }

    @Override
    public void run() {
        try {
            while (!cola.isEmpty()) {
                Proceso proceso = cola.remove();
                proceso.print("Esta en ejecucion");
                
                cola.peek().print("Esta en espera ....");
                int counter = 0;
                while (counter < proceso.getTimeSleep()) {
                    load(counter, proceso.getTimeSleep());
                    sleep(1000);
                    counter++;
                }
                proceso.print("Ha terminado ejecucion");

            }
        } catch (InterruptedException e) {
            System.err.println(e.getCause());
        }
    }
    
    private void load(int counter,int max){
      int a = counter * 100 / max;
      System.out.println( a+"%");
    }

}
