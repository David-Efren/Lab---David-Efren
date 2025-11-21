package p120_Vehiculo;

public class Maquina {
    private String nombre;
    private String propietario;
    private int Pasajeros;

    public Maquina(String nombre, String propietario, int pasajeros) {
        this.nombre = nombre;
        this.propietario = propietario;
        this.Pasajeros = pasajeros;
    }

    public void reposar() {
        System.out.println("Repostando...");
    }   

    public void arrancar() {
        System.out.println("Arrancando...");
    }

    public void frenar() {
        System.out.println("Frenando...");
    }
}
