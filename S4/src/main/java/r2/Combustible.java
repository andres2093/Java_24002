package r2;

public class Combustible {
    private short litrosMaximos, litrosActuales;

    public Combustible() {
    }

    public Combustible(short litrosMaximos, short litrosActuales) {
        this.litrosMaximos = litrosMaximos;
        this.litrosActuales = litrosActuales;
    }

    public short getLitrosMaximos() {
        return litrosMaximos;
    }

    public void setLitrosMaximos(short litrosMaximos) {
        this.litrosMaximos = litrosMaximos;
    }

    public short getLitrosActuales() {
        return litrosActuales;
    }

    public void setLitrosActuales(short litrosActuales) {
        this.litrosActuales = litrosActuales;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return true;

        Combustible combustible = (Combustible) obj;

        return (this.litrosActuales == combustible.getLitrosActuales() &&
            this.litrosMaximos == combustible.getLitrosMaximos());
    }

    public void usa(){
        litrosActuales--;
        System.out.println("Quedan " + litrosActuales + " litros");
    }
}