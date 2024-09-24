package e1;

import java.io.Console;
import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Escribe tu nombre: ");
        String nombre1 = scanner.nextLine();
        System.out.println("1. Hola " + nombre1);

//        Segunda parte
        Console console = System.console();
        if (console == null) {
            System.out.println("No hay consola");
            System.exit(1);
        }
//        System.out.println("2. Escribe tu nombre: ");
//        String nombre2 = console.readLine();

        String nombre2 = console.readLine("%s", "Escribe tu nombre: ");
        System.out.println("2. Hola " + nombre2);
    }
}
