public class Hello{
    public static void main(String args[]){
		System.out.println("hola mundo");
	}
}
/*
El clásico ``Hello World''.

Crear un archivo llamado Hello.java con
public class Hello {
    public static void main (String args[]) {
        System.out.println("Hello World!");
    }
}
Compilar con: javac Hello.java
Ejecutar con: java Hello
Observaciones:

Luego viene la definición de una clase llamada Hello1:
public class Hello { ... }

En Java un programa es un conjunto de definiciones de clases que están dispuestas en uno o más archivos.

Dentro de la clase Hello se define el método main o principal:
public static void main (String args[]) { ... }

En una clase se definen uno o más métodos.

Las palabras public y static son atributos del método.
La palabra void indica que el método main no retorna ningún valor.
La forma (String args[]) es la definición de los argumentos que recibe el método main.
En este caso se recibe un argumento. Los paréntesis [] indican que el argumento es un arreglo 
y la palabra String es el tipo de los elementos del arreglo.
Por lo tanto main recibe como argumento un arreglo de strings que corresponden 
a los argumentos con que se invoca el programa.

Consideraciones importantes:
El nombre del archivo (Hello.java) siempre debe ser el nombre de la clase (Hello) con la extensión
 ``.java''.
Todas las aplicaciones deben definir el método main.
Al invocar el intérprete de java con java Hello, se busca y se invoca un método main que textualmente 
haya sido definido con:
public static void main (String args[]) { ... }
*/