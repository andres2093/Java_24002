package e3;

public class E3 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("El valor de i es: " + i);
//            Salirse de las iteraciones
//            if (i == 5) {
//                break;
//            }
        }

        short[] valores = {1, 6, 5, 8, 7, 4, 2, 3, 9};
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + ", ");
        }
        System.out.println();
        for (short valor : valores) {
            System.out.print(valor + ", ");
        }
        System.out.println();
//      For i incrementando de 2 en 2
        for (int i = 0; i < valores.length; i += 2) {
            System.out.print(valores[i] + ", ");
        }

        System.out.println();
//        While
        short i = 0;
        while (++i <= 10){
            System.out.print(i + " ");
        }

        System.out.println();
//        do while
        i = 1;
        do {
            System.out.print(i + " ");
        } while (i++ < 10);
    }
}
