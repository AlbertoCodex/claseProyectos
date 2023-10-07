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
        String line;

        Process proceso = null;
        proceso = Runtime.getRuntime().exec(cmdArray);
        BufferedReader stdInput = new BufferedReader(new InputStreamReader(proceso.getInputStream()));      
        
        int valorRetorno = proceso.waitFor();
        if (valorRetorno == 0) {
            System.out.println("Proceso completado, su salida fue: ");
            while ((line = stdInput.readLine()) != null) {
                System.err.println(line);
            }
        } else {
            System.out.println("Proceso fallado. Código error: " + valorRetorno);
            System.out.println("Se produjo un error, la salida fue: " + stdInput.readLine());
        }
    }
}
