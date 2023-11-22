


public class Suma_ClaseHija extends Operaciones_ClasePadre{
    
    /* Override o sobreescribir hace referencia a un
     metodo que ya esta declaradao en otra clase,
     cuando se sobre escribe un metodo se esta 
     utilizando el polimorfismo
    */
    
    @Override
    public void Operaciones(){
        
        resultado = valor1 + valor2;
    }
}
