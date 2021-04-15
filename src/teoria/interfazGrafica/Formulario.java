package teoria.interfazGrafica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formulario extends JFrame implements ActionListener {

    private JTextField textField1;
    private JLabel label1;
    private JButton boton1;

    public Formulario() {
        setLayout(null);
        /*Cerrar y evitar que se ejecute en segundo plano*/
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        label1 = new JLabel("Mensaje: ");
        label1.setBounds(15, 10, 100, 30);
        add(label1);

        textField1 = new JTextField();
        textField1.setBounds(80, 16, 190, 20);
        add(textField1);

        boton1 = new JButton("Mostrar");
        boton1.setBounds(10, 60, 100, 30);
        add(boton1);
        boton1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            String cadena = textField1.getText();
            JOptionPane.showMessageDialog(null, cadena);
        }
    }

    public static void main(String[] args) {
        Formulario form = new Formulario();
        form.setBounds(0, 0, 300, 180);
        form.setVisible(true);
        /*Para centrar*/
        form.setLocationRelativeTo(null);
    }
}
