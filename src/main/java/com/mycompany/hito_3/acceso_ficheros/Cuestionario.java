/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hito_3.acceso_ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

/**
 *
 * @author valdi
 */
public class Cuestionario {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        //contador de puntos
        float cont = 0;
        
        //sistema de entrada
        Scanner sc2= new Scanner(System.in);
        
        //Lista para guardar los números que han salido
        ArrayList<Integer> pr = new ArrayList<>(9);
        
        // Lineas de ficheros
        String line;
        String line2;
      
    for(int i=0; i<10 ; i++){
        //acceso a los ficheros del cuestionario
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\valdi\\OneDrive\\Documentos\\NetBeansProjects\\hito_3\\target\\classes\\com\\mycompany\\hito_3\\acceso_ficheros\\preguntas.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\valdi\\OneDrive\\Documentos\\NetBeansProjects\\hito_3\\target\\classes\\com\\mycompany\\hito_3\\acceso_ficheros\\respuestas.txt"));
        
        //numero al azar
        int n = (int)(Math. random()*10);
            
        //mientras que el número random ya haya saido, vuelve a salir un número nuevo
                while(pr.contains(n)){
                    n = (int)(Math. random()*10);
                }
        
        //bucle para llegar a la pregunta seleccionada
        for(int j=0; j<n ;j++){
            br.readLine();
            br2.readLine();
        }
            
        //Se lee la linea del cuestionario y se pinta
            line= br.readLine();
            line2= br2.readLine();
            
            System.out.println(n+1+" "+line);
     
        //Se escribe la respuesta
            String respuesta = sc2.next();

            
        //Si coincide la respuesta introducida con el texto del archivo de respuestas puntua y si no, resta
            if(!toLowerCase(respuesta).equals(line2)){
                cont-=0.5f;
                System.out.println("Mal "+cont);
            }else{
                cont+=1;
                System.out.println("Acierto "+cont);
            }
            
        //añadimos el número aleatorio a la lista
        pr.add(n);
    }    
    
        //comprobamos el valor del contador
        if(cont>=5){
            System.out.println("Has aprobado: "+cont+" puntos." );
        }else{
            System.out.println("Has suspendido: "+cont+" puntos.");
        }
    }
}
