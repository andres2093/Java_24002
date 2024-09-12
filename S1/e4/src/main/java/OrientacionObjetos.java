import models.Autor;
import models.Libro;

public class OrientacionObjetos {
    public static void main(String[] args) {
        Autor autor = new Autor();
//        autor.nombre = "Beto";
        autor.setNombre("Beto");
        autor.setApellido("Bedu");
        autor.setEdad(9);

        Libro libro = new Libro();
        libro.setTitulo("JAVA SE");
        libro.setAutor(autor);
        libro.setNumeroPaginas(250);

//        System.out.println("Autor " + autor.getNombre() + " " + autor.getApellido());
        System.out.println(
                "Autor " + libro.getAutor().getNombre() + " " + libro.getAutor().getApellido() +
                        " edad " + autor.getEdad()
        );
        System.out.println("Libro " + libro.getTitulo() + " con " + libro.getNumeroPaginas() + " páginas");
    }
}
