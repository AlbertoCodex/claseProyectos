/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.politecnico.programasecundario;

/**
 *
 * @author alberto
 */
public class ProgramaSecundario {
    public static void main (String args[] ) {
        media(); // Ejercicio 1
        System.exit(0);
        
    }
    public static void media() {        
        int n = 10;
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result += i;
        }
        result = result / n;
        System.out.println("Ejercicio 1");
        System.out.println("La media de los " + n + " primeros enteros es: " + result);
    }
}
