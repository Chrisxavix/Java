package teoria.numeroAleatorio;

import java.util.Random;

public class Clase2 {
    public static void main(String[] args) {
        int aleatorio = 0;
        Random r = new Random();
        aleatorio = (int)(r.nextDouble() * 101);
        System.out.println("Número aleatorio: " + aleatorio);
    }
}
