/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.politecnico.programasecundario;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author alberto
 */
public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        menu();
    }

    public static void menu() throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        String[] cmdArray = new String[2];
        cmdArray[0] = "java";
        Process proceso = null;
        BufferedReader stdInput = null;
        int x = -1;

        while (x != 0) {
            System.out.println("menu"); // Crear opciones | 0 para salir, 1 para ejercicio1 ...
            x = sc.nextInt();

            switch (x) {
                case 1:
                    System.out.println("Ejercicio 1");
                    cmdArray[1] = "Media.java";
                    String line;
                    proceso = Runtime.getRuntime().exec(cmdArray);
                    stdInput = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
                    
                    checkProcess(proceso, stdInput);
                    while ((line = stdInput.readLine()) != null) { // Ejercicio 1
                        System.err.println(line);
                    }
                    break;
                case 2:
                    System.out.println("Ejercicio 2");
                    cmdArray[1] = "RandomNotepad.java";
                    String[] notepad = {"Notepad.exe", "new"};
                    proceso = Runtime.getRuntime().exec(cmdArray);
                    stdInput = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
                    checkProcess(proceso, stdInput);
                    int n = Integer.parseInt(stdInput.readLine());
                    
                    System.out.println("Se va a ejecutar el Notepad " + n + " veces");
                    for (int i = 1; i <= n; i++) { // Ejercicio 2
                        notepad[1] = "new"+i;
                        Runtime.getRuntime().exec(notepad);
                    }
                    break;
                case 3:
                    System.out.println("Ejercicio 3");
                    cmdArray[1] = "ExecutorMensajes.java";
                    String executorLines;
                    proceso = Runtime.getRuntime().exec(cmdArray);
                    stdInput = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
                    
                    checkProcess(proceso, stdInput);
                    while ((executorLines = stdInput.readLine()) != null) { // Ejercicio 1
                        System.err.println(executorLines);
                    }
                    break;
                default:
                    break;
            }
        }
    }

    public static void checkProcess(Process proceso, BufferedReader stdInput) throws InterruptedException, IOException {
        int valorRetorno = proceso.waitFor();
        if (valorRetorno == 0) {
            System.out.println("Proceso completado, su salida fue: ");
        } else {
            System.out.println("Proceso fallado. Código error: " + valorRetorno);
            System.out.println("Se produjo un error, la salida fue: " + stdInput.readLine());
        }
    }

}
