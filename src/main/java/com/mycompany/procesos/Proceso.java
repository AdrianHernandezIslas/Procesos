/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.procesos;

/**
 *
 * @author adrian
 */
public class Proceso{
    
    private int id;
    private int timeSleep;

    public Proceso(int id) {
        this.id = id;
        timeSleep = (int) (Math.random() * 10);
        
    }
    
    public void print(String message){
        System.out.println("El poceso "+id+" "+message);
    }

    public int getTimeSleep() {
        return timeSleep;
    } 
    
}
