import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class SegundaInterfaz extends JFrame implements ActionListener, ChangeListener {

    private JLabel label1, label2;
    private JCheckBox checkBox1;
    private JButton button1, button2;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    String nombre = "";

    public static void main(String args[]) {

        SegundaInterfaz licencia = new SegundaInterfaz();
        licencia.setBounds(0, 0, 600, 400);
        licencia.setVisible(true);
        licencia.setResizable(false);
        licencia.setLocationRelativeTo(null);
    }

    public SegundaInterfaz() {

        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Licencia de uso");
        setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

        nombre = PrimeraInterfaz.texto;

        label1 = new JLabel("Terminos y condiciones");
        label1.setBounds(215, 5, 200, 30);
        label1.setFont(new Font("Andale Mono", 1, 14));
        label1.setForeground(new Color(0, 0, 0));
        add(label1);

        textArea1 = new JTextArea();
        textArea1.setEditable(false);
        textArea1.setFont(new Font("Andale Mono", 0, 9));
        textArea1.setText("\n\n          TÉRMINOS Y CONDICIONES" +
                "\n\n            A.  PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DE LA GEEKIPEDIA DE ERNESTO." +
                "\n            B.  PROHIBIDA LA ALTERACIÓN DEL CÓDIGO FUENTE O DISEÑO DE LAS INTERFACES GRAFICAS." +
                "\n            C.  LA GEEKIPEDIA DE ERNESTO NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
                "\n\n          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE"
                +
                "\n          (LA GEEKIPEDIA DE ERNESTO Y EL AUTOR ERNESTO), NO SE RESPONSABILIZAN DEL USO QUE USTED" +
                "\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)"
                +
                "\n          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." +
                "\n\n          PARA MAYOR INFORMACIÓN SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE" +
                "\n          http://www.youtube.com/ernestoperezm");
        scrollPane1 = new JScrollPane(textArea1);
        scrollPane1.setBounds(10, 40, 565, 200);
        add(scrollPane1);

        checkBox1 = new JCheckBox("Yo " + nombre + ", Acepto");
        checkBox1.setBounds(10, 250, 300, 30);
        checkBox1.addChangeListener(this);
        add(checkBox1);

        button1 = new JButton("Continuar");
        button1.setBounds(10, 290, 100, 30);
        button1.addActionListener(this);
        button1.setEnabled(false);
        add(button1);

        button2 = new JButton("No Acepto");
        button2.setBounds(120, 290, 100, 30);
        button2.addActionListener(this);
        button2.setEnabled(true);
        add(button2);

        ImageIcon imagen = new ImageIcon("images/coca-cola.png");
        label2 = new JLabel(imagen);
        label2.setBounds(315, 135, 300, 300);
        add(label2);
    }

    public void stateChanged(ChangeEvent evento) {
        if (checkBox1.isSelected()) {
            button1.setEnabled(true);
            button2.setEnabled(false);
        } else {
            button1.setEnabled(false);
            button2.setEnabled(true);
        }
    }

    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == button1) {
            InterfazPrincipal ventanaPrincipal = new InterfazPrincipal();
            ventanaPrincipal.setBounds(0, 0, 640, 535);
            ventanaPrincipal.setVisible(true);
            ventanaPrincipal.setResizable(false);
            ventanaPrincipal.setLocationRelativeTo(null);
            this.setVisible(false);
        } else if (evento.getSource() == button2) {
            PrimeraInterfaz Bienvenido = new PrimeraInterfaz();
            Bienvenido.setBounds(0, 0, 350, 450);
            Bienvenido.setVisible(true);
            Bienvenido.setResizable(false);
            Bienvenido.setLocationRelativeTo(null);
            this.setVisible(false);
        }
    }
}