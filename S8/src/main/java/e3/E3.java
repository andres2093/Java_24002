package e3;

import java.time.LocalDate;
import java.time.Month;

public class E3 {
    public static void main(String[] args) {
        final String NOMBRE = "Beto";
        final String NOMBRE_2 = "BetoBedu";
        final int EDAD = 23;
        final float PROMEDIO = 8.4F;
        final LocalDate FECHA_NACIMIENTO = LocalDate.of(1996, Month.FEBRUARY, 21);

        System.out.println("Mi nombre es " + NOMBRE + ", tengo " + EDAD + " años, mi promedio es de " +
                PROMEDIO + " y nací el " + FECHA_NACIMIENTO);

        System.out.printf("Mi nombre es |%8s|, tengo |%5d| años, mi promedio es de |%2.2f| y nací el %4$te de %4$tb del %4$ty\n",
                NOMBRE, EDAD, PROMEDIO, FECHA_NACIMIENTO);

        System.out.printf("|%8s|%5s|%3s| y nací el %4$te de %4$tb del %4$ty\n",
                "NOMBRE", "EDAD", "PROMEDIO", FECHA_NACIMIENTO);

        System.out.printf("|%8s|%5d|%.2f| y nací el %4$te de %4$tB del %4$tY\n",
                NOMBRE, EDAD, PROMEDIO, FECHA_NACIMIENTO);

        System.out.printf("|%8s|%5d|%.2f| y nací el %4$te de %4$tb del %4$ty\n",
                NOMBRE_2, EDAD, PROMEDIO, FECHA_NACIMIENTO);
    }
}
