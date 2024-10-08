package e1;

import java.util.PriorityQueue;
import java.util.Queue;

public class Colas {
    public static void main(String[] args) {
//        Parte uno
        Queue<String> cola = new PriorityQueue<>();
        cola.add("uno");
        cola.add("dos");
        cola.add("tres");
        cola.add("cuatro");
        cola.add("cinco");

        for (String cadena : cola) {
            System.out.print(" " + cadena);
        }
        System.out.println();
        String valor;
        while ((valor = cola.poll()) != null){
            System.out.print(" " + valor);
        }

//        Parte dos
        System.out.println();
        Queue<Libro> libros = new PriorityQueue<>();
        libros.add(new Libro("uno", 10));
        libros.add(new Libro("dos", 6));
        libros.add(new Libro("tres", 5));
        libros.add(new Libro("cuatro", 7));
        libros.add(new Libro("cinco", 8));
        libros.add(new Libro("seis", 9));
        libros.add(new Libro("siete", 1));
        libros.add(new Libro("ocho", 2));
        libros.add(new Libro("nueve", 4));
        libros.add(new Libro("diez", 3));

        Libro libro;
        while((libro = libros.poll()) != null){
            System.out.println(libro.getTitulo() + ": " +
                    libro.getPrioridad());
        }
    }
}
