/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webgallery;

import java.io.*;
import java.util.*;

/**
 *
 * @author Estudiante
 */
public class WebGallery {
    
    private String name;
    
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("NetPar.txt");
        PrintStream out = new PrintStream(f);
        out.println("WebGallery");
        out.println("Registro");
        out.println("Para registarse coloque los siguientes datos:");
        out.println("Nombre");
        out.println(" ");
        out.println("Apellido");
        out.println(" ");
        out.println("Si es artista coloque los siguientes datos:");
        out.println("Informacion de Curriculum");
        out.println(" ");
        out.println("Distinciones Obtenios:");
        out.println(" ");
        Scanner input = new Scanner(f);
        process(input);
    }
    public static void process(Scanner input){
        while(input.hasNext())    
            if(input.nextLine()== ("Nombre")){
                String n = input.nextLine();
                String Nombre = input.nextLine();
                System.out.println(n);
                System.out.println(Nombre);
        }
    }
}
