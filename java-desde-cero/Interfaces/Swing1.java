
// para importar todos los elementos de la libreria de graficos
import javax.swing.*;
// es necesario ser mas especifico con las importaciones de las librerias
import javax.swing.event.*;
import java.awt.*;
import java.awt.Color;
// importa funcionalidades para componentes
import java.awt.event.*;

// la clase jFrame permite crear interfaces graficas
// la palabra extends sirve para hacer uso de herencia
// ActionListener para la escucha de eventos

public class Swing1 extends JFrame implements ActionListener, ItemListener, ChangeListener {

    private static final long serialVersionUID = 1L;

    private JMenuBar menubar;
    private JMenu menu1, menu2, menu3;
    private JMenuItem menuitem1, menuitem2, menuitem3, menuItem4;

    private JButton boton1, boton2, boton3, boton4, boton5, boton6;

    // JLabel permite mostrar datos en la interfaz grafica
    // las etiquetas no se inicializan y suelen ser privadas
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;

    private JTextField textField1;
    private JTextField textField2;

    private JScrollPane scrollPane1;

    private JTextArea textArea1;

    private JComboBox<String> combo1;

    private JCheckBox check1, check2, check3;

    private JRadioButton radio1, radio2, radio3;

    private ButtonGroup buttonGroup;

    String texto = "";

    public static void main(String args[]) {

        // se crea un objeto de tipo Swing1
        Swing1 formulario1 = new Swing1();

        // se indican las coordenadas de la interfaz
        // izq, superior (en relacion a la pantalla del pc)
        // ancho y altura de la interfaz misma
        formulario1.setBounds(200, 200, 650, 650);
        formulario1.setVisible(true);
        // para la que la interfaz siempre aparezca en el centro
        // omitiendo las coordenadas anteriores
        formulario1.setLocationRelativeTo(null);
        // se restringe el reajuste del tamaño de la interfaz
        formulario1.setResizable(false);
    }

    // constructor lleva el mismo nombre de la clase
    public Swing1() {

        // setLayout sirve para utilizar coordenadas
        setLayout(null);

        // menu principal
        menubar = new JMenuBar();
        setJMenuBar(menubar);

        menu1 = new JMenu("Opciones");
        menubar.add(menu1);

        // submenu
        menu2 = new JMenu("Tamano de la ventana");
        menu1.add(menu2);

        menu3 = new JMenu("Color de fondo");
        menu1.add(menu3);

        // items
        menuItem4 = new JMenuItem("Nuevo Item");
        menuItem4.addActionListener(this);
        menu2.add(menuItem4);

        menuitem1 = new JMenuItem("Rojo");
        menuitem1.addActionListener(this);
        menu3.add(menuitem1);

        menuitem2 = new JMenuItem("Verde");
        menuitem2.addActionListener(this);
        menu3.add(menuitem2);

        menuitem3 = new JMenuItem("Azul");
        menuitem3.addActionListener(this);
        menu3.add(menuitem3);

        // usuario
        label3 = new JLabel("Usuario: ");
        label3.setBounds(10, 10, 100, 30);
        add(label3);

        textField1 = new JTextField();
        textField1.setBounds(110, 17, 100, 20);
        add(textField1);

        boton5 = new JButton("Aceptar");
        boton5.setBounds(230, 17, 100, 30);
        add(boton5);
        boton5.addActionListener(this);

        // selecciona nombre de un color
        combo1 = new JComboBox<>();
        combo1.setBounds(10, 50, 80, 20);
        add(combo1);

        combo1.addItem("rojo");
        combo1.addItem("verde");
        combo1.addItem("azul");
        combo1.addItem("amarillo");
        combo1.addItem("negro");
        combo1.addItemListener(this);

        // botones del centro de la pantalla
        label1 = new JLabel("La interfaz es funcionando");
        label1.setBounds(200, 140, 200, 20);
        add(label1);

        label2 = new JLabel("version 1.0");
        label2.setBounds(200, 160, 200, 20);
        add(label2);

        boton1 = new JButton("1");
        boton1.setBounds(110, 100, 90, 30);
        add(boton1);
        boton1.addActionListener(this);

        boton2 = new JButton("2");
        boton2.setBounds(210, 100, 90, 30);
        add(boton2);
        boton2.addActionListener(this);

        boton3 = new JButton("3");
        boton3.setBounds(310, 100, 90, 30);
        add(boton3);
        boton3.addActionListener(this);

        boton4 = new JButton("Cerrar");
        boton4.setBounds(210, 200, 100, 30);
        add(boton4);
        boton4.addActionListener(this);

        // escribir y agregar
        textField2 = new JTextField();
        textField2.setBounds(10, 240, 200, 30);
        add(textField2);

        textArea1 = new JTextArea();
        scrollPane1 = new JScrollPane(textArea1);
        scrollPane1.setBounds(10, 280, 200, 100);
        add(scrollPane1);

        boton6 = new JButton("Agregar");
        boton6.setBounds(220, 240, 90, 30);
        add(boton6);
        boton6.addActionListener(this);

        // idiomas
        check1 = new JCheckBox("Ingles");
        check1.setBounds(450, 10, 150, 30);
        check1.addChangeListener(this);
        add(check1);

        check2 = new JCheckBox("Frances");
        check2.setBounds(450, 50, 150, 30);
        check2.addChangeListener(this);
        add(check2);

        check3 = new JCheckBox("Aleman");
        check3.setBounds(450, 90, 150, 30);
        check3.addChangeListener(this);
        add(check3);

        // tamaño pantalla
        buttonGroup = new ButtonGroup();

        radio1 = new JRadioButton("640*480");
        radio1.setBounds(450, 300, 100, 30);
        radio1.addChangeListener(this);
        add(radio1);
        // se señala a que grupo pertencen los radiobutton
        buttonGroup.add(radio1);

        radio2 = new JRadioButton("800*600");
        radio2.setBounds(450, 330, 100, 30);
        radio2.addChangeListener(this);
        add(radio2);
        buttonGroup.add(radio2);

        radio3 = new JRadioButton();
        radio3 = new JRadioButton("1024*768");
        radio3.setBounds(450, 360, 100, 30);
        radio3.addChangeListener(this);
        add(radio3);
        buttonGroup.add(radio3);
    }

