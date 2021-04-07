package teoria.polimorfismo;

public class Suma_ClaseHija extends Operaciones_ClasePadre {
    /*Operaciones_ClasePadre operacion = new Operaciones_ClasePadre();*/
    /*@Override permite sobreescribir un método*/
    /*Estamos tomando un método que ya está declarado en otra clase*/
    @Override
    public void operacionesPadre() {
        resultado = valor1 + valor2;
    }
}
