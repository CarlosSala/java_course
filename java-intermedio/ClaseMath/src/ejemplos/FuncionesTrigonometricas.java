
package ejemplos;

public class FuncionesTrigonometricas {
    
    public static void main(String[] args) {
        
        double resultado = 0;
        double anguloEnGrados = 45;
        
        double anguloEnRadianes = Math.toRadians(anguloEnGrados);
        
        // las funciones trigonometricas necesitan el angulo en radianes
        //seno 
        resultado = Math.sin(anguloEnRadianes);
        System.out.println("Seno de " + anguloEnGrados + "° = " + resultado);
    
        //Coseno
        resultado = Math.cos(anguloEnRadianes);
        System.out.println("Coseno de " + anguloEnGrados + "° = " + resultado);
        
        //Tangente
        resultado = Math.tan(anguloEnRadianes);
        System.out.println("Tangente de " + anguloEnGrados + "° = " + resultado);
    
        double valorIngresado = 0.707;
        
        // arco coseno
        anguloEnRadianes = Math.acos(valorIngresado);
        anguloEnGrados = Math.toDegrees(anguloEnRadianes);
        System.out.println("Arco coseno de: " + valorIngresado + " = " + anguloEnGrados + "°");
    
        // arco seno
        anguloEnRadianes = Math.asin(valorIngresado);
        anguloEnGrados = Math.toDegrees(anguloEnRadianes);
        System.out.println("Arco seno de: " + valorIngresado + " = " + anguloEnGrados + "°");
    
        // arco tangente
        anguloEnRadianes = Math.atan(valorIngresado);
        anguloEnGrados = Math.toDegrees(anguloEnRadianes);
        System.out.println("Arco tangente de: " + valorIngresado + " = " + anguloEnGrados + "°");
    
    } 
}
