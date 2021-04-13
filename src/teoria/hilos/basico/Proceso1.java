package teoria.hilos.basico;
/*Creación de un hilo, primera forma*/
public class Proceso1 extends Thread {
    /*Usar un método que viene de la clase Thread*/

    /*Se usa polimorfismo*/
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Proceso 1");
        }
    }
}
