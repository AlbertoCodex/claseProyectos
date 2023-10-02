/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package servicios.raton;

/**
 *
 * @author Alberto
 */
public class Raton {

    private String nombre;
    private int tiempoAlimentacion;

    public Raton(String nombre, int tiempoAlimentacion) {
        super();
        this.nombre = nombre;
        this.tiempoAlimentacion = tiempoAlimentacion;
    }

    public void comer() {
        System.out.printf("el raton %s ha comenzado a alimentarse %n", nombre);
        try {
            Thread.sleep(tiempoAlimentacion * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("el raton %s ha terminado de alimentarse%n", nombre);
    }

    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        Raton fievel = new Raton("Fievel", 4);
        Raton jerry = new Raton("Jerry", 5);
        Raton pinky = new Raton("Pinky", 3);
        Raton mickey = new Raton("Mickey", 6);
        fievel.comer();
        jerry.comer();
        pinky.comer();
        mickey.comer();
        long fin = System.currentTimeMillis();
        double tiempo = (double) ((fin - inicio) / 1000);
        System.out.println(tiempo + " segundos");
    }
}
