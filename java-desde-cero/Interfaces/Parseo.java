import javax.swing.*;
import java.awt.event.*;

public class Parseo extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JTextField textField1, textField2;
    private JLabel label1, label2, label3;
    private JButton button1;

    public static void main(String args[]) {

        Parseo formulario1 = new Parseo();
        formulario1.setBounds(0, 0, 300, 180);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
    }

    // diseño o paso de parametros a los controles en el constructor
    public Parseo() {

        setLayout(null);
        label1 = new JLabel("Valor 1: ");
        label1.setBounds(50, 5, 100, 30);
        add(label1);

        label2 = new JLabel("Valor 2: ");
        label2.setBounds(50, 40, 100, 30);
        add(label2);

        label3 = new JLabel("Resultado: ");
        label3.setBounds(120, 80, 100, 30);
        add(label3);

        textField1 = new JTextField();
        textField1.setBounds(120, 10, 150, 20);
        add(textField1);

        textField2 = new JTextField();
        textField2.setBounds(120, 40, 150, 20);
        add(textField2);

        button1 = new JButton("Sumar");
        button1.setBounds(20, 80, 80, 30);
        add(button1);
        button1.addActionListener(this);
    }

    // logica
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == button1) {
            int valor1 = 0, valor2 = 0, resultado = 0;

            valor1 = Integer.parseInt(textField1.getText());
            valor2 = Integer.parseInt(textField2.getText());
            resultado = valor1 + valor2;

            label3.setText("Resultado: " + resultado);
        }
    }

}