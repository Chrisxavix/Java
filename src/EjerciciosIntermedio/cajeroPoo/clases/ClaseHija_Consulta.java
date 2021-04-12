package EjerciciosIntermedio.cajeroPoo.clases;

public class ClaseHija_Consulta extends ClasePadreAbstracta {

    @Override
    public void transacciones() {
        System.out.println("---------------");
        System.out.println("Su saldo es: " + getSaldo());
        System.out.println("---------------");
    }
}
