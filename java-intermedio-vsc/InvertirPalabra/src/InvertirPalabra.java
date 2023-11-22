 
import java.util.Scanner;

public class InvertirPalabra {

    public static void main(String[] args) {

        String palabra = "", palabra_invertida = "";
        int longitud_palabra = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Escribe una palabra o frase: ");
        palabra = entrada.nextLine();
        entrada.close();

        longitud_palabra = palabra.length();

        while (longitud_palabra != 0) {

            // cadena_original.substring(desde, hasta);
            // el metodo substring extrae el caracter entre la penultima y
            // ultima posicion y lo guarda en una variable de acumulacion
            palabra_invertida += palabra.substring(longitud_palabra - 1, longitud_palabra);
            longitud_palabra--;
        }
        System.out.println("la palabra invertida es: " + palabra_invertida);
    }
}
