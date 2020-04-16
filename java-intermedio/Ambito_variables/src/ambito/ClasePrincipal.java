package ambito;

/* 
 los tres ambitos de variables en java son:
 -local
 -global
 -estatica: también conocidas como variables de 
 clase, para llamarlas no es necesario crear un
 objeo de la clase
 */

public class ClasePrincipal {

    public static void main(String[] args) {

        // se llama a una variable estatica proveniente de la clase llamada V_Estaticas
        System.out.println("El valor de la variable estatica es: " + V_Estaticas.variableEstaticaInt);    
    
        // se llama a una variable global proveniente de la clase V_Global
        V_Global varG = new V_Global();
        System.out.println("El valor de la variable global es: " + varG.variable_Global);
        
        // Se llama al metodo Prueba proveniente de la clase V_Local
        V_Local varL = new V_Local();
        varL.Prueba();
               
    }
}
