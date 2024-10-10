package r2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class R2 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(
                Files.newInputStream(Paths.get("src/main/resources/beto.png"))
        );
        BufferedOutputStream bos = new BufferedOutputStream(
                Files.newOutputStream(Paths.get("src/main/resources/beto_copia.png"))
        );

        byte[] buffer = new byte[1024];
        int bytesLeidos = 0;
        while ((bytesLeidos = bis.read(buffer)) > 0){
            bos.write(buffer, 0, bytesLeidos);
        }
        bis.close();
        bos.close();
    }
}
