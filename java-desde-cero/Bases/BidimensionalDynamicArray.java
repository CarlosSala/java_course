import java.util.Scanner;

public class BidimensionalDynamicArray {

    public static void main(String args[]) {

        int filas = 0, columnas = 0, contador = 10;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Cuantas filas deseas?");
        filas = entrada.nextInt();

        System.out.println("Cuantas columnas deseas?");
        columnas = entrada.nextInt();

        entrada.close();

        int numeros[][] = new int[filas][columnas];

        for (int j = 0; j < filas; j++) {
            // se llena la fila 0 con las columnas
            for (int i = 0; i < columnas; i++) {
                numeros[j][i] = contador;
                contador++;
                System.out.print(numeros[j][i]);
            }
            // salto de linea para pasar a la fila siguiente
            System.out.println("");
        }
    }
}