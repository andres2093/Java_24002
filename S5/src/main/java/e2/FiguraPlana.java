package e2;

public class FiguraPlana {
    private final double base;
    private final double altura;

    public FiguraPlana(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    void mostrarDimension(){
        System.out.println("La base es: " + base + " y la altura: " + altura);
    }
}
