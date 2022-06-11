/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hito_3.override_overload;

/**
 *
 * @author valdi
 */

public class Main {
    public static void main(String[] args) {
    Jugador jugador = new Jugador();
    jugador.jugar();
    
    Futbolista futbolista= new Futbolista();
    futbolista.jugar();
    
        System.out.println("------------------");
        
    String sinsobrecarga = futbolista.entrenar();
    System.out.println(sinsobrecarga);    
    
    String sobrecarga1 = futbolista.entrenar("Madrid");
    System.out.println(sobrecarga1);
    
    String sobrecarga2 = futbolista.entrenar("Barcelona","lunes");
    System.out.println(sobrecarga2);
    
    String sobrecarga3 = futbolista.entrenar("Valencia","martes", "Ramón");
    System.out.println(sobrecarga3);
    
    
    }
}
