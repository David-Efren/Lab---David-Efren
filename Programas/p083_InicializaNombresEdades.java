public class p083_InicializaNombresEdades {
    public static void main(String[] args) {
        String[] nombres = {"Juan", "Pedro", "Luis", "Jose", "Mateo", "Maria"};
        int[] edades = {22, 25, 44, 38, 50, 16};

        System.out.println("\nLos nombres son :");
        for (String nombre : nombres)
            System.out.println(" " + nombre);

        System.out.println("\nLas edades son:");
        for (int edad : edades)
            System.out.println(" " + edad);

        System.out.println("\nCada nombre con su respectiva edad");
        // for normal es mejor para varios arreglos?
        for (int i = 0; i < nombres.length; i++)
            System.out.printf("Nombre :\t%s\nEdad   :\t%d\n\n", nombres[i], edades[i]);
    }
}
