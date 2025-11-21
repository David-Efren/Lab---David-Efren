package p146_Fifa;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Utileria {

    public static void grabarDatos(String archivo, ArrayList<Jugador> datos) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(datos);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public static ArrayList<Jugador> leerDatos(String archivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            return (ArrayList<Jugador>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println(e.getMessage());
            return new ArrayList<>();
        }
    }

    public static ArrayList<Jugador> inicializar() {
        ArrayList<Jugador> lista = new ArrayList<>();
        lista.add(new Jugador("Lionel Messi", "Argentina", 72.0f, LocalDateTime.of(1987, 6, 24, 0, 0), "Delantero", true, 93));
        lista.add(new Jugador("Cristiano Ronaldo", "Portugal", 83.0f, LocalDateTime.of(1985, 2, 5, 0, 0), "Delantero", true, 92));
        lista.add(new Jugador("Kevin De Bruyne", "Belgica", 70.0f, LocalDateTime.of(1991, 6, 28, 0, 0), "Mediocampista", true, 91));
        lista.add(new Jugador("Kylian Mbappe", "Francia", 73.0f, LocalDateTime.of(1998, 12, 20, 0, 0), "Delantero", true, 91));
        lista.add(new Jugador("Virgil van Dijk", "Paises Bajos", 92.0f, LocalDateTime.of(1991, 7, 8, 0, 0), "Defensa", true, 90));
        return lista;
    }
}