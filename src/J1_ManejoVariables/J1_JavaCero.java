package J1_ManejoVariables;

import java.util.Scanner;

public class J1_JavaCero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1;
        int num2;
        int operacion;
        int result;
        System.out.println("Valor 1: ");
        num1 = entrada.nextInt();
        System.out.println("Valor 2: ");
        num2 = entrada.nextInt();
        System.out.println("Operadión: ");
        operacion = entrada.nextInt();

        if (operacion == 1) {
            result = num1 + num2;
            System.out.println("Suma: " + result);
        } else if (operacion == 2) {
            result = num1 - num2;
            System.out.println("Resta: " + result);
        } else if (operacion == 3) {
            result = num1 * num2;
            System.out.println("Multiplicación: " + result);
        } else if (operacion == 4) {
            result = num1 / num2;
            System.out.println("División: " + result);
        } else {
            System.out.println("Sin operación");
        }
    }
    /*
    TIPOS DE DATOS
    long = muy grande
    int = lo más usado

    float = hasta 8 valores decimales
    double = hasta 15 valores decimales

    char = un solo caracter, sin importar si es texto o numérico
    boolean = true, false

    String = cadena de texto

    OPERADORES ARITMÉTICOS
    +
    -
    *
    /
    ^ POTENCIA ALT + 94
    (
    )
    PRIORIDAD DE OPERACIONES
    En ese orden
    Empieza de derecha a izquierda
    1: ()
    2: ^
    3: *  /
    4: +  -

    OPERADORES RELACIONALES
    <
    >
    ==
    !=
    <=
    >=

    OPERADORES LÓGICOS
    ||
    &&
    */

}
