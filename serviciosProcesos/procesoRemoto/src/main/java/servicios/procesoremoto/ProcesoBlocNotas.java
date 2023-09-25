/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios.procesoremoto;

import java.io.IOException;

/**
 *
 * @author Alberto
 */
public class ProcesoBlocNotas {

    public static void main(String[] args) throws IOException, InterruptedException {
        String[] infoProceso = {"Notepad.exe", "notas.txt"};
        Process proceso = Runtime.getRuntime().exec(infoProceso);
        int codigoRetorno = proceso.waitFor();
        System.out.println("Fin de la ejecución" + codigoRetorno);
    }

}
