package e2;

public class Persona {
    private String nombre, apellidos;

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    void mostrarDatos(){
        System.out.println("Persona(nombre: " + nombre + ", apellidos: " + apellidos + ")");
    }
}
