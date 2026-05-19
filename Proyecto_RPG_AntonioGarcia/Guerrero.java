/**
 * Representa a un Guerrero, subclase de Personaje.
 * Atributo único: furia. Su ataque es físico: daño = fuerza * 2.
 *
 * @author LaHontanillaSoft S.L.
 * @version 1.0
 */
public class Guerrero extends Personaje {

    /** Puntos de furia del guerrero (determina su fuerza de ataque). */
    private int furia;

    /**
     * Constructor de Guerrero.
     *
     * @param nombre Nombre del guerrero.
     * @param vida   Puntos de vida iniciales.
     * @param nivel  Nivel del guerrero.
     * @param furia  Puntos de furia iniciales.
     */
    public Guerrero(String nombre, int vida, int nivel, int furia) {
        super(nombre, vida, nivel);
        this.furia = furia;
    }

    /**
     * El Guerrero ataca con fuerza bruta.
     * Fórmula: daño = furia * 2
     *
     * @param enemigo El personaje que recibe el ataque.
     */
    @Override
    public void atacar(Personaje enemigo) {
        int dano = furia * 2;
        System.out.println(getNombre() + " golpea a " + enemigo.getNombre() +
                           " con furia bruta! Daño: " + dano);
        enemigo.recibirDano(dano);
    }

    /** @return Los puntos de furia del guerrero. */
    public int getFuria() { return furia; }

    /** @param furia Nuevos puntos de furia. */
    public void setFuria(int furia) { this.furia = furia; }

    @Override
    public String toString() {
        return "[GUERRERO] " + super.toString() + " | Furia: " + furia;
    }
}
