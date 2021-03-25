package Ejercicios;

import java.util.Scanner;

public class Ejercicio_16 {
    public static void main(String[] args) {
        /*Imprimir vector de reversa*/

        int longitud;
        int contador = 0;
        int valor;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la longitud del vector: ");
        longitud = entrada.nextInt();
        int numeros[] = new int [longitud];
        for ( int i = 0; i<numeros.length; i++ ) {
            System.out.print("Ingrese el valor " + (i+1) + ": ");
            valor = entrada.nextInt();
            numeros[i] = valor;
        }

        System.out.println("Valores invertidos del vector");
        for ( int i = numeros.length -1; i>=0; i-- ) {
            System.out.println("Posición " + (i+1) + ": " + numeros[i]);
        }
    }
}
