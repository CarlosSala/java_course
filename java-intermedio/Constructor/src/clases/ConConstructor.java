package clases;

/*
 Un constructor :
 -tiene el mismo nombre de la clase
 -es el primer metodo que se ejecuta
 -no retorna datos
 -se ejecuta una vez
 -tiene por objetivo inicializar atributos

 */
import java.util.Scanner;

public class ConConstructor {

    public ConConstructor() {

        String edad = "";
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe tu edad ");
        edad = entrada.nextLine();
        System.out.println("tu edad es " + edad);
    }
}
