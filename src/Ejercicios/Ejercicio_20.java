package Ejercicios;

import javax.swing.*;

/*La palabra extends es la herencia*/
/*JFrame es para la parte visual*/
public class Ejercicio_20 extends JFrame {

    /*Interfaces Gráficas*/
    /*JLabel: para crear etiquetas*/
    /*Siempre deben ser de tipo privado*/

    private JLabel label1;

    public Ejercicio_20 () {
        setLayout(null);
        label1 = new JLabel("TestSport");
        label1.setBounds(10, 20, 200, 300);
        add(label1);
    }

    public static void main(String[] args) {
        Ejercicio_20 formulario1 = new Ejercicio_20();
        formulario1.setBounds(0,0, 400, 300);
        formulario1.setVisible(true);
        formulario1.setLocationRelativeTo(null);
    }

}
