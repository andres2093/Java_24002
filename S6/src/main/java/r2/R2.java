package r2;

import java.util.*;

public class R2 {
    public static void main(String[] args) {
        List<String> listaFrutas = new ArrayList<>();

        Collections.addAll(listaFrutas, "Plátanos", "Sandía", "Pera", "Manzana", "Naranja", "Kiwi");
        muestraFrutas("- Lista inicial: ", listaFrutas);

        Collections.reverse(listaFrutas);
        muestraFrutas("- Lista invertida: ", listaFrutas);

        System.out.println("\nLa fruta más pequeña es: " + Collections.min(listaFrutas));
        System.out.println("\nLa fruta más grande es: " + Collections.max(listaFrutas));

        Collections.sort(listaFrutas);
        muestraFrutas("- Lista ordenada: ", listaFrutas);

        System.out.println("\nLa Pera está en la posición: " + Collections.binarySearch(listaFrutas, "Pera"));
        System.out.println("\nLa Manzana está en la posición: " + Collections.binarySearch(listaFrutas, "Manzana"));

        Collections.addAll(listaFrutas, "Manzana", "Manzana", "Manzana");
        muestraFrutas("- Nueva lista: ", listaFrutas);

        Collections.shuffle(listaFrutas);
        muestraFrutas("- Lista aleatoria: ", listaFrutas);

        System.out.println("\nHay " + Collections.frequency(listaFrutas, "Manzana") + " manzanas en la lista.");
    }

    private static void muestraFrutas(String titulo, List<String> lista) {
        System.out.println();
        System.out.print(titulo);
        for (String fruta : lista) {
            System.out.print(" " + fruta);
        }
    }
}