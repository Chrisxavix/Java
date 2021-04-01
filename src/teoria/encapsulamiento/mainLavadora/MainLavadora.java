package teoria.encapsulamiento.mainLavadora;

import teoria.encapsulamiento.logicaLavadora.LogicaLavadora;

import java.util.Scanner;

public class MainLavadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese los kilos: ");
        int kilos = entrada.nextInt();
        System.out.print("Ingrese el tipo de ropa: ");
        int tipo = entrada.nextInt();

        /*Lavadora accion = new Lavadora(kilos, tipo);
        accion.cicloCompleto();*/
        LogicaLavadora accion = new LogicaLavadora(kilos, tipo);
        accion.cicloCompleto();
    }
}
