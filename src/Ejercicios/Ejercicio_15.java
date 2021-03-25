package Ejercicios;

import java.util.Scanner;

public class Ejercicio_15 {
    public static void main(String[] args) {
        /*Vector por usuario*/
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

        System.out.println("Valores del vector");
        for ( int i = 0; i<numeros.length; i++ ) {
            System.out.println("Posición " + (i+1) + ": " + numeros[i]);
        }
    }
}
