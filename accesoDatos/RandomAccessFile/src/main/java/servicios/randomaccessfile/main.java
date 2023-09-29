/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package servicios.randomaccessfile;

import java.io.IOException;

/**
 *
 * @author Alberto
 */
public class main {

    public static void main(String[] args) throws IOException {
        FicheroAccesoAleatorio fichero = new FicheroAccesoAleatorio("test.txt");
        fichero.ir(2);
        fichero.leer();
        fichero.atras(2);
        fichero.leer();
    }
}
