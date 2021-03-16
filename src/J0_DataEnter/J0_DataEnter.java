package J0_DataEnter;

import java.util.Scanner;

/*El package depende de la carpeta de donde viene*/
public class J0_DataEnter {

    /*Escribir psvm para sacar automáticamente*/
    public static void main(String[] args) {
        /*Tipos de datos básicos*/
        int edad = 24;
        String nombre = "Chris";
        boolean pregunta = true;
        double moneda = 24.9;
        System.out.println("Maggot Test");
        /*Escribir sout para imprimir, como atajo*/
        System.out.println("Ud, " + nombre + ", de edad " + edad + ", tiene un: " + pregunta + ", con moneda: " + moneda);

        /*Suma*/
        int num1 = 1;
        int num2 = 8;
        int num3 = 3;
        int resultado;
        resultado = num1 + num2 + num3;
        System.out.println("El resultado es: " + resultado);

        /*Pedir Datos por consola*/

        /*Primera opción*/
        /*Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la edad: ");
        int edadEntrada = Integer.parseInt(entrada.nextLine());
        System.out.println("Tu edad es: " + edadEntrada);*/

        /*Segunda opción*/
        Scanner entradaDos = new Scanner(System.in);
        System.out.println("Ingrese la edad: ");
        int edadEntradaDos = entradaDos.nextInt();
        System.out.println("Tu edadDos es: " + edadEntradaDos);
    }
}
