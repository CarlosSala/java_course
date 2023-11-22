

public class ClasePrincipal {
    
    public static void main(String[] args){
        
        Operaciones_ClasePadre mensajero_Suma = new Suma_ClaseHija();
        
        // el metodo pedirdatos y mostrarresultados son identicos, pero
        // el metodo operaciones es diferente dependiendo de como lo
        // sobreescribió cada clase hija
        
        mensajero_Suma.PedirDatos();
        mensajero_Suma.Operaciones();
        mensajero_Suma.MostrarResultado();
        
        
        Operaciones_ClasePadre mensajero_Resta = new Resta_ClaseHija();
        
        mensajero_Resta.PedirDatos();
        mensajero_Resta.Operaciones();
        mensajero_Resta.MostrarResultado();
    }
}
