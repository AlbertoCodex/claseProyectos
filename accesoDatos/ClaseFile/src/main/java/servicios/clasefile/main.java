/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios.clasefile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class main {

    public static void main(String[] args) throws IOException {
        for (String s : args) {
            String fichero = s;
            File f = new File(fichero);

            if (f.exists() == true) {
                if (f.isFile() == true) {
                    System.out.println("Existe y es un archivo");
                    menuArchivo(f);
                } else {
                    System.out.println("Existe y es un directorio");
                    menuDirectorio(f);
                }
            } else {
                System.out.println("No se encuentra el fichero");
            }
        }
    }

    public static void menuDirectorio(File f) {
        Scanner scanner = new Scanner(System.in);
        String[] directorio = f.list();
        File[] contenido = f.listFiles();
        int x = 1;

        while (x != 0) {
            System.out.println("0 para salir" + '\n'
                    + "1 para listar contenido" + '\n'
                    + "2 para listar recursivamente");
            x = scanner.nextInt();

            switch (x) {
                case 1:
                    for (int i = 0; i < directorio.length; i++) {
                        System.out.println(directorio[i]);
                    }
                    break;
                case 2:
                    contRec(contenido);
                    break;
            }
        }
    }

    public static void contRec(File[] contenido) {
        for (int i = 0; i < contenido.length; i++) {
            if (contenido[i].isFile()) {
                System.out.println(contenido[i]);
            } else {
                System.out.println(contenido[i]);
                File[] subFolder = contenido[i].listFiles();
                contRec(subFolder);
            }
        }
    }

    public static void menuArchivo(File f) throws FileNotFoundException, IOException {
        Scanner Scanner = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new FileReader(f));
        int x = 1;
        String line;

        while (x != 0) {
            System.out.println("0 para salir" + '\n'
                    + "1 para listar contenido" + '\n'
                    + "2 para listar con Index" + '\n'
                    + "3 para buscar en el texto");
            x = Integer.parseInt(Scanner.nextLine());

            switch (x) {
                case 1:
                    br = new BufferedReader(new FileReader(f));
                    while ((line = br.readLine()) != null) {
                        System.out.println(line);
                    }
                    br.close();
                    break;
                case 2:
                    int j = 0;
                    br = new BufferedReader(new FileReader(f));
                    while ((line = br.readLine()) != null) {
                        System.out.println(j + "- " + line);
                        j++;
                    }
                    br.close();
                    break;
                case 3: // Continue (recorrer string, [i])
                    br = new BufferedReader(new FileReader(f));
                    int contLine = 0;
                    int contChar = 0;
                    int k = 0;
                    String texto = "";
                    String palabra = "";

                    System.out.println("Introduce el texto a buscar");
                    texto = Scanner.nextLine();
                    while ((line = br.readLine()) != null) {
                        contLine++;
                        for (int i = 0; i < line.length(); i++) {
                            if (line.charAt(i) == texto.charAt(k)) {
                                palabra += line.charAt(i);
                                k++;
                            } else {
                                palabra = "";
                                k = 0;
                            }
                            if (palabra.compareTo(texto) == 0) {
                                System.out.println(line + " - linea " + contLine + " posicion " 
                                        + (contChar-palabra.length()+1));
                                k = 0;
                                palabra = "";
                            }
                            contChar++;
                        }
                        contChar = 0;
                    }
                    br.close();
                    break;
                default:
                    break;
            }
        }
    }
}
