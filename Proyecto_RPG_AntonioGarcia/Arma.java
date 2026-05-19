public class Arma {

    private String nombre;
    private int danoBase;

    public Arma(String nombre, int danoBase) {
        this.nombre = nombre;
        this.danoBase = danoBase;
    }

    public String getNombre() { return nombre; }
    public int getDanoBase() { return danoBase; }

    @Override
    public String toString() {
        return nombre + " (daño base: " + danoBase + ")";
    }
}