
package clases;


public class ClasePrincipal {
    
    public static void main(String[] args) {
        
        // hilos en estado new, creados pero no 
        // creados, ya que no se ha iniciado el 
        // metodo start();
        Hilo_Proceso hilo1 = new Hilo_Proceso();
        Hilo_Proceso hilo2 = new Hilo_Proceso();
        
        
        // hilos en estado runneable, con el metodo
        // start() ya iniciado
        hilo1.start();
       
        // hilos en estado bloqueado o no runneable
        // algo lo bloquea o evita su ejecucion
       // un ejemplo es dormir el hilo por 1000ms o 1 seg
        
        // para usar el metodo sleep se debe utilizar try - catch
      // try{
        //    hilo1.sleep(1000);
       // } catch(InterruptedException e){
         //   System.out.println("Error en el hilo " + e);
       // }
       // hilo2.start();
        
        // hilo en estado stop
    //    hilo2.stop();
        
      //  try{
        //    hilo2.sleep(1000);
      //  } catch(InterruptedException e){
       //     System.out.println("Error en el hilo " + e);
      //  }
    }  
} 
