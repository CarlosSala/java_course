
public class ClasePrincipal {

  public static void main(String[] args) {

    // hilos en estado new, creados pero no
    // iniciados, ya que no se ha arrancado el
    // metodo start();
    Hilo_Proceso hilo1 = new Hilo_Proceso();
    Hilo_Proceso hilo2 = new Hilo_Proceso();

    // hilos en estado runneable, con el metodo
    // start() ya iniciado
    hilo1.start();
    hilo2.start();
 
    // hilos en estado bloqueado o no runneable
    // algo lo bloquea o evita su ejecucion
    // un ejemplo es dormir el hilo por 1000 ms o 1 seg

    // para usar el metodo sleep se debe utilizar try - catch
    // try {
    // Thread.sleep(5000);
    // } catch (InterruptedException e) {
    // System.out.println("Error en el hilo " + e);
    // }

    // hilo en estado stop
    // hilo2.stop();

  }
}
