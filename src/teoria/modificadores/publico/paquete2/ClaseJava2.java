package teoria.modificadores.publico.paquete2;

import teoria.modificadores.publico.paquete1.Atributos_Metodos;

public class ClaseJava2 {
    public static void main(String[] args) {
        /*Declaramos el objeto desde otro paquete*/
        Atributos_Metodos atributos = new Atributos_Metodos();
        int valor2 = atributos.valorDos;
        System.out.println(valor2 + " Public");
        atributos.metodoMaggot();
    }
}
