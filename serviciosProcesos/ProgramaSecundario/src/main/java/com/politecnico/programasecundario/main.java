/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.politecnico.programasecundario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author alberto
 */
public class main {
    public static void main(String[] args) throws IOException, InterruptedException {
        String[] cmdArray = new String[2];
        cmdArray[0] = "java";
        cmdArray[1] = "ProgramaSecundario.java";
        Process proceso = Runtime.getRuntime().exec(cmdArray);
        BufferedReader stdInput = new BufferedReader(new InputStreamReader(proceso.getInputStream())); 
        
        
        
        int valorRetorno = proceso.waitFor();
        if (valorRetorno == 0) {
            System.out.println("Proceso completado, su salida fue: ");
    //      ejercicio1(stdInput);
    //      ejercicio2(proceso, stdInput);
            
                
        } else {
            System.out.println("Proceso fallado. Código error: " + valorRetorno);
            System.out.println("Se produjo un error, la salida fue: " + stdInput.readLine());
        }
    }
    
    public static void ejercicio1(BufferedReader stdInput) throws IOException {
        String line;
        System.out.println("Ejercicio 1");
        while ((line = stdInput.readLine()) != null) { // Ejercicio 1
            System.err.println(line);
        }
    }
    public static void ejercicio2(Process proceso, BufferedReader stdInput) throws IOException {
        String[] notepad = {"Notepad.exe", "notas.txt"};
        int n = Integer.parseInt(stdInput.readLine());
        
        System.out.println("Ejercicio 2");
        System.out.println("Se va a ejecutar el Notepad " + n + " veces");
        for (int i = 0; i < n; i++) { // Ejercicio 2
            Process bloc = Runtime.getRuntime().exec(notepad);
        }
    }
}
