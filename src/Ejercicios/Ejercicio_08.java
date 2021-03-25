package Ejercicios;

public class Ejercicio_08 {
    public static void main(String[] args) {
        /*Imprimir la serie:
        1, 99, 2, 98, 3, 97, 4, 96, 5, 95*/

        int j = 99;
        for (int i = 1; i <= 5; i++) {
            if (i < 5) {
                System.out.print(i + ", ");
                System.out.print(j + ", ");
            } else {
                System.out.print(i + ", ");
                System.out.print(j);
            }
            j--;
        }
    }
}
