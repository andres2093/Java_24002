package r2;

public class R2 {
    public static void main(String[] args) {
        Combustible combustible = new Combustible((short) 45, (short) 20);

        Llanta llanta1 = new Llanta(205, 16, 35);
        Llanta llanta2 = new Llanta(205, 16, 35);
        Llanta llanta3 = new Llanta(205, 16, 35);
        Llanta llanta4 = new Llanta(205, 16, 35);

        Vehiculo vehiculo1 = new Vehiculo(combustible);
        vehiculo1.colocaLlantas(llanta1, llanta2, llanta3, llanta4);

//        for (int i = 0; i < 10; i++) {
//            vehiculo1.avanza();
//        }

        Vehiculo vehiculo2 = new Vehiculo(combustible);
        vehiculo2.colocaLlantas(llanta1, llanta2, llanta3, llanta4);

        System.out.println("Comparar: " + vehiculo1.equals(vehiculo2));
    }
}
