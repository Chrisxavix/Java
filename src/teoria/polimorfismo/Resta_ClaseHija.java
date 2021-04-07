package teoria.polimorfismo;

public class Resta_ClaseHija extends Operaciones_ClasePadre {

    @Override
    public void operacionesPadre() {
        resultado = valor1 - valor2;
    }
}
