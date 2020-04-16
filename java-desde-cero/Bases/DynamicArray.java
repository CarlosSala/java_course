import java.util.Scanner;

public class DynamicArray {

    public static void main(String args[]) {

        int longitud = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Cuantos numeros deseas ingresar? ");
        longitud = entrada.nextInt();

        int numeros[] = new int[longitud];

        for (int i = 0; i < numeros.length; i++) {
            // si el indice no va entre ( ) , no se realiza la suma
            System.out.print("ingrese el valor " + (i + 1) + ": ");
            // se guarda el valor ingresado en el array
            numeros[i] = entrada.nextInt();
        }

        entrada.close();
        
        // para recorrer el array y mostrar sus valores en pantalla
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }
}