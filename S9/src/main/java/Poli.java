public class Poli {
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.hacerSonido();
        gato.hacerSonido("Meow");
        Perro perro = new Perro();
        perro.hacerSonido();
        perro.hacerSonido("Woof");
    }
}

class Animal {
    public void hacerSonido() {
        System.out.println("Grr...");
    }

    public void hacerSonido(String custom) {
        System.out.println(custom);
    }
}

class Gato extends Animal {

}

class Perro extends Animal {
    @Override
    public void hacerSonido(String custom) {
        super.hacerSonido(custom);
        System.out.println("Quiero croquetas!!!");
    }
}
