import java.util.Scanner;

public class SubString {

    public static void main(String args[]) {

        String cadena_original = "", cadena_sustraccion = "";
        int num_caracteres = 0, desde = 0, hasta = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("introduce una cadena de caracteres: ");
        cadena_original = in.nextLine();

        num_caracteres = cadena_original.length();

        System.out.println("la cadena de caracteres " + cadena_original + " posee " +
                num_caracteres + " caracteres");

        System.out.print("¿Desde que caracter deseas obtener la nueva cadena? ");
        desde = in.nextInt();

        System.out.print("¿hasta que caracter de la cadena deseas obtner? ");
        hasta = in.nextInt();

        in.close();

        cadena_sustraccion = cadena_original.substring(desde, hasta);
        System.out.println("La nueva cadena es: " + cadena_sustraccion);

    }
}