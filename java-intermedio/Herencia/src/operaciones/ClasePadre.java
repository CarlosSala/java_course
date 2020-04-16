/*
Herencia, se utliza para reutilizar codigo,
donde los atributos son las variables y los metodos son
las funciones de la clase
-Clase padre, contiene el codigo a reutilizar
-Clase hija, recicla el codigo de la clase padre
-En java solo se puede utilizar la herencia simple: eso significa que 
una clase padre puede tener varias hijas, pero una clase hija solo 
puede tener una clase padre
*/
package operaciones;
import java.util.Scanner;

public class ClasePadre {
    
    // se protegen los atributos
    protected int valor1, valor2, resultado;
    
    Scanner entrada = new Scanner(System.in);
    
    // Este metodo pide valores a el usuarios
    public void PedirDatos(){
        System.out.println("Ingresa el primer valor: ");   
        valor1 = entrada.nextInt();
        
        System.out.println("Ingresa el segundo valor: ");   
        valor2 = entrada.nextInt();        
    }
    
    // Este metodo muestra el resultado
    public void MostrarResultado(){
        
        System.out.println(resultado);
    }
}
