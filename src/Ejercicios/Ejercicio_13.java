package Ejercicios;

public class Ejercicio_13 {
    public static void main(String[] args) {
        /*Arreglos unidimensionales, Vectores*/
        int numeros[] = new int [5];
        int cont1 =0, cont2=0;
        numeros[0] = 2;
        numeros[1] = 6;
        numeros[2] = 2;
        numeros[3] = 5;
        numeros[4] = 8;

        for (int i = 0; i< numeros.length; i++) {
            System.out.println(numeros[i]);
            if (numeros[i] > 4 ) {
                cont1++;
            } else {
                cont2++;
            }
        }
        System.out.println("Hay " + cont1 + " números mayores a 4");
        System.out.println("Hay " + cont2 + " números menores a 4");
    }
}
