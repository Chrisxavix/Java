package teoria.hilos.basico;

public class ClasePrincipal {
    public static void main(String[] args) {
        /*Primero se instancia y luego mandar a ejecutar los hilos con start*/
        Proceso1 hilo1 = new Proceso1();
        /*Cuando se usa implements para los hilos*/
        Thread hilo2 = new Thread(new Proceso2());

        /*Se debe usar start()*/
        hilo1.start();
        hilo2.start();
    }
}
