
public class Suma {

    private int valor1, valor2, resultado;

    public Suma(int valor1, int valor2) {

        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public void Sumar() {

        resultado = valor1 + valor2;
    }

    public void Resultado() {

        Sumar();
        System.out.println("El resultado de la suma es : " + resultado);
    }
}
