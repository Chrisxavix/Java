package teoria.hilos.parametros;

public class ClasePrincipal {
    public static void main(String[] args) {
        Proceso hilo1 = new Proceso("Hilo 1");
        Proceso hilo2 = new Proceso("Hilo 2");
        Proceso hilo3 = new Proceso("Hilo 3");

        /*Pasar parámetros en ambos hilos antes de ejecutarlos con start*/
        hilo1.valorCondicion(4);
        hilo2.valorCondicion(2);
        hilo3.valorCondicion(3);
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}
