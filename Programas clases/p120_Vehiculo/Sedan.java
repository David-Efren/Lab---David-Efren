package p120_Vehiculo;

public class Sedan extends Maquina implements Familia {

    public Sedan(String nombre, String propietario, int pasajeros) {
        super(nombre, propietario, pasajeros);
    }

    @Override
    public void sistemaElectrico() {
        System.out.println("Vehiculo con sistema electrico de sedan");
    }

    @Override
    public void combustionInterna() {
        System.out.println("Vehiculo con combustion interna de sedan");
    }

    @Override
    public void carroceriaTres() {
        System.out.println("Vehiculo familiar con tres partes de Sedan");
    }

    @Override
    public void chasisMonocasco() {
        System.out.println("Vehiculo familiar con chasis monocasco de Sedan");
    }
}
