package J1_ManejoVariables;

import java.util.Scanner;

public class J1_ManejoVariables1 {

    public static void main(String[] args) {

        /*Ingresar una cadena*/
        /*Scanner entrada = new Scanner(System.in);
        String cadena;
        System.out.println("Ingrese una cadena: ");
        cadena = entrada.nextLine();
        System.out.println(cadena);*/

        /*Ingresar un caracter*/
        Scanner entradaDos = new Scanner(System.in);
        char letra;
        System.out.println("Ingrese la letra: ");
        /*Imprime de acuerdo al valor en el charArt*/
        letra = entradaDos.next().charAt(0);
        System.out.println("Letra: " + letra);
    }
}
