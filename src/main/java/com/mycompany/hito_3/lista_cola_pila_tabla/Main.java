/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hito_3.lista_cola_pila_tabla;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author valdi
 */
public class Main {
    public static void main(String[] args) {
    
        Stack <Integer> pila = new Stack();
        
        for(int x=1; x<=5; x++){
            // elemento que añadimos
            System.out.println("Se introduce el elemento "+pila.push(x)+" en la pila");
            
        }

        System.out.println("\nLos elementos de la pila son: "+pila+"\n");
        
        while (!pila.empty()){
            // elemento que extraemos
        System.out.println("Se elimina el elemento "+pila.pop()+" de la pila"); 
        }
    
        
        System.out.println("------------------------------");
        
        Queue<Integer> cola = new LinkedList();
        
        for(int y=1; y<=5; y++){
            // elemento que añadimos
            cola.offer(y);
            System.out.println("Se introduce el elemento "+y+" en la cola");
            
        }
        
        System.out.println("\nLos elementos de la cola son: "+cola+"\n");
        
        while (!cola.isEmpty()){
            // elemento que extraemos
        System.out.println("Se elimina el elemento "+cola.poll()+" de la cola"); 
        
        }
        
        
        System.out.println("------------------------------");
        
        String [] columna = {"Nombre", "Apellidos", "Edad", "Profesión"};
        String [][] fila = {
            {"Alma", "Teruel Toledano", "34", "Profesora"},
            {"Jorge", "Pérez Alcudia", "14", "Estudiante"}
        };
        DefaultTableModel modelo = new DefaultTableModel(fila, columna);
        JTable tabla = new JTable(modelo);
        JScrollPane scroll = new JScrollPane(tabla);
        JFrame ventana = new JFrame();
        
        
        scroll.setBounds(50,50,500,250);
        
        ventana.setLayout(null);
        ventana.setSize(500, 500);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.add(scroll);
        ventana.setVisible(true);
        
        System.out.println("------------------------------");
        
        List lista = new ArrayList();
        Random random = new Random();
        
        for(int b=1; b<=5; b++){
            // elemento que añadimos
            lista.add(b);
            System.out.println("Se introduce el elemento "+b+" en la lista");
            
        }
        
        System.out.println("\nLos elementos de la lista son: "+lista+"\n");
        
            // Extraemos un número al azar 
        System.out.println("Se elimina el elemento "+lista.remove(random.nextInt(5))+" de la lista"); 
        
        System.out.println("\nLos elementos de la lista ahora son: "+lista);

    }
}
