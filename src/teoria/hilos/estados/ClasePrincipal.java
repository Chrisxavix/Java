package teoria.hilos.estados;

public class ClasePrincipal {
    public static void main(String[] args) {
        HiloProceso hilo1 = new HiloProceso();
        HiloProceso hilo2 = new HiloProceso();
        HiloProceso hilo3 = new HiloProceso();
        hilo1.start();
        /*Usar sleep para dormir por un tiempo
          Simpre va dentro de un try-catch*/
        try {
            hilo1.sleep(1000);
            /*Para los hilos usar
              InterruptedException*/
        } catch (InterruptedException e) {
            System.out.println("Error en el hilo 1: " + e);
        }

        hilo2.start();
        try {
            hilo2.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error en el hilo 2: " + e);
        }

        hilo3.start();
        /*Para detener un hilo se usa el método stop()*/
        hilo3.stop();
    }
}
