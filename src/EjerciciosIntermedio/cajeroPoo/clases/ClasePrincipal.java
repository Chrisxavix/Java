package EjerciciosIntermedio.cajeroPoo.clases;

public class ClasePrincipal {
    public static void main(String[] args) {
        ClasePadreAbstracta operacion = new ClaseHija_Consulta();
        operacion.setSaldo(500);
        operacion.operaciones();
    }
}
