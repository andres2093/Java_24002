package e1;

public class E1 {
    public static void main(String[] args) {
        Venado venado = new Venado(24);
        venado.camina();
        venado.correr();
        venado.comerPlantas();

        Animal animal = venado;
        Hervivoro hervivoro = venado;
        Object objecto = venado;

        System.out.println("venado: " + (venado instanceof Venado));
        System.out.println("animal: " + (animal instanceof Animal));
        System.out.println("hervivoro: " + (hervivoro instanceof Hervivoro));
        System.out.println("objecto: " + (objecto instanceof Object));
    }
}
