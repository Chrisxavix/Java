package Poo.suma;

import java.util.Scanner;

public class SumaMain {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el primer valor: ");
        int valor1 = entrada.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        int valor2 = entrada.nextInt();

        /*Crea el objeto de la clase Suma para enviar los
        valores obtenidos en esta clase*/
        Suma valores = new Suma(valor1, valor2);

        /*Usa la instancia creada para llamar al método*/
        valores.Imprimir();
    }
}
