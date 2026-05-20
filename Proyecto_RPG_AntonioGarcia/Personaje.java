/**
 * Clase padre que representa a un personaje del juego.
 */
public abstract class Personaje {

    private String nombre;
    private int vida;
    private int vidaMaxima;
    private int nivel;
    private Arma arma;

    /**
     * Crea un nuevo personaje.
     * @param nombre El nombre del personaje.
     * @param vida Los puntos de vida iniciales.
     * @param nivel El nivel del personaje.
     */
    public Personaje(String nombre, int vida, int nivel) {
        this.nombre = nombre;
        this.vida = vida;
        this.vidaMaxima = vida;
        this.nivel = nivel;
        this.arma = null;
    }

    /**
     * Ataca a un enemigo. Cada subclase lo implementa distinto.
     * @param enemigo El personaje que recibe el ataque.
     */
    public abstract void atacar(Personaje enemigo);

    /**
     * Resta vida al personaje. La vida nunca baja de 0.
     * @param dano La cantidad de daño recibido.
     */
    public void recibirDano(int dano) {
        this.vida = this.vida - dano;
        if (this.vida < 0) {
            this.vida = 0;
        }
    }

    /**
     * Equipa un arma al personaje.
     * @param arma El arma a equipar.
     */
    public void equiparArma(Arma arma) {
        this.arma = arma;
        System.out.println(nombre + " ha equipado: " + arma.getNombre());
    }

    public void guardarPartida() {
        System.out.println("=== GUARDANDO PARTIDA ===");
        System.out.println("Personaje: " + nombre);
        System.out.println("Vida: " + vida + "/" + vidaMaxima);
        System.out.println("Nivel: " + nivel);
        System.out.println("Arma: " + (arma != null ? arma.getNombre() : "Sin arma"));
        System.out.println("=========================");
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getVida() { return vida; }
    public void setVida(int vida) { this.vida = Math.max(0, vida); }
    public int getVidaMaxima() { return vidaMaxima; }
    public int getNivel() { return nivel; }
    public void setNivel(int nivel) { this.nivel = nivel; }
    public Arma getArma() { return arma; }
    public boolean estaVivo() { return vida > 0; }

    @Override
    public String toString() {
        return nombre + " [Vida: " + vida + "/" + vidaMaxima +
               " | Nivel: " + nivel +
               " | Arma: " + (arma != null ? arma.getNombre() : "ninguna") + "]";
    }
}