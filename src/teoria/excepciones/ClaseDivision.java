package teoria.excepciones;

import java.util.Scanner;

public class ClaseDivision {
    public static void main(String[] args) {
        try {
            Scanner entrada = new Scanner(System.in);
            int resultado;
            System.out.print("Ingrese el valor: ");
            int valor1 = entrada.nextInt();
            System.out.print("Ingrese el valor a dividir: ");
            int valor2 = entrada.nextInt();
            resultado = valor1 / valor2;
            System.out.println("El resultado es: " + resultado);
        } catch (Exception error) {
            System.out.println("ERROR!!!" + error);
        } finally {
            /*Siempre va a ejecutarse*/
            System.out.println("Saliendo...");
        }
    }
}
