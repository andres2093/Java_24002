package e1;

public abstract class Animal {
    private double velocidad;

    public abstract void correr();

    public Animal(double velocidad) {
        this.velocidad = velocidad;
    }

    public void camina(){
        System.out.println("Estoy caminando a " + velocidad + " km/hr");
    }
}
