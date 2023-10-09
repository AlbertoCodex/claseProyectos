/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package servicios.ratonhilos;

/**
 *
 * @author Alberto
 */
public class RatonHilos implements Runnable {

    private String nombre;
    private int tiempoAlimentacion;
    private int alimentoConsumido;

    public RatonHilos(String nombre, int tiempoAlimentacion) {
        super();
        this.nombre = nombre;
        this.tiempoAlimentacion = tiempoAlimentacion;
    }
    
    @Override
    public void run() {
        this.comer();
    }
    
    public static void main(String[] args) {
        RatonHilos fievel = new RatonHilos("Fievel", 4);
        new Thread(fievel).start();
        new Thread(fievel).start();
        new Thread(fievel).start();
        new Thread(fievel).start();
    }

    public void comer() {
        System.out.printf("el raton %s ha comenzdo a alimentarse%n", nombre);
        try {
            Thread.sleep(tiempoAlimentacion * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        alimentoConsumido++;
        System.out.printf("El raton %s ha terminado de alimentarse", nombre);
        System.out.printf("Alimento consumido: %d%n", alimentoConsumido);
        }
    }
