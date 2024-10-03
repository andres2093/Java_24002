package r1;

public abstract class Figura {
    public abstract void formulaCalculaArea();
}

class Triangulo extends Figura {

    @Override
    public void formulaCalculaArea() {
        System.out.println("( b * a ) / 2");
    }
}

class Rectangulo extends Figura {

    @Override
    public void formulaCalculaArea() {
        System.out.println("b * a");
    }
}

class Cuadrado extends Figura {

    @Override
    public void formulaCalculaArea() {
        System.out.println("l * l");
    }
}
