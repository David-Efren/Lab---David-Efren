public class p081_InicializaArregloNumeros {
    public static void main(String[] args) {
        // Inicializa arreglo
        double[] nums = new double[7];
        // Define valores uno a uno, 0 = al primer espacio
        nums[0] = 5.0; 
        nums[1] = 10.0;
        nums[2] = 15.5; 
        nums[3] = 20.5;
        nums[4] = 25.0; 
        nums[5] = 100.22; 
        nums[6] = 90.0; 

        // Imprime
        System.out.print("\033[H\033[2J");

        System.out.printf("Primer elemento del arreglo :\t%.2f\n", nums[0]);
        System.out.printf("Ultimo elemento del arreglo :\t%.2f\n", nums[6]);
        System.out.println("\nTodos los elementos del arreglo con ciclo for :");
        // .length = tamaño del arreglo
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("%.2f ", nums[i]);
        }
        System.out.println("\n\nTodos los elementos del arreglo con ciclo for-each :");
        // for each no necesita indice??
        for (double i : nums) {
            System.out.printf("%.2f ", i);
        }
        System.out.println("\n\nProceso terminado ");
    }
}