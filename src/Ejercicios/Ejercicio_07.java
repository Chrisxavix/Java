package Ejercicios;

import java.util.Scanner;

public class Ejercicio_07 {
    public static void main(String[] args) {
        /*Imprimir la serie:
        1, 2, 3, 4, 5, 6, 7, 8, 9, 10*/
        for (int i = 1; i <= 10; i++) {
            if (i < 10) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i);
            }
        }
    }
}
