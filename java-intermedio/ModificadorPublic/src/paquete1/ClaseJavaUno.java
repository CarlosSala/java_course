package paquete1;

public class ClaseJavaUno {

    public static void main(String[] args) {

        // se instancia la clase creando un objeto del tipo de la clase
        Atributos_Metodos mensajero = new Atributos_Metodos();

        System.out.println("Pruebas de modificadores de acceso desde una clase distinta, pero del mismo paquete");

        // modificador por defecto
        System.out.println("variable sin modificador: " + mensajero.valorUno);

        // modificador public  
        System.out.println("Variable con modificador public: " + mensajero.valorDos);

        // modificador private
        System.out.println("Variable con modificador private: mensajero.valorTres = error");

        System.out.println("Variable con modificador private, se ajusta usando un Setter");
        mensajero.set_ValorTres("Valor establecido desde otra clasae usando un Setter");

        System.out.println("Variable con modificador private se trae usando un Getter: " + mensajero.get_ValorTres());

        System.out.println("Variable con modificador protected: " + mensajero.valorCuatro);
    }
}
