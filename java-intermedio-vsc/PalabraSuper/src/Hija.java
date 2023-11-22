
public class Hija extends Padre {

    // se crea un metodo llamdo Saludar, pero este
    // no es heredado (no tiene Override)
    public void Saludar() {

        System.out.println("Hola, yo soy la hija");

        // se llama el metodo Saludar de la clase
        // padre de dos formas dstintas

        // instanciando la clase
        Padre hola = new Padre();
        hola.Saludar();

        // utilizando herencia
        // la palabra super permite utilizar metodos de la clase padre
        super.Saludar();
        super.Despedida();

    }
}
