/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hito_3.herencia;

/**
 *
 * @author valdi
 */
public class Profesor extends Persona{
    private String asignatura;

    
    //constructor
    public Profesor(String nombre, String apellido1, String apellido2, int edad, String asignatura) {
        super(nombre, apellido1, apellido2, edad);
        this.asignatura = asignatura;
    }
    
    
    public void mostrarDatos(){
        System.out.println("Nomrbe y apellidos: "+getNombre()+" "+getApellido1()+" "+getApellido2()+
                "\nEdad: "+getEdad()+
                "\nAsignatura impartida: "+asignatura);
    }
}
