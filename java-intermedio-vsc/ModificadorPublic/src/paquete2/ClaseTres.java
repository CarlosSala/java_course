package paquete2;

public class ClaseTres {

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