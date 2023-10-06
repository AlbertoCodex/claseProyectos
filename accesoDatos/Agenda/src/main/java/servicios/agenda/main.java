/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios.agenda;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class main {
    
    public static void main(String[] args) throws IOException {
        Agenda agenda = new Agenda();
        menu(args[0]);
    }
    
    public static String leer(File f) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(f));
        String line = "";
        String texto = "";
        if(f.exists() && f.isFile()) {
            while ((line = br.readLine()) != null) {
                texto += line + '\n';
            }
        }
        br.close();
        return texto;
    }
    
    // Continue -- Llamar leer para el contenido -> escribir fichero nuevo
    public static void crearCopia(String fichero) throws IOException {
        String nombre = fichero+"_copia.txt";
        File f = new File(nombre);
        
        if(f.createNewFile()){ System.out.println(nombre + " ha sido creado");
        }else System.out.println(nombre + " Ya existe en este directorio");
        
       // FileWriter myWriter = new FileWriter(nombre);
         //   myWriter.write();
           // myWriter.close();
    }
    
    
    
    public static void menu(String agendaFichero) throws IOException {
        Scanner sc = new Scanner(System.in);
        File f = new File(agendaFichero);
        int x = 1;
        
        while(x != 0) {
            System.out.println(leer(f));;
            System.out.println("0 para salir" + '\n'
                    + "1 para hacer cambios en el fichero" + '\n'
                    + "2 para crear una copia" + '\n');
            x = Integer.parseInt(sc.nextLine());
            
            switch(x) {
                case 1:
                    crearCopia(agendaFichero);
                    break;
                    
                case 2:
                    
                    break;
                    
                default:
                    System.out.println("Elige una opcion correcta");
                    break;
            }
        }
    }
    
}
