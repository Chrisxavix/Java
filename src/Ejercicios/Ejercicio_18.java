package Ejercicios;

import java.util.Scanner;

public class Ejercicio_18 {
    public static void main(String[] args) {
        /*Matrices dinámicas*/
        int filas = 0, columnas = 0, contador = 1;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el valor de la fila: ");
        filas = entrada.nextInt();
        System.out.print("Ingrese el valor de la columna: ");
        columnas = entrada.nextInt();
        int numeros[][] = new int[filas][columnas];

        for (int j = 0; j < filas; j++) {
            for (int i = 0; i < columnas; i++) {
                numeros[j][i]= contador;
                contador++;
                System.out.print(numeros[j][i]);
            }
            System.out.println("");
        }
    }
}
