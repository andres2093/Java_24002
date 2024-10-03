package e1;

public class Venado extends Animal implements Hervivoro {

    public Venado(double velocidad) {
        super(velocidad);
    }

    @Override
    public void correr() {
        System.out.println("Estoy corriendo!!!");
    }

    @Override
    public void comerPlantas() {
        System.out.println("Comiendo plantas!!!");
    }
}
