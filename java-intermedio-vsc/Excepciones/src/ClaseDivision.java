
import java.util.Scanner;

public class ClaseDivision {

    public static void main(String[] args) {

        /*
         * try {
         * // codigo inicial, que se quiere
         * // testear
         * 
         * }catch (Exception e){
         * // comportamiento del programa
         * // ante un error no previsto
         * 
         * } finally {
         * // lo que esta dentro del cuerpo de
         * // finally siempre se va a ejecutar
         * // sin importar si hubo error o no
         * }
         */

        try {
            int valor1, valor2, resultado;

            Scanner entrada = new Scanner(System.in);

            System.out.println("Ingresa el primer numero: ");
            valor1 = entrada.nextInt();

            System.out.println("Ingresa el segundo numero: ");
            valor2 = entrada.nextInt();

            entrada.close(); 

            resultado = valor1 / valor2;

            System.out.println("División: " + resultado);

        } catch (Exception e) {

            System.out.println("Error!!!" + e);

        } finally {
            System.out.println("Operacion concluida");
        }
    }
}
