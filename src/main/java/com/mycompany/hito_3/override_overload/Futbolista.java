/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hito_3.override_overload;

/**
 *
 * @author valdi
 */
public class Futbolista extends Jugador{
    
    
    @Override
    public void jugar(){ //override - sobreescritura del mÃ©todo con el mismo nombre que proviene de su padre Jugador
        System.out.println("El futbolista esta jugando");
    }
    
    public String entrenar(){ //método que se sobrecargará más adelante
        return "estoy entrenando";
    }
     
    public String entrenar(String lugar){
        return "estoy entrenando en "+lugar;
    }
    
    public String entrenar(String lugar, String dia){ 
        return "Estoy entrenando en "+lugar+ " el "+dia;
    }
    
    public String entrenar(String lugar, String dia, String personal){ //método sobrecargado. Se añaden parámetros al método.  Overload - sobrecarga
        return "Estoy entrenando en "+lugar+ " el "+dia + " con "+personal;
    }
}
