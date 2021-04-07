package teoria.modificadores.publico.paquete1;

public class ClaseJava1 {
    public static void main(String[] args) {
        /*Declaramos el objeto desde el mismo paquete*/
        Atributos_Metodos atributos = new Atributos_Metodos();
        int valor1 = atributos.valorUno;
        System.out.println(valor1 + " Public");
        atributos.metodoMaggot();
    }
}
