package e2;

public class Persona implements Comparable<Persona>{
    private final String nombre, apellido;
    private float estatura;

    public Persona(String nombre, String apellido, float estatura) {
        this.estatura = estatura;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public float getEstatura() {
        return estatura;
    }

    @Override
    public int compareTo(Persona persona) {
        int posicion = Float.compare(this.estatura, persona.getEstatura());
//        System.out.println("Posición: " + posicion);
        return posicion;
    }
}
