/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.politecnico.programasecundario;

import java.util.Scanner;

/**
 *
 * @author alberto
 */
public class ProgramaSecundario {
    public static void main (String args[] ) {
    //    media(); // Ejercicio 1
    //    randomNotepad(); // Ejercicio 2
        
        
    }
    public static void media() {        
        int n = 10;
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result += i;
        }
        result = result / n;
        System.out.println("La media de los " + n + " primeros enteros es: " + result);
    }
    
    public static int randomNotepad() {
        int n = (int) (Math.random()*5+1);
        System.out.print(n);
        return n;   
    }
}
