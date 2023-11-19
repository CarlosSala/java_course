import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class TerminosYcondiciones extends JFrame implements ActionListener, ChangeListener {

    private static final long serialVersionUID = 1L;

    private JLabel label1;
    private JCheckBox checkBox1;
    private JButton button1;

    public static void main(String args[]) {
        
        TerminosYcondiciones formulario1 = new TerminosYcondiciones();
        formulario1.setBounds(0, 0, 350, 200);
        formulario1.setVisible(true);
        formulario1.setResizable(false);
        formulario1.setLocationRelativeTo(null);
    }

    public TerminosYcondiciones() {

        setLayout(null);
        label1 = new JLabel("Aceptar terminos y condiciones");
        label1.setBounds(10, 10, 400, 30);
        add(label1);

        checkBox1 = new JCheckBox("Acepto");
        checkBox1.setBounds(10, 50, 100, 30);
        checkBox1.addChangeListener(this);
        add(checkBox1);

        button1 = new JButton("Continuar");
        button1.setBounds(10, 100, 100, 30);
        add(button1);
        button1.addActionListener(this);
        // se comienza con el boton deshabilitado
        button1.setEnabled(false);

    }

    // funcionalidad del checkbox1
    public void stateChanged(ChangeEvent evento) {
        if (checkBox1.isSelected() == true) {
            button1.setEnabled(true);
        } else {
            button1.setEnabled(false);
        }
    }

    // funcionalidad del button1
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == button1) {
            System.exit(0);
        }
    }

}