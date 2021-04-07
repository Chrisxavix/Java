package teoria.modificadores.privado.paquete1;

public class Atributos_Metodos_Priv {
    private int valorUno = 25;
    private int valorDos = 50;
    private String valorTres = "Valor";

    private void metodoMaggot() {
        System.out.println("Metodo Atributos, valor uno: " + valorDos);
    }

    /*Getter*/
    public int getValorUno() {
        /*Le envío el dato, siempre retorna algo*/
        return valorUno;
    }

    /*Setter*/
    public void setValorDos(int rValorDos) {
        this.valorDos = rValorDos;
    }

}
