package teoria.constructores;

import java.util.Scanner;

public class ConConstructor {

    public void ConConstructor() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Su nombre es: " + nombre);
    }
}
