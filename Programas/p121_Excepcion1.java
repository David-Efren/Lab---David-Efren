public class p121_Excepcion1 {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        int a = 1000;
        int b = 0;

        try { // Instrucciones que pueden causar una excepcion
            int c = a / b;
            System.out.println("Resultado :\t" + c);
        } catch (Exception e) { // Dividir por cero manda una excepcion, try-catch la captura
            System.out.println("Error: División por cero no permitida.");
        } finally {
            System.out.println("Esto se muestra sin importar si es error o no.");
        }
    }
}
