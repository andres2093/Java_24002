package r1;

import java.util.Scanner;

public class R1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe la palabra a analizar: ");
        String palabra = scanner.nextLine();

        int conteoVocales = 0;
        for (char c : palabra.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                conteoVocales++;
            }
        }

        System.out.println(palabra + ": " + conteoVocales);
    }
}
