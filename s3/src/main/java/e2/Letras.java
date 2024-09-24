package e2;

import java.util.Date;

public class Letras {
    public static void main(String[] args) {
        Lector lector = new Lector();
        lector.muestraMensaje("Escribe la palabra: ");
        String palabra = lector.leeEntrada();

        System.out.println(new Date().getTime());

        ContadorCaracteres contadorCaracteres = new ContadorCaracteres();

//        System.out.println("Hay " + contadorCaracteres.cuentaVocales(palabra) + " vocales");
//        System.out.println("Hay " + contadorCaracteres.cuentaNumeros(palabra) + " numeros");
//        System.out.println("Hay " + contadorCaracteres.cuentaConsonantes(palabra) + " consonantes");
//        System.out.println("Hay " + contadorCaracteres.cuentaSimbolos(palabra) + " simbolos");

//        En un solo FOR
        RetornoConteo retornoConteo = contadorCaracteres.cuentaEnUnMetodo(palabra);
        System.out.println("Hay " + retornoConteo.getVocales() + " vocales");
        System.out.println("Hay " + retornoConteo.getConsonantes() + " consonantes");
        System.out.println("Hay " + retornoConteo.getNumeros() + " numeros");
        System.out.println("Hay " + retornoConteo.getSimbolos() + " simbolos");

        System.out.println(new Date().getTime());
    }
}
