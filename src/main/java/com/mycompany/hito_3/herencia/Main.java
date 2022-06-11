/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hito_3.herencia;

/**
 *
 * @author valdi
 */
public class Main {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("Jorge", "Pérez", "Alcudia", 14, "3ºA", 7.85f);
        Profesor profesor = new Profesor("Alma", "Teruel", "Toledano", 34, "Matemáticas");
        
        alumno.mostrarDatos();
        
        System.out.println("--------------------------------");
        
        profesor.mostrarDatos();
    }
}
