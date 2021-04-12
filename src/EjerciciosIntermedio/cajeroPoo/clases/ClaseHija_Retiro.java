package EjerciciosIntermedio.cajeroPoo.clases;

import java.util.Scanner;

public class ClaseHija_Retiro extends ClasePadreAbstracta{

    Scanner entrada = new Scanner(System.in);
    @Override
    public void transacciones() {
        System.out.print("Ingrese el retiro: ");
        retiro();
        if (retiro <= getSaldo()) {
            transacciones = getSaldo();
            setSaldo(transacciones - retiro);
            System.out.println("-------------------");
            System.out.println("Retiraste: " + retiro);
            System.out.println("Tu saldo es: " + getSaldo());
            System.out.println("-------------------");
        } else {
            System.out.println("------------------");
            System.out.println("Saldo insuficiente");
            System.out.println("------------------");
        }
    }
}
