package e1;

public class E1 {
    public static void main(String[] args) {
        Contador c1 = new Contador();
        System.out.println("C1 Ins: " + c1.getContadorInstancia());
//        System.out.println("C1 Class: " + c1.getContadorClase());
        System.out.println("C1 Class: " + Contador.getContadorClase());
        System.out.println();
        Contador c2 = new Contador();
        System.out.println("C2 Ins: " + c2.getContadorInstancia());
        System.out.println("C2 Class: " + Contador.getContadorClase());
        System.out.println();
        Contador c3 = new Contador();
//        c2.setContadorClase((short) 15);
        System.out.println("C3 Ins: " + c3.getContadorInstancia());
        System.out.println("C3 Class: " + Contador.getContadorClase());
        System.out.println();
        Contador c4 = new Contador();
        System.out.println("C4 Ins: " + c4.getContadorInstancia());
        System.out.println("C4 Class: " + Contador.getContadorClase());
    }
}
