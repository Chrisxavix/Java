package EjerciciosIntermedio;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        /*Invertir una cadena de texto*/
        String cadena;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la cadena: ");
        cadena = entrada.nextLine();

        for (int i = cadena.length() -1; i >= 0; i-- ) {
            System.out.print(cadena.substring(i,i+1));
        }
    }
}
