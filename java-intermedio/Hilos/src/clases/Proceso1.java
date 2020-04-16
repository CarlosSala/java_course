
package clases;

// primera forma de implementar un hilo, con herencia
public class Proceso1 extends Thread{
    
    // metodo dentro de la clase padre Thread
    @Override
    public void run (){
        for(int i = 0; i <= 5 ; i++){
            
            System.out.println("Primer hilo");
         
        }
    }
}
