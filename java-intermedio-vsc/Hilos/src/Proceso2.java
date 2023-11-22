

// segunda forma de implementar un hilo, con implements
public class Proceso2 implements Runnable{
    
    @Override
    public void run(){
        
        for(int i = 0; i <= 5 ; i++){
            
            System.out.println("Segundo hilo");
         
        }
        
    }
}
