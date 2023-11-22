
package operaciones;

import java.util.Scanner;

/*
Herencia, se usa para reutilizar codigo,
donde los atributos son las variables y los metodos son
las funciones de la clase
-Clase padre, contiene el codigo a reutilizar
-Clase hija, recicla el codigo de la clase padre
-En java solo se puede utilizar la herencia simple: eso significa que 
una clase padre puede tener varias hijas, pero una clase hija solo 
puede tener una clase padre
*/

public class ClasePadre {

    // se protegen los atributos
    protected int valor1, valor2, resultado;

    Scanner entrada = new Scanner(System.in);

    public void PedirDatos() {

        System.out.println("Ingresa el primer valor: ");
        valor1 = entrada.nextInt();

        System.out.println("Ingresa el segundo valor: ");
        valor2 = entrada.nextInt();
    }

    public void MostrarResultado() {

        System.out.println(resultado);
    }
}