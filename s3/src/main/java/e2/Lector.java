package e2;

import java.util.Scanner;

public class Lector {
    private Scanner scanner = new Scanner(System.in);

    public void muestraMensaje(String mensaje){
        System.out.println(mensaje);
    }

    public String leeEntrada(){
        return scanner.nextLine();
    }
}
