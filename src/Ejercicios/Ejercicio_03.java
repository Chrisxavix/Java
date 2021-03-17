package Ejercicios;

import java.util.Scanner;

public class Ejercicio_03 {
    public static void main(String[] args) {
        /*Ejercicio usando switch case*/

        Scanner entrada = new Scanner(System.in);
        int num1;
        int num2;
        int result;
        int operacion;
        System.out.println("Valor 1: ");
        num1 = entrada.nextInt();
        System.out.println("Valor 2: ");
        num2 = entrada.nextInt();
        System.out.println("Operación: ");
        operacion = entrada.nextInt();
        System.out.println(operacion);

        /*Case solo funciona con tipos de dato int y char, :/ */
        switch (operacion) {
            case 1: {
                result = num1 + num2;
                System.out.println("Suma: " + result);
                break;
            }
            case 2: {
                result = num1 - num2;
                System.out.println("Resta: " + result);
                break;
            }
            case 3: {
                result = num1 * num2;
                System.out.println("Multiplicación: " + result);
                break;
            }
            case 4: {
                result = num1 / num2;
                System.out.println("División: " + result);
                break;
            }
            default: {
                System.out.println("Sin operación");
                break;
            }
        }
    }
}
