package p127_MiExcepcion;

public class FueraDeRango extends Exception { // clase que ya existe en el sistema, genera excepciones
    // excepcion personalizada
    public FueraDeRango(String error ) {
        super(error);
    }
    
}
