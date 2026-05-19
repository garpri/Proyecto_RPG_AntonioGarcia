/**
 * Clase abstracta que representa a un personaje del juego RPG "La Herencia Maldita".
 * Actúa como clase padre de Guerrero y Mago.
 *
 * @author LaHontanillaSoft S.L.
 * @version 1.0
 */
public abstract class Personaje {

    /** Nombre del personaje. */
    private String nombre;

    /** Puntos de vida del personaje. */
    private int vida;

    /** Vida máxima del personaje (para referencia y reset). */
    private int vidaMaxima;

    /** Nivel del personaje. */
    private int nivel;

    /** Arma equipada por el personaje. */
    private Arma arma;

    /**
     * Constructor de Personaje.
     *
     * @param nombre     Nombre del personaje.
     * @param vida       Puntos de vida iniciales.
     * @param nivel      Nivel del personaje.
     */
    public Personaje(String nombre, int vida, int nivel) {
        this.nombre = nombre;
        this.vida = vida;
        this.vidaMaxima = vida;
        this.nivel = nivel;
        this.arma = null;
    }

    /**
     * Método abstracto de ataque. Cada subclase lo implementa de forma diferente (polimorfismo).
     *
     * @param enemigo El personaje que recibirá el daño.
     */
    public abstract void atacar(Personaje enemigo);

    /**
     * Aplica daño al personaje. La vida nunca baja de 0.
     *
     * @param dano Cantidad de daño recibido.
     */
    public void recibirDano(int dano) {
        this.vida = this.vida - dano;
        
        if (this.vida < 0) {
            this.vida = 0;
        }
    }

    /**
     * Equipa un arma al personaje.
     *
     * @param arma El arma a equipar.
     */
    public void equiparArma(Arma arma) {
        this.arma = arma;
        System.out.println(nombre + " ha equipado: " + arma.getNombre());
    }

    /**
     * Guarda los datos del personaje (simulado en consola).
     */
    public void guardarPartida() {
        System.out.println("=== GUARDANDO PARTIDA ===");
        System.out.println("Personaje: " + nombre);
        System.out.println("Vida: " + vida + "/" + vidaMaxima);
        System.out.println("Nivel: " + nivel);
        System.out.println("Arma: " + (arma != null ? arma.getNombre() : "Sin arma"));
        System.out.println("=========================");
    }

    // ── Getters y Setters ──────────────────────────────────────────────────────

    /** @return El nombre del personaje. */
    public String getNombre() { return nombre; }

    /** @param nombre El nuevo nombre del personaje. */
    public void setNombre(String nombre) { this.nombre = nombre; }

    /** @return Los puntos de vida actuales. */
    public int getVida() { return vida; }

    /** @param vida Los nuevos puntos de vida. */
    public void setVida(int vida) { this.vida = Math.max(0, vida); }

    /** @return La vida máxima del personaje. */
    public int getVidaMaxima() { return vidaMaxima; }

    /** @return El nivel del personaje. */
    public int getNivel() { return nivel; }

    /** @param nivel El nuevo nivel del personaje. */
    public void setNivel(int nivel) { this.nivel = nivel; }

    /** @return El arma equipada, o null si no tiene. */
    public Arma getArma() { return arma; }

    /** @return true si el personaje está vivo (vida > 0). */
    public boolean estaVivo() { return vida > 0; }

    @Override
    public String toString() {
        return nombre + " [Vida: " + vida + "/" + vidaMaxima +
               " | Nivel: " + nivel +
               " | Arma: " + (arma != null ? arma.getNombre() : "ninguna") + "]";
    }
}
