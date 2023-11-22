package paquete1;

// Clases de otros paquetes se deben impotar
import paquete2.ClaseTres;

public class ClaseUno {

    public static void main(String[] args) {

        // accesar atributos de una clase en el mismo paquete
        ClaseDos mensajero = new ClaseDos();

        System.out.println("Test de modificadores de acceso desde una clase distinta, pero del mismo paquete\n");

        // modificador por defecto
        System.out.println("variable sin modificador: " + mensajero.valorUno);

        // modificador public
        System.out.println("Variable con modificador public: " + mensajero.valorDos);

        // modificador private
        System.out.println("Variable con modificador private: no es accesible, pero si usando setter and getter");

        mensajero.set_ValorTres("Valor establecido desde otra clase usando un Setter");

        System.out.println("Variable con modificador private se trae usando un Getter: " + mensajero.get_ValorTres());

        // modificador protected
        System.out.println("Variable con modificador protected: " + mensajero.valorCuatro);

        // accesar atributos de una clase en otro paquete
        ClaseTres mensajero1 = new ClaseTres();

        System.out.println("\nTest de modificadores de acceso desde una clase distinta y de diferente paquete\n");

        // modificador por defecto
        System.out.println("variable sin modificador: no accesible");

        // modificador public
        System.out.println("Variable con modificador public: " + mensajero1.valorDos);

        // modificador private
        System.out.println("Variable con modificador private: no es accesible, pero si usando setter and getter");

        mensajero1.set_ValorTres("Valor establecido desde otra clase en otro paquete usando un Setter");

        System.out.println("Variable con modificador private se trae usando un Getter: " + mensajero1.get_ValorTres());

        // modificador protected
        System.out.println("Variable con modificador protected: no accesible");

    }
}
