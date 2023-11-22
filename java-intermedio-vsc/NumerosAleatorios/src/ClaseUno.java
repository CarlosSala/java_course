
public class ClaseUno {

    public static void main(String[] args) {

        int aleatorio = 0;
        int aleatorio1 = 0;

        // el (int) transforma los datos double a entero
        // el * 100 indica un rango de 0 a 100
        aleatorio = (int) (Math.random() * 100);
        System.out.println("Numero random ClaseUno: " + aleatorio);

        ClaseDos claseDos = new ClaseDos();
        aleatorio1 = claseDos.NumeroRandom();
        System.out.println("Numero random ClaseDos: " + aleatorio1);

    }
}
