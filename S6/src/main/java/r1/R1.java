package r1;

public class R1 {
    public static void main(String[] args) {
        Figura figura = new Triangulo();
        llamaCalculaArea(figura);

        figura = new Rectangulo();
        llamaCalculaArea(figura);

        figura = new Cuadrado();
        llamaCalculaArea(figura);
    }

    public static void llamaCalculaArea(Figura figura){
        figura.formulaCalculaArea();
    }
}
