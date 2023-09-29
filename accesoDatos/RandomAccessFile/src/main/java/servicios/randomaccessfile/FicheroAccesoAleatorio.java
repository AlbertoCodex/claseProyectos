/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios.randomaccessfile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
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
    RandomAccessFile rac = null;
    FileReader fr = null;
    FileWriter fw = null;
    BufferedReader br = null;
    BufferedWriter bw = null;
    
    FicheroAccesoAleatorio(String nombre) throws FileNotFoundException, IOException {
        fr = new FileReader(nombre);
        fw = new FileWriter(nombre, true);
        br = new BufferedReader(fr);
        bw = new BufferedWriter(fw);
        rac = new RandomAccessFile(nombre, "rw");
    }

    public void escribir(String texto) throws FileNotFoundException, IOException {
        nombre = getNombre();
        fw = getFw();
        bw = getBw();
        bw.write(texto);
        bw.close();
    }

    public void ir (long posicion) throws FileNotFoundException, IOException {
        nombre = getNombre();
        rac = getRac();
        rac.seek(posicion);
    }
    
    public void adelantar (long posiciones) throws FileNotFoundException, IOException {
        nombre = getNombre();
        rac = getRac();
        long posActual = rac.getFilePointer();
        rac.seek(posActual + posiciones);
    }
    
    public void atras (long posiciones) throws FileNotFoundException, IOException {
        System.out.println("Funcion atras()");
        nombre = getNombre();
        rac = getRac();
        long posActual = rac.getFilePointer();
        rac.seek(posActual - posiciones);
    }
    
    public void leer() throws FileNotFoundException, IOException {
        System.out.println("Funcion leer()");
        nombre = getNombre();
        rac = getRac();
        int value = rac.read();
        char letra = (char) value;
        System.out.println(letra);
    }

    public String getNombre() {
        return nombre;
    }
    
    public RandomAccessFile getRac() {
        return rac;
    }
    
    public FileReader getFr() {
        return fr;
    }
    
    public FileWriter getFw() {
        return fw;
    }
    
    public BufferedReader getBr() {
        return br;
    }

    public BufferedWriter getBw() {
        return bw;
    }

    public void setBr(BufferedReader br) {
        this.br = br;
    }

    public void setBw(BufferedWriter bw) {
        this.bw = bw;
    }

    public void setFr(FileReader fr) {
        this.fr = fr;
    }

    public void setFw(FileWriter fw) {
        this.fw = fw;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRac(RandomAccessFile rac) {
        this.rac = rac;
    }
    
    
    
    
}
