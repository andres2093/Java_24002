package e3;

public class E3 {
    public static void main(String[] args) {
        Equipo e1 = new Equipo(
                "Gladiadores",
                "Valencia",
                5
        );

        Equipo e2 = new Equipo(
                "CDMX"
        );

        System.out.println("El equipo: " + e2.getNombre() +
                " de " + e2.getCiudad() + " tiene " +
                e2.getPuntos()
        );

        e2.actualiza(10);
        e2.actualiza("Vencedores");

        System.out.println("El equipo: " + e2.getNombre() +
                " de " + e2.getCiudad() + " tiene " +
                e2.getPuntos()
        );
    }
}
