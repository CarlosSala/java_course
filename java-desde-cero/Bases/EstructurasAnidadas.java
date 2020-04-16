public class EstructurasAnidadas {

    public static void main(String args[]) {

        int num1 = 4, num2 = 4, operacion = 0, resultado;

        if (operacion == 0) {
            resultado = num1 + num2;
            System.out.println("El resultado es: " + resultado);
        }
        if (operacion == 1) {
            resultado = num1 - num2;
            System.out.println("El resultado es: " + resultado);
        }
        if (operacion == 2) {
            resultado = num1 * num2;
            System.out.println("El resultado es: " + resultado);
        }
        if (operacion == 3) {
            resultado = num1 / num2;
            System.out.println("El resultado es: " + resultado);
        }
    }
}