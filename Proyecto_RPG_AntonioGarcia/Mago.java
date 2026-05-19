public class Mago extends Personaje {

    private int mana;
    private int hechizo;
    private int inteligencia;

    public Mago(String nombre, int vida, int nivel, int mana, int inteligencia, int hechizo) {
        super(nombre, vida, nivel);
        this.mana = mana;
        this.inteligencia = inteligencia;
        this.hechizo = hechizo;
    }

    @Override
    public void atacar(Personaje enemigo) {
        int dano = inteligencia + hechizo;
        System.out.println(getNombre() + " lanza un hechizo sobre " + enemigo.getNombre() + "! Daño: " + dano);
        enemigo.recibirDano(dano);
    }

    public int getMana() { return mana; }
    public void setMana(int mana) { this.mana = mana; }
    public int getInteligencia() { return inteligencia; }
    public int getHechizo() { return hechizo; }

    @Override
    public String toString() {
        return "[MAGO] " + super.toString() + " | Mana: " + mana;
    }
}