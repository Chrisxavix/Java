package teoria.hilos.parametros;

public class Proceso extends Thread {

    int numero;

    public Proceso (String NombreHilo) {
        super(NombreHilo);
    }

    @Override
    public void run() {
        for (int i = 0; i <= numero; i++) {
            /*El getName me dice de qué hilo se está ejecutando.
              Para cambiar de nombre se lo hace en el constructor. */
            System.out.println("Recorrer " + numero +": "+ + i + " " + this.getName());
        }
        System.out.println("");
    }

    /*Recibe el valor desde la clase principal*/
    public void valorCondicion(int rNumero) {
        this.numero = rNumero;
    }
}
