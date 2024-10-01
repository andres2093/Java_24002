package r2;

import java.time.LocalDate;
import java.time.Month;

public class R2 {
    public static void main(String[] args) {
        Programador p = new Programador(
                "Andrés", (byte) 31, LocalDate.of(1993, Month.MAY, 5),
                77435F, "Java"
        );

        DBA d = new DBA(
                "Beto", (byte) 11, LocalDate.of(2013, Month.JANUARY, 21),
                45000F, "My SQL"
        );

        System.out.println("\n====Datos del programador====");

        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Edad: " + p.getEdad());
        System.out.println("Fecha nacimiento: " + p.getFechaNacimiento());
        System.out.println("Salario: " + p.getSalario());
        System.out.println("Lenguaje: " + p.getLenguajePrincipal());

        System.out.println("\n====Datos del DBA====");
        System.out.println("Nombre: " + d.getNombre());
        System.out.println("Edad: " + d.getEdad());
        System.out.println("Fecha nacimiento: " + d.getFechaNacimiento());
        System.out.println("Salario: " + d.getSalario());
        System.out.println("Herramiena: " + d.getHerramientaConsultas());
    }
}