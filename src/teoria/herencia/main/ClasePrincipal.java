package teoria.herencia.main;
import teoria.herencia.operaciones.ClaseHija_Resta;
import teoria.herencia.operaciones.ClaseHija_Suma;

public class ClasePrincipal {
    public static void main(String[] args) {
        ClaseHija_Suma suma = new ClaseHija_Suma();
        ClaseHija_Resta resta = new ClaseHija_Resta();

        /*Suma*/
        suma.pedirDatos();
        suma.sumarHija();
        suma.mostrarResultado();

        /*Resta*/
        resta.pedirDatos();
        resta.restarHija();
        resta.mostrarResultado();
    }
}
