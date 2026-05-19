public class Guerrero extends Personaje {

    private int furia;

    public Guerrero(String nombre, int vida, int nivel, int furia) {
        super(nombre, vida, nivel);
        this.furia = furia;
    }

    @Override
    public void atacar(Personaje enemigo) {
        int dano = furia * 2;
        System.out.println(getNombre() + " golpea a " + enemigo.getNombre() + "! Daño: " + dano);
        enemigo.recibirDano(dano);
    }

    public int getFuria() { return furia; }
    public void setFuria(int furia) { this.furia = furia; }

    @Override
    public String toString() {
        return "[GUERRERO] " + super.toString() + " | Furia: " + furia;
    }
}