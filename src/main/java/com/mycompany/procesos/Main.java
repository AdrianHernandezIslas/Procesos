/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.procesos;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author adrian
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Queue<Proceso> colaProcesos = new LinkedList<>();
        
        colaProcesos.add(new Proceso(1));
        colaProcesos.add(new Proceso(2));
        colaProcesos.add(new Proceso(3));
        colaProcesos.add(new Proceso(4));
        colaProcesos.add(new Proceso(5));
        
        Consumer consumer = new Consumer(colaProcesos);
        
        consumer.start();
        
        System.out.println("DESPUES DE EJECUTAR EL CONSUMER");
    }
}
