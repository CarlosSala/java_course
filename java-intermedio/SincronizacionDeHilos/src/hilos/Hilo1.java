
package hilos;


public class Hilo1 extends Thread{
    
    @Override
    public void run(){
        for(int i = 0; i <= 5; i++){
            System.out.print(i + ": C");
            
            try{
                Hilo1.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("Erro en la clase Hilo1" + e);
            }
        }
    }
    
}
