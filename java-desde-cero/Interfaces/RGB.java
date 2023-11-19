import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RGB extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JLabel label1, label2, label3;
    private JComboBox<String> combo1, combo2, combo3;
    private JButton button1;

    public static void main(String args[]) {

        RGB formulario1 = new RGB();
        formulario1.setBounds(0, 0, 190, 220);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
    }

    public RGB() {

        setLayout(null);
        label1 = new JLabel("Rojo:");
        label1.setBounds(10, 10, 100, 10);
        add(label1);

        combo1 = new JComboBox<>();
        combo1.setBounds(120, 10, 50, 30);
        for (int i = 0; i <= 255; i++) {
            combo1.addItem(String.valueOf(i));
        }
        add(combo1);

        setLayout(null);
        label2 = new JLabel("Verde");
        label2.setBounds(10, 50, 100, 10);
        add(label2);

        combo2 = new JComboBox<>();
        combo2.setBounds(120, 50, 50, 30);
        for (int i = 0; i <= 255; i++) {
            combo2.addItem(String.valueOf(i));
        }
        add(combo2);

        setLayout(null);
        label3 = new JLabel("Azul");
        label3.setBounds(10, 90, 100, 10);
        add(label3);

        combo3 = new JComboBox<>();
        combo3.setBounds(120, 90, 50, 30);
        for (int i = 0; i <= 255; i++) {
            combo3.addItem(String.valueOf(i));
        }
        add(combo3);

        button1 = new JButton("Fijar Color");
        button1.setBounds(10, 130, 100, 30);
        add(button1);
        button1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent evento) {
        
        if (evento.getSource() == button1) {
            String texto1 = combo1.getSelectedItem().toString();
            String texto2 = combo2.getSelectedItem().toString();
            String texto3 = combo3.getSelectedItem().toString();

            int rojo = Integer.parseInt(texto1);
            int verde = Integer.parseInt(texto2);
            int azul = Integer.parseInt(texto3);

            Color color1 = new Color(rojo, verde, azul);
            button1.setBackground(color1);
        }
    }

}