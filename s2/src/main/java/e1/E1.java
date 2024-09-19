package e1;

public class E1 {
    public static void main(String[] args) {
        byte valorByte = 1;
        short valorShort = 1;
        int valorInt = 1;
        long valorLong = 1L;

        float valorFloat = 1.5F;
        double valorDouble = 1.5;

        System.out.println("byte: " + valorByte);
        System.out.println("short: " + valorShort);
        System.out.println("int: " + valorInt);
        System.out.println("long: " + valorLong);
        System.out.println("float: " + valorFloat);
        System.out.println("double: " + valorDouble);

        boolean valorBoolean = true;
        char valorChar = 'B';
        System.out.println("bolean: " + valorBoolean);
        System.out.println("char: " + valorChar);

//        cast
        int num1 = (int) valorFloat;
        System.out.println("cast float: " + num1);
        int num2 = (int) valorChar;
        System.out.println("cast char: " + num2);
//        int num3 = (int) valorBoolean;
//        System.out.println("cast char: " + num2);

//        Sobrecarga de operadores
        System.out.println("int: " + valorInt);
        valorInt = valorInt + 1; // <- No es sobrecarga
        System.out.println("int: " + valorInt);
        valorInt++; // <- Es sobrecarga
        System.out.println("int: " + valorInt);

        System.out.println("char: " + valorChar);
        valorChar++;
        System.out.println("char: " + valorChar);

        String valorString = "Bedu";
        System.out.println("String: " + valorString);
    }
}
