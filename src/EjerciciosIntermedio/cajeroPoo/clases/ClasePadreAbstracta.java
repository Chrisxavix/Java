package EjerciciosIntermedio.cajeroPoo.clases;

import java.util.Scanner;

public abstract class ClasePadreAbstracta {
    Scanner entrada = new Scanner(System.in);
    protected int transacciones, retiro, deposito;
    private static int saldo;

    public void operaciones() {
        int bandera = 0;
        int seleccion = 0;
        do {
            do {
                System.out.println("Seleccione una opción:");
                System.out.println("      1.- Consulta el saldo.");
                System.out.println("      2.- Retiro de efectivo.");
                System.out.println("      3.- Depósito de efectivo.");
                System.out.println("      4.- Salir.");
                seleccion = entrada.nextInt();
                if (seleccion >= 1 && seleccion <= 4) {
                    bandera = 1;
                } else {
                    System.out.println("---------------------");
                    System.out.println("Opción no disponible.");
                    System.out.println("---------------------");
                    bandera = 0;
                }
            } while (bandera == 0);

            if (seleccion == 1) {
                ClasePadreAbstracta consulta = new ClaseHija_Consulta();
                consulta.transacciones();
            } else if (seleccion == 2) {
                ClasePadreAbstracta retiro = new ClaseHija_Retiro();
                retiro.transacciones();
            } else if (seleccion == 3) {
                ClasePadreAbstracta deposito = new ClaseHija_Deposito();
                deposito.transacciones();
            } else if (seleccion == 4) {
                System.out.println("----------------------------");
                System.out.println("Saliendo de la aplicación...");
                System.out.println("----------------------------");
                bandera = 2;
            }
        } while (bandera != 2);
    }

    /*Retiro de dinero*/
    public void retiro() {
        retiro = entrada.nextInt();
    }

    /*Solicitar depósito*/
    public void deposito() {
        deposito = entrada.nextInt();
    }

    /*Método abstract*/
    public abstract void transacciones();

    /*Método Get*/
    public int getSaldo() {
        return saldo;
    }

    /*Método Set*/
    public void setSaldo(int rSaldo) {
        this.saldo = rSaldo;
    }
}
