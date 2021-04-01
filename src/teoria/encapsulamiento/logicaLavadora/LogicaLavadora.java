package teoria.encapsulamiento.logicaLavadora;

public class LogicaLavadora {
    /*ropa de color blanco: tipoRopa = 1*/
    /*ropa de otro color: tipoRopa = 2*/

    /*Para encapsular las variables, se utiliza el private*/
    private int kilos = 0, llenadoCompleto = 0, tipoRopa = 0,
            lavadoCompleto = 0, secadoCompleto = 0;

    public LogicaLavadora (int kilos, int tipoRopa) {
        this.kilos = kilos;
        this.tipoRopa = tipoRopa;
    }

    /*Encapsular el método de manera privada, así no serán visibles
    en otras clases*/
    private void llenado() {
        if (kilos <= 12) {
            llenadoCompleto = 1;
            System.out.println("Llenado completo.");
        } else {
            System.out.println("La carga es muy pesada, reducir.");
        }
    }

    private void lavado() {
        llenado();
        if (llenadoCompleto == 1) {
            if (tipoRopa == 1) {
                System.out.println("Ropa Blanca");
                lavadoCompleto = 1;
            } else if (tipoRopa == 2) {
                System.out.println("Ropa Colorida");
                lavadoCompleto = 1;
            } else {
                System.out.println("No existe ese tipo de ropa");
                System.out.println("Lavando como ropa de color");
                lavadoCompleto = 1;
            }
        }
    }

    private void secado() {
        lavado();
        if (lavadoCompleto == 1) {
            System.out.println("Secado completo");
            secadoCompleto = 1;
        }
    }

    public void cicloCompleto() {
        secado();
        if (secadoCompleto == 1) {
            System.out.println("Lavado Completado");
        }
    }
}
