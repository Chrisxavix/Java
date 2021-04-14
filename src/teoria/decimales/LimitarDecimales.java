package teoria.decimales;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class LimitarDecimales {
    public static void main(String[] args) {
        double numero = 2;
        double raiz = Math.sqrt(numero);
        System.out.println("La raíz es: " + raiz);

        /*Primera opcion: Decimal Format*/
        /*Agregar la instancia y la cantidad de ceros que representan los decimales*/
        DecimalFormat decimal = new DecimalFormat("#.00");
        System.out.println("La raíz es: " + decimal.format(raiz));

        /*Segunda opción*/
        /*Utilizar StringFormat*/
        System.out.println("La raíz es: " + String.format("%.3f", raiz));

        /*Tercera opción*/
        /*Utilizar el método math.round*/
        /*Aquí coloca el punto*/
        System.out.println("La raíz es: " + (double) Math.round(raiz * 10000d) / 10000);

        /*Cuarta opción*/
        /*Utilizar big decimal*/
        BigDecimal bd = new BigDecimal(raiz);
        bd = bd.setScale(5, RoundingMode.HALF_UP);
        System.out.println("La raíz es: " + bd.doubleValue());
    }
}
