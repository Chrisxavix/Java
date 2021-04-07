package teoria.polimorfismo;

import java.util.Scanner;

/*Se agrega abstract*/
public abstract class Operaciones_ClasePadre {
    protected int valor1, valor2, resultado;
    Scanner entrada = new Scanner(System.in);

    public void pedirDatos() {
        System.out.print("Ingrese el valor 1: ");
        valor1 = entrada.nextInt();
        System.out.print("Ingrese el valor 2: ");
        valor2 = entrada.nextInt();
    }

    /*Método de Polimorfismo*/
    /*Se debe usar abstract*/
    /*No debe haber código o lógica encerrada entre {}*/
    public abstract void operacionesPadre();

    public void mostrarResultado() {
        System.out.print(resultado);
        System.out.println("");
    }
}
