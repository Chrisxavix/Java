package teoria.modificadores.privado.paquete1;

public class ClaseJava1 {
    public static void main(String[] args) {
        Atributos_Metodos_Priv atributos = new Atributos_Metodos_Priv();
        int recibeValorUno = atributos.getValorUno();
        System.out.println(recibeValorUno);

        atributos.setValorDos(20);

    }
}