    // para capturar el evento
    public void actionPerformed(ActionEvent evento) {

        // getSource recupera el evento que se guardo en memoria
        Container fondo = this.getContentPane();

        if (evento.getSource() == menuitem1) {
            fondo.setBackground(new Color(255, 0, 0));
        }
        if (evento.getSource() == menuitem2) {
            fondo.setBackground(new Color(0, 255, 0));
        }
        if (evento.getSource() == menuitem3) {
            fondo.setBackground(new Color(0, 0, 255));
        }

        if (evento.getSource() == boton1) {
            label1.setText("Has presionado el boton 1");
        }
        if (evento.getSource() == boton2) {
            label1.setText("Has presionado el boton 2");
        }
        if (evento.getSource() == boton3) {
            label1.setText("Has presionado el boton 3");
        }
        if (evento.getSource() == boton4) {
            System.exit(0);
        }

        if (evento.getSource() == boton5) {
            String texto = textField1.getText();
            setTitle(texto);
        }

        if (evento.getSource() == boton6) {
            texto += textField2.getText() + "\n";
            textArea1.setText(texto);
            textField2.setText("");
        }
    }

    public void itemStateChanged(ItemEvent e) {

        if (e.getSource() == combo1) {
            String seleccion = combo1.getSelectedItem().toString();
            setTitle(seleccion);
        }
    }

    public void stateChanged(ChangeEvent evento) {

        String texto = "";
        // si el checkBox es selecionado se ejecutan las instrucciones
        if (check1.isSelected() == true) {
            texto += "Ingles-";
        }
        if (check2.isSelected() == true) {
            texto += "Frances-";
        }
        if (check3.isSelected() == true) {
            texto += "Aleman";
        }
        setTitle(texto);

        // los radiobutton son excluyentes entre ellos
        if (radio1.isSelected()) {
            setSize(640, 480);
        }
        if (radio2.isSelected()) {
            setSize(800, 600);
        }
        if (radio3.isSelected()) {
            setSize(1024, 768);
        }
    }

}