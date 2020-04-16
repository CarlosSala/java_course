// clase sin un metodo principal,
// solo con la logica de negocios
package Libreria;

    public class FuncionesLogicasLavadora {
    
        // el encapsulamiento es indicar cuales variables o meteodos 
        // son publicos o privados
    private int kilos = 0, llenado_completo = 0, tipo_ropa = 0,
            lavado_completo = 0, secado_completo = 0;
        
        public FuncionesLogicasLavadora (int kilos, int tipo_ropa){
            this.kilos = kilos;
            this.tipo_ropa = tipo_ropa;
        }
        
        // metodos encapsulados de forma privada
        private void Llenado(){
            if(kilos <=12){
             
                System.out.println("Llenando..");
                System.out.println("Llenado completo,");
            } else {
                System.out.println("La carga de ropa debe ser reducida");
            }
        }
        
        private void Lavado(){
            Llenado();
           
                if(tipo_ropa == 1){
                    System.out.println("Ropa blanca / lavado suave");
                    System.out.println("lavando...");
                    
                } else if (tipo_ropa == 2){
                    System.out.println("Ropa de color / lavado intenso");
                    System.out.println("lavando...");
                   
                }else {
                    System.out.println("El tipo de ropa no esta disponible.");
                    System.out.println("Se lavará como ropa de color / lavado intenso");
                    System.out.println("lavando...");
                  
                }
            }
        
        private void Secado(){
            Lavado();
            
                System.out.println("Secando...");
               
            }
        
        public void CicloFinalizado(){
            Secado();
            
                System.out.println("Tu ropa esta lista");
            }
        
        
        // setter y getter, para acceder a las variables privadas
        
        public int getTipo_ropa(){
            return tipo_ropa;
        }
        public void setTipo_ropa(int tipo_ropa){
            // this para señalar a las variables declaradas dentro de
            // la clase
            this.tipo_ropa = tipo_ropa;
        }
        
        public void setKilos(int kilos) {
        this.kilos = kilos;
    }
}