package Ejercicios;

import java.util.Scanner;

public class Ejercicio_04 {
    public static void main(String[] args) {
        /*Tabla de multiplicar, bucle for*/

        int contador = 0;
        int result, tabla;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Valor de la tabla: ");
        tabla = entrada.nextInt();
        /*Si se requiere un incremento especial usar, como en pares: i+=2*/
        for(int i=1; contador<10; i++) {
            /*También se usa contador = contador + 1*/
            contador++;
            result = tabla * i;
            System.out.println(tabla + " * " + contador + " = "+ result);
        }
    }
}
