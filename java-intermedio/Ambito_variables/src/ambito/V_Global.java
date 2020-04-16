package ambito;

public class V_Global {
    
    //Variable global, no es necesario inicializarla
    // se llama desde cualquier metodo en la clase
    
	 int variable_Global = 1000;
         
	public void miMetodo() {            
		System.out.println("Valor de variableGlobal: " + variable_Global);
	}

	public void Prueba(){		
		System.out.println("Valor de variableGlobal: " + variable_Global);
	}    
}
