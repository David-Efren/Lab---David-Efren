package p119_Organismo;

public class App {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

    // Perro
        Perro miperro = new Perro("Lassie");
        System.out.println("Mi perro " + miperro.getNombre() + ", en acción:");
        // Llamar métodos del perro
        miperro.respiracion();
        miperro.movimiento();
        miperro.crecimiento();
        miperro.multiCelular();
        miperro.sangreCaliente();
        miperro.correr();
        miperro.cuatroPatas();
        
    //Perico
        System.out.println();
        Perico miperico = new Perico("Sparrow");
        System.out.println("Mi perico " + miperico.getNombre() + ", en acción:");
        miperico.respiracion();
        miperico.movimiento();
        miperico.crecimiento();
        miperico.multiCelular();
        miperico.sangreCaliente();
        miperico.volar();
        miperico.dosPatas();
        System.out.println();
    }
}
