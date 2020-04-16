package paquete2;

// Clases de otros paquetes se deben impotar
import paquete1.Atributos_Metodos;

public class ClaseJavaDos {
    
    public static void main (String[] args){
        
        // instancia la clase Atributos_Metodos
        Atributos_Metodos mensajero = new Atributos_Metodos();
        
        System.out.println("Pruebas de modificadores de acceso desde una clase distinta y de diferente paquete");
        
        // modificador por defecto
        System.out.println("variable sin modificador: mensajero.valorUno = error");
        
        // modificador public 
        System.out.println("Variable con modificador public: " + mensajero.valorDos);
        
        // modificador private
        System.out.println("Variable con modificador private: mensajero.valorTres = error");
    
        System.out.println("Variable con modificador private, se ajusta usando un Setter");
        
        mensajero.set_ValorTres("Valor establecido desde otra clase en otro paquete usando un Setter");
        
        System.out.println("Variable con modificador private se trae usando un Getter: " + mensajero.get_ValorTres());
    
        System.out.println("Variable con modificador protected: mensajero.valorCuatro = error");
    }
}