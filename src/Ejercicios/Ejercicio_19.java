package Ejercicios;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio_19 {
    public static void main(String[] args) {
        /*Ingreso de valores a una matriz*/
        int filas = 0, columnas = 0, valor;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el valor de la fila: ");
        filas = entrada.nextInt();
        System.out.print("Ingrese el valor de la columna: ");
        columnas = entrada.nextInt();
        int numeros[][] = new int[filas][columnas];

        for (int j = 0; j < filas; j++) {
            for (int i = 0; i < columnas; i++) {
                System.out.print("Ingrese el valor de ["+(j+1)+"]["+(i+1)+"]: ");
                valor = entrada.nextInt();
                numeros[j][i]= valor;
            }
        }

        for (int j = 0; j < filas; j++) {
            for (int i = 0; i < columnas; i++) {
                System.out.print(numeros[j][i] + " ");
            }
            System.out.println("");
        }
    }


}
