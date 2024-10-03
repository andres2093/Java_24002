package e2;

import java.time.LocalDate;
import java.time.Month;

public class E2 {
    public static void main(String[] args) {
        Profesor profesor = new Profesor(
                "Andrés",
                "Ramírez",
                "001"
        );
        profesor.mostrarDatos();

        System.out.println("/////////////////////////////////////////////");

        ProfesorInterino profesorInterino = new ProfesorInterino(
                "Beto",
                "Bedu",
                "002",
                LocalDate.of(2020, Month.APRIL, 15)
        );
        profesorInterino.mostrarDatos();
    }
}
