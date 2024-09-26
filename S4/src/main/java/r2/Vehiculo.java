package r2;

import java.util.Arrays;

public class Vehiculo {
    private Llanta[] llantas = new Llanta[4];
    private Combustible combustible = new Combustible();

    public Vehiculo() {
    }

    public Vehiculo(Combustible combustible) {
        this.combustible = combustible;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    public void colocaLlantas(Llanta llanta1, Llanta llanta2, Llanta llanta3, Llanta llanta4) {
        llantas[0] = llanta1;
        llantas[1] = llanta2;
        llantas[2] = llanta3;
        llantas[3] = llanta4;
    }

    public void llenarTanque() {
        combustible.setLitrosActuales(combustible.getLitrosMaximos());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return true;

        Vehiculo vehiculo = (Vehiculo) obj;

        if (!Arrays.equals(llantas, vehiculo.llantas)) return false;
        return combustible.equals(vehiculo.combustible);
    }

    public void avanza() {
        if (combustible.getLitrosActuales() > 0) {
            for (Llanta llanta : llantas) {
                llanta.rueda();
            }
            combustible.usa();
        } else {
            System.out.println("No hay combustible");
            System.exit(1);
        }
    }
}