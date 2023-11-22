
public class ClasePrincipal {

    public static void main(String[] args) {

        // con la clase sin constructor, se instancia y se
        // llaman a sus metodos
        SinConstructor mensajero = new SinConstructor();
        mensajero.PedirNombre();
        mensajero.Imprimir();

        // con la clase con constructor, solo se instancia
        ConConstructor mensajero1 = new ConConstructor();
    }
}
