/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios.clasefile;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class main {
    public static void main(String[] args){
        for (String s : args) {
            String fichero = s;
            File f = new File(fichero);

            if (f.exists() == true) {
                if(f.isFile() == true) {
                    System.out.println("Existe y es un fichero");
                } else {
                    System.out.println("Existe y es un directorio");
                    menuDirectorio(f);
                }
            } else {
                System.out.println("No se encuentra el fichero");
            }
        }
    }
    
    public static void menuDirectorio (File f) {
        Scanner scanner = new Scanner(System.in);
        String[] directorio = f.list();
        File[] contenido = f.listFiles();
        int x = 1;
        
        while (x != 0) {
            System.out.println("0 para salir" + '\n' 
                    + "1 para listar contenido" + '\n' 
                    + "2 para listar recursivamente");
            x = scanner.nextInt();
            
            switch (x) {
                case 1:
                    for (int i=0; i < directorio.length; i++) {
                        System.out.println(directorio[i]);  
                    }
                    break;
                case 2:
                    contRec(contenido);
                    break;
            }
        }
    }
    
    // Seguir con la recursividad
    public static void contRec(File[] contenido) {
        for (int i=0; i < contenido.length; i++) {
            if (contenido[i].isFile()) {
                System.out.println(contenido[i]);
            }
        }
    }
    
    public static void menuArchivo (File f) {
        Scanner Scanner = new Scanner(System.in);
        String[] contenido = f.list();
        int x = 1;
        
        while (x != 0) {
            System.out.println("0 para salir" + '\n' 
                    + "1 para listar contenido" + '\n' 
                    + "2 para listar recursivamente");
            x = Scanner.nextInt();
            
            switch (x) {
                case 1:
                    for (int i=0; i < contenido.length; i++) {
                        System.out.println(contenido[i]);  
                    }
                break;
            }
        }
    }
    
}
