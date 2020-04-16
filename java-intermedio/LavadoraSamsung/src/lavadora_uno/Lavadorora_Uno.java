
package lavadora_uno;

import java.util.Scanner;

import Libreria.FuncionesLogicasLavadora;


public class Lavadorora_Uno {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("¿La ropa es blanca o de color?");
        System.out.println("Presiona 1 - ropa blanca / 2 - ropa de color");
        
        int tipo_ropa = entrada.nextInt();
        
        System.out.println("¿Cuantos kilos de ropa?");
        
        int kilos = entrada.nextInt();
        
        // se instancia la clase con la logica de negocios
        FuncionesLogicasLavadora mensajero = new FuncionesLogicasLavadora(kilos, tipo_ropa);
        
        // se utilizan los metodos setter de la clase instanciada
        // se enviará un valor 2 siempre 
         mensajero.setTipo_ropa(2);
        // se modifica el valor a la fuerza
         mensajero.setKilos(15);
        
        System.out.println("El tipo de ropa es: " + mensajero.getTipo_ropa());
        
        // solo se puede llamar al metodo encapsulado de forma publica 
        mensajero.CicloFinalizado();
    }
}