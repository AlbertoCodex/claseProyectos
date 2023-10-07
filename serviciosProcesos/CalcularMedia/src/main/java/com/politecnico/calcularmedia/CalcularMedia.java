/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.politecnico.calcularmedia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author alberto
 */
public class CalcularMedia {

    public static void main(String[] args) throws IOException, InterruptedException {
        String[] cmdArray = new String[2];
        cmdArray[0] = "java";
        cmdArray[1] = "ProgramaSecundario.java";
        String line;

        Process proceso = null;
        proceso = Runtime.getRuntime().exec(cmdArray);
        BufferedReader stdInput = new BufferedReader(new InputStreamReader(proceso.getInputStream()));      
        
        int valorRetorno = proceso.waitFor();
        if (valorRetorno == 0) {
            System.out.println("Proceso Completado");
            while ((line = stdInput.readLine()) != null) {
                System.out.println("Su salida fue: ");
                System.err.println(line);
            }
        } else {
            System.out.println("Proceso fallado. Código error: " + valorRetorno);
            System.out.println("Se produjo un error, la salida fue: " + stdInput.readLine());
        }
    }
    
    
}
