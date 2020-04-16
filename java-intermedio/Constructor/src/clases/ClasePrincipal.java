package clases;

public class ClasePrincipal {
    
    public static void main(String[] args){
        
    // con la clase sin constructor
        SinConstructor mensajero = new SinConstructor();
        mensajero.PedirNombre();
        mensajero.Imprimir();
        
    // con la clase con constructor
      ConConstructor mensajero1 = new ConConstructor();
    }
}
