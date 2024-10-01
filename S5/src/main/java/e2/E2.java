package e2;

public class E2 {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(4.0,4.0, "E1");
        System.out.println("Info triángulo 1");
        t1.mostrarEstilo();
        t1.mostrarDimension();
        System.out.println("El área de t1 es: " + t1.area());
    }
}
