package r2;

public class Persona implements Comparable<Persona> {

    private final String nombre;
    private final String apellido;
    private float estatura;

    public Persona(String nombre, String apellido, float estatura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.estatura = estatura;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public float getEstatura() {
        return estatura;
    }

    @Override
    public int compareTo(Persona o) {
        return Float.compare(this.estatura, o.getEstatura());
    }
}
