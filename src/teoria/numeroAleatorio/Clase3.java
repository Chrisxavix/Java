package teoria.numeroAleatorio;

public class Clase3 {
    public static void main(String[] args) {
        /*Aleatorio con un rango específico*/
        /*Rango de 15 a 20*/
        int aleatorio = 0;
        aleatorio = (int) (Math.random() * 6) + 15;
        System.out.println("Número aleatorio: " + aleatorio);
    }
}
