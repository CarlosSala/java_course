public class Suma {

	public static void main(String args[]) {

		int num1 = 55, num2 = 12, result = 0;
		result = num1 + num2;
		System.out.println("Los valores son " + num1 + " y " + num2);
		System.out.println("El valor de la suma es: " + result);

		// se llama a otro metodo
		Prioridades();
	}

	public static void Prioridades() {

		int num1 = 24, num2 = 25;
		int resultado = (num1 + num2) / 7 + num1 - num2;
		System.out.println("el resultado es: " + resultado);
	}
}