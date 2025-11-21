package p120_Vehiculo;

public class Suv extends Maquina implements TodoTerreno {

    public Suv(String nombre, String propietario, int pasajeros) {
        super(nombre, propietario, pasajeros);
    }

    @Override
    public void sistemaElectrico() {
        System.out.println("Vehiculo con sistema electrico de un SUV");
    }

    @Override
    public void combustionInterna() {
        System.out.println("Vehiculo con combustion interna de un SUV");
    }

    @Override
    public void traccion4x4() {
        System.out.println("Vehiculo todo terreno con traccion 4x4 de un SUV");
    }

    @Override
    public void chasisIndependiente() {
        System.out.println("Vehiculo todo terreno con chasis independiente de un SUV");
    }
}
