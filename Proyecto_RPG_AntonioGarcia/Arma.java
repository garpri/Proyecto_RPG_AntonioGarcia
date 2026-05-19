/**
 * Representa un arma que puede equipar un personaje.
 * Un Personaje tiene una Arma (asociación).
 *
 * @author LaHontanillaSoft S.L.
 * @version 1.0
 */
public class Arma {

    /** Nombre del arma. */
    private String nombre;

    /** Daño base que proporciona el arma. */
    private int danoBase;

    /**
     * Constructor de Arma.
     *
     * @param nombre    Nombre del arma (ej: "Espada de Fuego").
     * @param danoBase  Daño base que añade el arma.
     */
    public Arma(String nombre, int danoBase) {
        this.nombre = nombre;
        this.danoBase = danoBase;
    }

    /** @return El nombre del arma. */
    public String getNombre() { return nombre; }

    /** @return El daño base del arma. */
    public int getDanoBase() { return danoBase; }

    @Override
    public String toString() {
        return nombre + " (daño base: " + danoBase + ")";
    }
}
