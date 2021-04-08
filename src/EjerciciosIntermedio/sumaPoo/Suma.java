package EjerciciosIntermedio.sumaPoo;

public class Suma {
    private int vUno, vDos, Resultado;

    /*Crear un constructor para recibir datos de de SumaMain*/
    public Suma(int ValorUno, int Valordos) {
        /*Los valores de la clase Suma llega en los espacios
        declarados, entonces las variables de Suma toman
        esos valores */

        /*El this hace referencia a la clase actual y sus variables*/
        this.vUno = ValorUno;
        this.vDos = Valordos;
    }

    public void Operacion () {
        this.Resultado = vUno + vDos;
    }

    public void Imprimir() {
        Operacion();
        System.out.print("Resultado: " + Resultado);
    }
}
