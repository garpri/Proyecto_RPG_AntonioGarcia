/**
 * Representa a un Mago, subclase de Personaje.
 * Atributo único: mana. Su ataque es mágico: daño = inteligencia + hechizo.
 *
 * @author LaHontanillaSoft S.L.
 * @version 1.0
 */
public class Mago extends Personaje {

    /** Puntos de mana del mago. */
    private int mana;

    /** Potencia del hechizo activo. */
    private int hechizo;

    /** Inteligencia mágica del mago. */
    private int inteligencia;

    /**
     * Constructor de Mago.
     *
     * @param nombre       Nombre del mago.
     * @param vida         Puntos de vida iniciales.
     * @param nivel        Nivel del mago.
     * @param mana         Puntos de mana.
     * @param inteligencia Stat de inteligencia.
     * @param hechizo      Potencia del hechizo.
     */
    public Mago(String nombre, int vida, int nivel, int mana, int inteligencia, int hechizo) {
        super(nombre, vida, nivel);
        this.mana = mana;
        this.inteligencia = inteligencia;
        this.hechizo = hechizo;
    }

    /**
     * El Mago ataca con magia arcana.
     * Fórmula: daño = inteligencia + hechizo
     *
     * @param enemigo El personaje que recibe el ataque.
     */
    @Override
    public void atacar(Personaje enemigo) {
        int dano = inteligencia + hechizo;
        System.out.println(getNombre() + " lanza un hechizo sobre " + enemigo.getNombre() +
                           "! Daño mágico: " + dano);
        enemigo.recibirDano(dano);
    }

    /** @return Los puntos de mana del mago. */
    public int getMana() { return mana; }

    /** @param mana Nuevos puntos de mana. */
    public void setMana(int mana) { this.mana = mana; }

    /** @return La inteligencia del mago. */
    public int getInteligencia() { return inteligencia; }

    /** @return La potencia del hechizo. */
    public int getHechizo() { return hechizo; }

    @Override
    public String toString() {
        return "[MAGO] " + super.toString() + " | Mana: " + mana;
    }
}
