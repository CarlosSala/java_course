import java.util.Scanner;

public class SistemaVacaciones {

    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);
        String nombre;
        int clave, antiguedad;

        System.out.println("Bienvenido a la compañia");

        System.out.println("¿Cual es tu nombre?");
        nombre = teclado.nextLine();

        System.out.println("Clave de departamento: ");
        clave = teclado.nextInt();

        System.out.println("Antiguedad: ");
        antiguedad = teclado.nextInt();

        teclado.close();

        if (clave == 1) {
            if (antiguedad == 1) {
                System.out.println(nombre + " tienes 6 dias de vacaciones");
            } else if (antiguedad >= 2 && antiguedad <= 6) {
                System.out.println(nombre + " tienes 14 dias de vacaciones");
            } else if (antiguedad >= 7) {
                System.out.println(nombre + " tienes 20 dias de vacaciones");
            }

        } else if (clave == 2) {
            if (antiguedad == 1) {
                System.out.println(nombre + " tienes 7 dias de vacaciones");
            } else if (antiguedad >= 2 && antiguedad <= 6) {
                System.out.println(nombre + " tienes 15 dias de vacaciones");
            } else if (antiguedad >= 7) {
                System.out.println(nombre + " tienes 22 dias de vacaciones");
            }

        } else if (clave == 3) {

            if (antiguedad == 1) {
                System.out.println(nombre + " tienes 10 dias de vacaciones");
            } else if (antiguedad >= 2 && antiguedad <= 6) {
                System.out.println(nombre + " tienes 20 dias de vacaciones");
            } else if (antiguedad >= 7) {
                System.out.println(nombre + " tienes 30 dias de vacaciones");
            }
        }
    }
}	