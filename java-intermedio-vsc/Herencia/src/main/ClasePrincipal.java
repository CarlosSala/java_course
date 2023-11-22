
package main;

// se importan dos clases que mediante extends heredaron codigo de la clase padre
import operaciones.ClaseHija_suma;
import operaciones.ClaseHija_resta;

public class ClasePrincipal {

    public static void main(String[] args) {

        // se instancia la clase hija_suma
        ClaseHija_suma mensajeroSuma = new ClaseHija_suma();
        
        // el metodo pedir datos pertenece a la clase padre, pero
        // ya la heredo la clase hija
        mensajeroSuma.PedirDatos();
        mensajeroSuma.Sumar();
        System.out.println("El resultado de la suma es: ");
        mensajeroSuma.MostrarResultado();

        ClaseHija_resta mensajeroResta = new ClaseHija_resta();

        mensajeroResta.PedirDatos();
        mensajeroResta.Restar();
        System.out.println("El resultado de la resta es: ");
        mensajeroResta.MostrarResultado();

    }
}
