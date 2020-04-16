
package decimales;
import java.text.DecimalFormat;

import java.math.BigDecimal;
import java.math.RoundingMode;
        
public class ClasePrincipal {
 
    public static void main(String[] args) {
        
        double numero = 2;
        double raiz = Math.sqrt(numero);
        
        System.out.println("la raiz cuadrada de " + numero + " es " + raiz);
    
        // clase DecimalFormat, la cantidad de cero refleja la
        // cantidad de decimales que se mostraran
        DecimalFormat df = new DecimalFormat("#.0000");
        System.out.println("la raiz cuadrada de " + numero + " es " + df.format(raiz));
   
        //String format
       System.out.println("la raiz cuadrada de " + numero + " es " + String.format("%.4f", raiz));
       
       // Math.round
        System.out.println("la raiz cuadrada de " + numero + " es " + (double)Math.round(raiz * 10000d)/10000);
    
        // BigDecimal
        BigDecimal bd = new BigDecimal(raiz);
        bd = bd.setScale(4, RoundingMode.HALF_UP);
        System.out.println("la raiz cuadrada de " + numero + " es " + bd.doubleValue());
    }
}
