
import java.util.Random;

public class ClaseDos {

    public int NumeroRandom() {

        int aleatorio = 0;

        // el (int) transforma los datos double a entero
        // el * 1000 indica un rango de 0 a 1000
        Random r = new Random();
        aleatorio = (int) (r.nextDouble() * 1000);

        return aleatorio;
    }
}
