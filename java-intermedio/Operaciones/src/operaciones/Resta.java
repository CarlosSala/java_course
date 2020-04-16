
package operaciones;

public class Resta {
    
    int valor1, valor2, resultado;
    
    public Resta(int valor1, int valor2){
    
        this.valor1 = valor1;
        this.valor2 = valor2;
        
    }
    
    public void Restar(){
    
        resultado = valor1 - valor2;
        
    }
    
    public void Resultado(){
    
        Restar();
        System.out.println("El resultado de la resta es " + resultado);
        
    }
    
    
    
}
