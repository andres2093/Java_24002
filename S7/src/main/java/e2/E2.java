package e2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class E2 {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Carlos", "Cortes", 1.78F);
        Persona persona2 = new Persona("Andrés", "Ramírez", 1.80F);
        Persona persona3 = new Persona("Beto", "Bedu", 0.78F);
        Persona persona4 = new Persona("Julia", "Lopéz", 1.68F);
        Persona persona5 = new Persona("Laura", "Goméz", 1.78F);

        List<Persona> personas = new ArrayList<>();
        Collections.addAll(personas, persona1, persona2, persona3, persona4, persona5);

        Collections.sort(personas);

        for (Persona p : personas) {
            System.out.println(p.getNombre() + " " + p.getApellido() + ": " + p.getEstatura());
        }


    }
}
