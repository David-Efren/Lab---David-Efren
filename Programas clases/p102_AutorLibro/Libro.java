package p102_AutorLibro;

public class Libro {
    private String isbn;
    private String titulo;
    private double precio;
    private Autor autor; // Composición
    private int stock;

    public Libro() {}
    public Libro(String isbn, String titulo, double precio, Autor autor, int stock) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.precio = precio;
        this.autor = autor;
        this.stock = stock;
    }

    // getters y setters
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    @Override
    public String toString() {
        return "Libro [ ISBN =\t" + isbn + " ]\n[ Título =\t" + titulo + " ]\n[ Precio =\t" + precio + " ]\n" + autor.toString() + "\n[ Stock =\t" + stock + " ]";
    }
}
