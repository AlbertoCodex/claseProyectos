/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios.agenda;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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
    
    public static void crearCopia(File fichero) throws IOException {
        String copia = fichero.getName().replaceFirst("[.][^.]+$", "")+"_copia.txt";
        File copiaFile = new File(copia);
        FileWriter fw = new FileWriter(copia, false);
        BufferedWriter bw = new BufferedWriter(fw);
        
        System.out.println("Se ha realizado una copia en " + copia);
        bw.write(leer(fichero));
        bw.close();
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
                    
                    break;
                    
                case 2:
                    crearCopia(f);
                    break;
                    
                default:
                    break;
            }
        }
    }
    
}
