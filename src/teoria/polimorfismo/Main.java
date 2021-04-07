package teoria.polimorfismo;

public class Main {
    public static void main(String[] args) {

        /*Cuando se usa polimorfismo se crea un constructor
          para relacionar con la clase a comunicarse*/
        Operaciones_ClasePadre operacioSuma = new Suma_ClaseHija();
        Operaciones_ClasePadre operacionResta = new Resta_ClaseHija();
        /*Suma*/
        operacioSuma.pedirDatos();
        operacioSuma.operacionesPadre();
        System.out.print("La suma es: ");
        operacioSuma.mostrarResultado();

        /*Resta*/
        operacionResta.pedirDatos();
        operacionResta.operacionesPadre();
        System.out.print("La resta es: ");
        operacionResta.mostrarResultado();
    }
}
