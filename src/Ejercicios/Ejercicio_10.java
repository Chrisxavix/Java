package Ejercicios;

import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        /*Usar nombre.equals("t") para comparar o "=="*/
        /*equals valida que se exactamente igual*/
        /*equalsIgnoreCase omite mayúsculas e minúsculas*/

        String nombre1, nombre2;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el primer nombre: ");
        nombre1 = entrada.nextLine();
        System.out.print("Ingrese el segundo nombre: ");
        nombre2 = entrada.nextLine();

        if (nombre1.equalsIgnoreCase(nombre2)) {
            System.out.println("Equal names");
        } else {
            System.out.println("Different names");
        }
    }
}
