
package clase;


public class Hija extends Padre{
    
    // se crea el mismo metodo de la clase padre
    // padre, pero no heredado sin Override
    public void Saludar(){
        
        System.out.println("Hola, yo soy la hija");
        
        // con la palabra super se puede utilizar un metodo de la clase padre
        // sin la necesidad de instanciar dicha clase heredada
                
        // se llama la metedo saludar de dos formas dstintas
        Padre hola = new Padre();
        hola.Saludar();
        
        super.Saludar();
    }
}
