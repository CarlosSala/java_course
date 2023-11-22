
public class ClasePrincipal {

    public static void main(String[] args) {

        /*
         * programa sin hilos
         * for(int i = 0; i <= 5 ; i++){
         * System.out.println("proceso1");
         * }
         * 
         * System.out.println("");
         * 
         * for(int i = 0; i <= 5 ; i++){
         * System.out.println("proceso2");
         * }
         */
        /*
         */

        // * primero se crean los hilos u instancias
        // * y LUEGO se inician
        // * se crea un objeto o instancia SOLO
        // * cuando se usa extends Thread en la clase

        // se pueden crear varios hilos del mismo proceso
        Proceso1 hilo1 = new Proceso1();
        Proceso1 hilo3 = new Proceso1();

        // esto solo se usa cuando se usa un implements en la clase
        Thread hilo2 = new Thread(new Proceso2());

        // para iniciar los hilos
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}
