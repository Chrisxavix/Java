package Ejercicios;

import java.util.Scanner;

public class Ejercicio_05 {
    public static void main(String[] args) {
        /*Ejercicio con el bucle while*/

        int i = 0;
        int valor;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Hasta qué valor: ");
        valor = entrada.nextInt();
        valor = valor - 1;
        while (i<=valor) {
            i++;
            System.out.println("Número " + i);
        }
    }
}
