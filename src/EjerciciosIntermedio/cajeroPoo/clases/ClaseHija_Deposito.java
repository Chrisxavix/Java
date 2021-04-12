package EjerciciosIntermedio.cajeroPoo.clases;

public class ClaseHija_Deposito extends ClasePadreAbstracta {

    @Override
    public void transacciones() {
        System.out.println("¿Cuánto desea depositar?");
        deposito();
        transacciones = getSaldo();
        setSaldo(transacciones + deposito);
        System.out.println("----------------------");
        System.out.println("Depositaste: " + deposito);
        System.out.println("Tu saldo actual es: " + getSaldo());
        System.out.println("----------------------");
    }
}
