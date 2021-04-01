package teoria.useThis;

public class Rectangulo {
    private int vBase, vAltura, Resultado;

    /*Esto es un constructor*/
    /*Tiene que llevar el mismo nombre que de la clase principal
    Rectángulo*/
    public Rectangulo(int base, int altura) {
        this.vBase = base;
        this.vAltura = altura;
    }

    /*Método a ser llamado*/
    public void Operacion () {
        Resultado = vBase * vAltura;
        System.out.println("El área es: " + this.Resultado);
    }
}
