package p146_Fifa;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Jugador implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nombre;
    private String nacionalidad;
    private float peso;
    private LocalDateTime fechaNacimiento;
    private String posicion;
    private boolean pie;
    private int rating;

    public Jugador(String nombre, String nacionalidad, float peso, LocalDateTime fechaNacimiento, String posicion, boolean pie, int rating) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.peso = peso;
        this.fechaNacimiento = fechaNacimiento;
        this.posicion = posicion;
        this.pie = pie;
        this.rating = rating;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public boolean isPie() {
        return pie;
    }

    public void setPie(boolean pie) {
        this.pie = pie;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", peso=" + peso +
                ", fechaNacimiento=" + fechaNacimiento +
                ", posicion='" + posicion + '\'' +
                ", pie=" + pie +
                ", rating=" + rating +
                '}';
    }

    public static void guardar(List<Jugador> lista, String archivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(lista);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public static List<Jugador> leer(String archivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            return (List<Jugador>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println(e.getMessage());
            return new ArrayList<>();
        }
    }

    public static List<Jugador> inicializar() {
        List<Jugador> lista = new ArrayList<>();
        lista.add(new Jugador("Lionel Messi", "Argentina", 72.0f, LocalDateTime.of(1987, 6, 24, 0, 0), "Delantero", true, 93));
        lista.add(new Jugador("Cristiano Ronaldo", "Portugal", 83.0f, LocalDateTime.of(1985, 2, 5, 0, 0), "Delantero", true, 92));
        lista.add(new Jugador("Kevin De Bruyne", "Belgica", 70.0f, LocalDateTime.of(1991, 6, 28, 0, 0), "Mediocampista", true, 91));
        lista.add(new Jugador("Kylian Mbappe", "Francia", 73.0f, LocalDateTime.of(1998, 12, 20, 0, 0), "Delantero", true, 91));
        lista.add(new Jugador("Virgil van Dijk", "Paises Bajos", 92.0f, LocalDateTime.of(1991, 7, 8, 0, 0), "Defensa", true, 90));
        return lista;
    }
}