package teoria.settergetter.encapsulamiento.logicaLavadora;

public class LogicaLavadora {
    /*Se quiere dar acceso a tipoRopa*/
    private int kilos = 0, llenadoCompleto = 0, tipoRopa = 0,
            lavadoCompleto = 0, secadoCompleto = 0;

    public LogicaLavadora (int kilos, int tipoRopa) {
        this.kilos = kilos;
        this.tipoRopa = tipoRopa;
    }

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
                System.out.println("Ropa Blanca, suave");
                lavadoCompleto = 1;
            } else if (tipoRopa == 2) {
                System.out.println("Ropa Colorida, intenso");
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

    /*Setter y Getter*/

    /*Getter*/
    public int getTipoRopa() {
        /*Le envío el dato, siempre retorna algo*/
        return tipoRopa;
    }

    /*Setter*/
    public void setTipoRopa(int rTipoRopa) {
        this.tipoRopa = rTipoRopa;
    }
}
