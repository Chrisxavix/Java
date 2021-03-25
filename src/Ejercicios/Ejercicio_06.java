package Ejercicios;

import java.util.Scanner;

public class Ejercicio_06 {
    public static void main(String[] args) {
        /*Ejercicio con do while*/
        /*Imprimir una serie en decremento al ingresar 1000*/

        int valor;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el valor: ");
        valor = entrada.nextInt();
        do {
            System.out.println("Número " +valor);
            valor-=200;
        } while (valor >= 0);

    }
}
