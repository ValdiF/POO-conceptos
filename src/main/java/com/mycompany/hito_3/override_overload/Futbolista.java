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
    public void jugar(){ //override - sobreescritura del método con el mismo nombre que proviene de su padre Jugador
        System.out.println("El futbolista esta jugando");
    }
    
    public String entrenar(){ //m�todo que se sobrecargar� m�s adelante
        return "estoy entrenando";
    }
     
    public String entrenar(String lugar){
        return "estoy entrenando en "+lugar;
    }
    
    public String entrenar(String lugar, String dia){ 
        return "Estoy entrenando en "+lugar+ " el "+dia;
    }
    
    public String entrenar(String lugar, String dia, String personal){ //m�todo sobrecargado. Se a�aden par�metros al m�todo.  Overload - sobrecarga
        return "Estoy entrenando en "+lugar+ " el "+dia + " con "+personal;
    }
}
