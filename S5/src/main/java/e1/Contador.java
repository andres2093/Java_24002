package e1;

public class Contador {
//    private static final short contadorClaseFinal = 2;
    private static short contadorClase;
    private short contadorInstancia;

    public Contador() {
        contadorClase++;
        contadorInstancia++;
    }

    public static void setContadorClase(short contadorClase) {
        Contador.contadorClase = contadorClase;
    }

    public static short getContadorClase() {
        return contadorClase;
    }

    public short getContadorInstancia() {
        return contadorInstancia;
    }
}
