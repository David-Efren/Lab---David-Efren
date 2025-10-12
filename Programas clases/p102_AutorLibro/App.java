package p102_AutorLibro;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");

        Libro lib1 = new Libro("HACK123456","Hacking exposed 4",1200,new Autor("John Persona", "john@example.com",50),3);
        System.out.println(lib1);

        Libro lib2 = new Libro("JAVA987654","Java for dummies",800,new Autor("Jane Persona", "jane@example.com",45),5);
        System.out.println(lib2);

        System.out.println("\nHacemos unos cambios al libro dos :");
        lib2.setPrecio(750);
        lib2.setStock(10);
        System.out.println("\n"+lib2);

        System.out.println("\nDatos del libro dos por separado :\n");
        System.out.println("\tISBN :\t" + lib2.getIsbn());
        System.out.println("\tTítulo :\t" + lib2.getTitulo());  
        System.out.println("\tPrecio :\t" + lib2.getPrecio());
        System.out.println("\tStock :\t" + lib2.getStock());
        System.out.println("\nDatos del autor del libro dos :\n"); 
        System.out.println("\tAutor :\t" + lib2.getAutor().getNombre());
        System.out.println("\tCorreo del autor :\t" + lib2.getAutor().getCorreo());
        System.out.println("\tEdad del autor :\t" + lib2.getAutor().getEdad());
    }
}
