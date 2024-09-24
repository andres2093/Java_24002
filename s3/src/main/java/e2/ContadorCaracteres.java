package e2;

import java.util.List;

public class ContadorCaracteres {
    public boolean isVocal(char c){
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }

    public boolean isNumero(char c){
        short codigoAscii = (short) c;
        return codigoAscii >= 48 && codigoAscii <= 57;
    }

    public boolean isConsonante(char c){
        short codigoAscii = (short) c;
        return (codigoAscii >= 97 && codigoAscii <= 122) && !isVocal(c);
    }

    public boolean isSimbolo(char c){
        return !(isVocal(c) || isNumero(c) || isConsonante(c));
    }

    public int cuentaVocales(String palabra){
        int cantidad = 0;
        for (char c : palabra.toLowerCase().toCharArray()) {
            if (isVocal(c)) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public int cuentaNumeros(String palabra){
        int cantidad = 0;
        for (char c : palabra.toLowerCase().toCharArray()) {
            if (isNumero(c)) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public int cuentaConsonantes(String palabra){
        int cantidad = 0;
        for (char c : palabra.toLowerCase().toCharArray()) {
            if (isConsonante(c)) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public int cuentaSimbolos(String palabra){
        int cantidad = 0;
        for (char c : palabra.toLowerCase().toCharArray()) {
            if (isSimbolo(c)) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public RetornoConteo cuentaEnUnMetodo(String palabra){
        int cVocales = 0, cNumeros = 0, cConsonantes = 0, cSimbolos = 0;
        for (char c : palabra.toLowerCase().toCharArray()) {
            if (isVocal(c)) {
                cVocales++;
            }
            if (isNumero(c)) {
                cNumeros++;
            }
            if (isConsonante(c)) {
                cConsonantes++;
            }
            if (isSimbolo(c)) {
                cSimbolos++;
            }
        }
        return new RetornoConteo(cVocales, cNumeros, cConsonantes, cSimbolos);
    }
}
