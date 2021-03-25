package Ejercicios;

public class Ejercicio_09 {
    public static void main(String[] args) {
        /*Serie Fibonacci
        0, 1, 1, 2, 3, 5, 8, 13, 21, 34 */
        int a = 0;
        int b = 1;
        int c = 0;
        int valor = 10;
        for (int i = 0; i < valor; i++) {
            if (i < 9) {
                System.out.print(a + ", ");
                c = a + b;
                a = b;
                b = c;
            } else {
                System.out.print(a);
            }
        }
    }
}
