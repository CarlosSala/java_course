
package operaciones;

import java.util.Scanner;

public class Operaciones {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int valor1 = 0, valor2 = 0;
                
        System.out.println("El programa solicita dos valores para ser sumados y restados.");
        
        System.out.println("Ingrese el primer valor: ");
        valor1 = teclado.nextInt();
        
        System.out.println("Ingrese el segundo valor: ");
        valor2 = teclado.nextInt();
        
        Suma adicion = new Suma(valor1, valor2);
        
        adicion.Resultado();
        
        Resta sustraccion = new Resta(valor1, valor2);
        
        sustraccion.Resultado();
        
    }
    
}
