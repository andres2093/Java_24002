package r2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class R2 {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Carlos", "Cortes", 1.78F);
        Persona persona2 = new Persona("Andrés", "Ramírez", 1.80F);
        Persona persona3 = new Persona("Beto", "Bedu2", 0.78F);
        Persona persona6 = new Persona("Beto", "Bedu1", 0.78F);
        Persona persona4 = new Persona("Julia", "Lopéz", 1.68F);
        Persona persona5 = new Persona("Laura", "Goméz", 1.78F);

        List<Persona> personas = new ArrayList<>();
        Collections.addAll(personas, persona1, persona2, persona3, persona4, persona5, persona6);

//        Collections.sort(personas);
        personas.sort(new ComparadorPersonas());

        for (Persona p : personas) {
            System.out.println(p.getNombre() + " " + p.getApellido() + ": " + p.getEstatura());
        }
    }
}
