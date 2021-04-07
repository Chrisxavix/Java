package teoria.modificadores.protegido.paquete2;

import teoria.modificadores.protegido.paquete1.Atributos_Protegido;

public class ClaseJava2 {
    public static void main(String[] args) {
        Atributos_Protegido atributos = new Atributos_Protegido();
        /*No tengo acceso desde otro paquete*/
        /*atributos.metodoMaggot();*/
    }
}
