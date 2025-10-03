public class p082_InicializaArregloCadenas {
    public static void main(String[] args) {
        // Inicializa arreglo
        String[] municipios = new String[10];
        // Define valores uno a uno, 0 = al primer espacio
        municipios[0] = "Apozol";
        municipios[1] = "Apulco";
        municipios[2] = "Cañitas";
        municipios[3] = "Jerez";
        municipios[4] = "Fresnillo";
        municipios[5] = "Rio Grande";
        municipios[6] = "Sain Alto";
        municipios[7] = "Sombrerete";
        municipios[8] = "Teul de Gonzalez Ortega";
        municipios[9] = "Zacatecas";
        // Imprime
        System.out.print("\033[H\033[2J");

        System.out.printf("Primer elemento del arreglo :\t%s\n", municipios[0]);
        System.out.printf("Ultimo elemento del arreglo :\t%s\n", municipios[4]);
        System.out.println("\nTodos los elementos del arreglo con ciclo for :");
        // .length = tamaño del arreglo
        for (int i = 0; i < municipios.length; i++) {
            System.out.printf("%s ", municipios[i]);
        }
        System.out.println("\n\nTodos los elementos del arreglo con ciclo for-each :");
        // for each no necesita indice??
        for (String i : municipios) {
            System.out.printf("%s ", i);
        }
        System.out.println("\n\nProceso terminado ");
    }
}
