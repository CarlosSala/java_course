/* el polimorfismo consiste en que un metodo
puede comportarse diferente dependiendo 
de con cual clase se comunica 
*/
package polimorfismo;
import java.util.Scanner;

// la palabra abstract debe usarse en el polimorfismo
public abstract class Operaciones_ClasePadre {
    
    // se utiliza cuando se usa herencia
    protected int valor1, valor2, resultado;
    
    Scanner entrada = new Scanner(System.in);
    
    public void PedirDatos(){
        System.out.println("Ingresa el primer valor: ");
        valor1 = entrada.nextInt();
        
        System.out.println("Ingresa el segundo valor: ");
        valor2 = entrada.nextInt();   
    }
    
    // el metodo operaciones es abstracto 
    // y para usar polimorfismo se declara,
    // pero su parte logica debe estar en un archivo 
    // separado
    public abstract void Operaciones();
    
    
    public void MostrarResultado(){
        System.out.println("El resultado es: " + resultado);
    }
}
