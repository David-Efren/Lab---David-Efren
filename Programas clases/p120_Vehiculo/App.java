package p120_Vehiculo;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("INTERFACES DE JAVA - HERENCIA EN INTERFACES Y CLASES");

        Sedan miSedan = new Sedan("Sedan LX", "Jane Silksong", 5);
        System.out.println(miSedan);
        miSedan.sistemaElectrico();
        miSedan.combustionInterna();
        miSedan.carroceriaTres();
        miSedan.chasisMonocasco();
        miSedan.reposar();
        miSedan.arrancar();
        miSedan.frenar();

        Suv miSuv = new Suv("Suv LX", "John Persona", 7);
        System.out.println(miSuv);
        miSuv.sistemaElectrico();
        miSuv.combustionInterna();
        miSuv.traccion4x4();
        miSuv.chasisIndependiente();
        miSuv.reposar();
        miSuv.arrancar();
        miSuv.frenar();
    }
}
