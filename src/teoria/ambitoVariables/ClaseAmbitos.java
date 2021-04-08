package teoria.ambitoVariables;

public class ClaseAmbitos {
    /*Con el modificador que será llamado desde la ClasePrincipal*/
    public static int variableEstatica = 10;

    int variableGlobal;

    void miMetodo(int parametros) {
        /*Variables de ámbito local es necesario iniciarlas*/
        /*Si se recibe como parámetro solo funciona dentro de su bloque*/
        int variableLocal = 0;
    }

    public void PruebaVariableLocal() {
        /*Variable local no puede ser usada fuera de su bloque*/
        /*System.out.println(variableLocal);*/
    }

    public void PruebaVariableGlobal() {
        /*Variables globales pueden ser usadas en cualquier bloque de esta clase*/
        System.out.println(variableGlobal);
    }


}
