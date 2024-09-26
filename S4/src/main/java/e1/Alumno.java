package e1;

public class Alumno {
    private String curso;
    private byte sesion;
    private String objetivo;

//    public Alumno() {
//        curso = "Java Standard Edition II";
//        sesion = 5;
//        objetivo = "Dominar Java II";
//    }

    {
        curso = "Java Standard Edition";
        sesion = 4;
        objetivo = "Dominar Java";
    }

    {
        curso = "Java SE";
    }

    public String getCurso() {
        return curso;
    }

    public byte getSesion() {
        return sesion;
    }

    public String getObjetivo() {
        return objetivo;
    }
}
