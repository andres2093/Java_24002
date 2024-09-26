package r2;

public class Llanta {
    private float ancho, diametro, presion;

    public Llanta() {
    }

    public Llanta(float ancho, float diametro, float presion) {
        this.ancho = ancho;
        this.diametro = diametro;
        this.presion = presion;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getDiametro() {
        return diametro;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }

    public float getPresion() {
        return presion;
    }

    public void setPresion(float presion) {
        this.presion = presion;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return true;

        Llanta llanta = (Llanta) obj;

        return (this.presion == llanta.getPresion() &&
                this.ancho == llanta.getAncho() &&
                this.diametro == llanta.getDiametro());
    }

    public void rueda() {
        System.out.println("Rodando...");
    }
}