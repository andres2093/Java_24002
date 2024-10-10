package r1;

import java.io.File;
import java.util.Objects;

public class R1 {
    public static void main(String[] args) {
        File directorioInicial = new File("/home/andres/Documentos/DBbackups");
        muestraContenidoDirectorio(directorioInicial);
    }

    private static void muestraContenidoDirectorio(File directorio){
        colocaEspacios(directorio.getParent(), 'D');
        System.out.println(directorio.getName());

        for (File file : Objects.requireNonNull(directorio.listFiles())) {
            if (file.isFile()) {
                colocaEspacios(file.getParent(), 'A');
                System.out.println(file.getName());
            } else if (file.isDirectory()){
                muestraContenidoDirectorio(file);
            }
        }
    }

    private static void colocaEspacios(String directorioPadre, char simbolo){
        System.out.print("[" + simbolo + "]");

        for (int i = 0; i < directorioPadre.length(); i++) {
            System.out.print("-");
        }
    }
}
