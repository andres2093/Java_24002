package r1;

public class R1 {
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo();
        Rectangulo rectangulo2 = new Rectangulo(2);
        Rectangulo rectangulo3 = new Rectangulo(3, 2);

        System.out.println("R1: " + rectangulo1.calculaArea());
        System.out.println("R2: " + rectangulo2.calculaArea());
        System.out.println("R3: " + rectangulo3.calculaArea());
    }
}
