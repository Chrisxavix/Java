package Ejercicios;

import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {
        /*Usando el método lenght*/

        String cadena;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la cadena: ");
        cadena = entrada.nextLine();
        System.out.println("Tiene " + cadena.length() + " caracteres.");
    }
}
