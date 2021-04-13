package teoria.constructores;

import java.util.Scanner;

public class SinConstructor {
    private Scanner entrada = new Scanner(System.in);
    String nombre;

    public void pedirNombre() {
        System.out.print("Ingrese su nombre: ");
        nombre = entrada.nextLine();
    }

    public void imprimir() {
        System.out.print("Su nombre es: " + nombre);
    }
}
