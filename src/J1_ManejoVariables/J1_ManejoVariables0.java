package J1_ManejoVariables;

import java.util.Scanner;

public class J1_ManejoVariables0 {

    public static void main(String[] args) {
        /*Usar comas para ingresar decimales*/
        Scanner entrada = new Scanner(System.in);
        int num1;
        float num2, result;
        System.out.println("Primer número: ");
        num1 = entrada.nextInt();
        System.out.println("Segundo número: ");
        num2 = entrada.nextFloat();
        result = num1 / num2;
        System.out.println("Resultado: " + result);
    }
}
