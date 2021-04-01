package teoria.useThis;

import java.util.Scanner;

public class RectanguloMain {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el valor de la base: ");
        int base = entrada.nextInt();
        System.out.print("Ingrese el valor de la altura: ");
        int altura = entrada.nextInt();

        Rectangulo operacion = new Rectangulo(base, altura);
        operacion.Operacion();
    }
}
