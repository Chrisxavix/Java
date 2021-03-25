package Ejercicios;

import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {
        /*.substring(0, 3), obtener parte de la cadena*/
        String cadena;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la cadena: ");
        cadena = entrada.nextLine();
        System.out.println("Cortado desde el 0 al 4: " + cadena.substring(0, 4));
    }
}
