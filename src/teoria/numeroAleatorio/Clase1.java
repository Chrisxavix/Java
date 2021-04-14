package teoria.numeroAleatorio;

public class Clase1 {
    public static void main(String[] args) {
        int aleatorio = 0;
        /*Casting de variables*/
        /*Math siempre trabaja con double, por lo que se hace un casting con (int)*/
        /*El *101 le da el rango hasta dónde será el límite, de 0 a 100*/
        aleatorio = (int)(Math.random() * 101);
        System.out.println("Número aleatorio: " + aleatorio);
    }
}
