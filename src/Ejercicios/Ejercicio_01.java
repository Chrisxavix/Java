package Ejercicios;

import java.util.Scanner;

public class Ejercicio_01 {
    public static void main(String[] args) {
        /*Entrada de datos para realizar una operación*/
        Scanner entrada = new Scanner(System.in);
        int num1;
        int num2;
        int operacion;
        int result;
        System.out.println("Valor 1: ");
        num1 = entrada.nextInt();
        System.out.println("Valor 2: ");
        num2 = entrada.nextInt();
        System.out.println("Operadión: ");
        operacion = entrada.nextInt();

        if (operacion == 1) {
            result = num1 + num2;
            System.out.println("Suma: " + result);
        } else if (operacion == 2) {
            result = num1 - num2;
            System.out.println("Resta: " + result);
        } else if (operacion == 3) {
            result = num1 * num2;
            System.out.println("Multiplicación: " + result);
        } else if (operacion == 4) {
            result = num1 / num2;
            System.out.println("División: " + result);
        } else {
            System.out.println("Sin operación");
        }
    }
}
