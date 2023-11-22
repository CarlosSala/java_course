/* modificadores de acceso:
 -por defecto: solo entre clases del mismo paquete pueden accederse
 -public: permite acceder a los atributos o metodos desde cualquier clase
 -private: los atributos y metodos solo pueden ser accedidios desde la clase que los declaró
 -protected: solo entre clases del mismo paquete pueden accederse, ademas cuando se utiliza
  la herencia independiente de si las  clases pertenecen al mismo paquete o no
 -se debe importar la clase cuando esta pertenece a otro paquete
 */
package paquete1;

public class ClaseDos {

    String valorUno = "Accesible";
    public String valorDos = "Accesible";
    private String valorTres = "Accesible";
    protected String valorCuatro = "Accesible";

    public void MiMetodo() {

    }

    // metodos Getter y Setter
    public String get_ValorTres() {
        return valorTres;
    }

    public void set_ValorTres(String valorTres) {
        this.valorTres = valorTres;
    }
}
