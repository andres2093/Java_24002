package e2;

public class E2 {
    public static void main(String[] args) {
        Automovil automovil1 = new Automovil("Honda", "Civic", 2010, 50000);
        Automovil automovil2 = new Automovil("KIA", "Forte", 2020, 20000);
        Automovil automovil3 = new Automovil("Nissan", "Tsuru", 2000, 100000);

        System.out.println("Hash automovil 1: " + automovil1.hashCode());
        System.out.println("Hash automovil 2: " + automovil2.hashCode());
        System.out.println("Hash automovil 3: " + automovil3.hashCode());

        System.out.println("\nAutomovil 1: " + automovil1);
        System.out.println("Automovil 2: " + automovil2);
        System.out.println("Automovil 3: " + automovil3.toString());
    }
}
