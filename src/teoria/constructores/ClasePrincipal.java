package teoria.constructores;

public class ClasePrincipal {
    public static void main(String[] args) {
        SinConstructor test1 = new SinConstructor();
        ConConstructor test2 = new ConConstructor();
        /*test1.pedirNombre();
        test1.imprimir();*/

        test2.ConConstructor();
    }
}
