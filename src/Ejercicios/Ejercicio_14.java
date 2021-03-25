package Ejercicios;

public class Ejercicio_14 {
    public static void main(String[] args) {
        /*Vector*/
        int numeros[] = new int[5];
        for(int i=0; i<numeros.length; i++) {
            numeros[i]= i + 10;
        }

        for(int i=0; i< numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
