
public class Proceso extends Thread {

    int num_int;

    public Proceso(String NombreHilo) {

        super.setName(NombreHilo);
    }

    @Override
    public void run() {

        for (int i = 0; i <= num_int; i++) {

            // con getName() se obtine el nombre del hilo
            System.out.println(i + this.getName());
        }
        System.out.println("");
    }

    // metodo para cambiar el valor de num_int
    public void ValorDeLaCondicion(int Valor) {

        this.num_int = Valor;
    }
}
