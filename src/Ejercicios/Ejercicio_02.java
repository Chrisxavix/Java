package Ejercicios;

import java.util.Scanner;

public class Ejercicio_02 {
    public static void main(String[] args) {
        /*Ejercicio de entrada de datos con múltiples condicionales*/

        int clave;
        int anio;
        String nombre;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la clave:");
        clave = entrada.nextInt();
        System.out.println("Ingrese los años de servicio:");
        anio = entrada.nextInt();
        if (clave == 1) {
            System.out.println("Atención al cliente");
            if (anio == 1) {
                System.out.println(nombre + ", tiene 6 días de vacaciones");
            } else if (anio >= 2 && anio <= 6) {
                System.out.println(nombre + ", tiene 14 días de vacaciones");
            } else if (anio >= 7){
                System.out.println(nombre + ", tiene 20 días de vacaciones");
            }
        } else if (clave == 2) {
            System.out.println("Logística");
            if (anio == 1) {
                System.out.println(nombre + ", tiene 7 días de vacaciones");
            } else if (anio >= 2 && anio <= 6) {
                System.out.println(nombre + ", tiene 15 días de vacaciones");
            } else if (anio >= 7){
                System.out.println(nombre + ", tiene 22 días de vacaciones");
            }
        } else if (clave == 3) {
            System.out.println("Gerencia");
            if (anio == 1) {
                System.out.println(nombre + ", tiene 10 días de vacaciones");
            } else if (anio >= 2 && anio <= 6) {
                System.out.println(nombre + ", tiene 20 días de vacaciones");
            } else if (anio >= 7){
                System.out.println(nombre + ", tiene 30 días de vacaciones");
            }
        } else {
            System.out.println(nombre + ", no pertenece a ninguna clave asignada");
        }
    }
}
