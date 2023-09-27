/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios.randomaccessfile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Alberto
 */
public class FicheroAccesoAleatorio {
    String nombre;
    
    FicheroAccesoAleatorio(String nombre) throws FileNotFoundException, IOException {   
        this.nombre = nombre;
        System.out.println(nombre);
        FileReader fr = new FileReader(nombre);
        FileWriter fw = new FileWriter(nombre, true);
        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(fw);
    }
    public void escribir(String texto) {
        
    } 
    
}
