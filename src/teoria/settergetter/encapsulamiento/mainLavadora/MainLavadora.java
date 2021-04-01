package teoria.settergetter.encapsulamiento.mainLavadora;

import teoria.settergetter.encapsulamiento.logicaLavadora.LogicaLavadora;

import java.util.Scanner;

public class MainLavadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese los kilos: ");
        int kilos = entrada.nextInt();
        System.out.print("Ingrese el tipo de ropa: ");
        int tipo = entrada.nextInt();


        LogicaLavadora accion = new LogicaLavadora(kilos, tipo);

        /*Evade el valor ingresado por el usuario y toma el del Set*/
        accion.setTipoRopa(2);
        accion.cicloCompleto();

        /*Declaro una variable para recibir lo que retorna*/
        int valor = accion.getTipoRopa();
        System.out.println(valor +" valor");

    }
}
