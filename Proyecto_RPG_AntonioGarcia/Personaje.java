package Proyecto_RPG_AntonioGarcia;

public class Personaje {
    String n;
    int v;
    int niv;
    int t;
    int energiaExtra;

    public Personaje(String a, int b, int c, int d, int e) {
        n = a;
        v = b;
        niv = c;
        t = d;
        energiaExtra = e;
    }

    public void atacar(Personaje enemigo) {
        int d = 0;
        if (this.t == 1) {
            d = this.niv * 2;
        } else if (this.t == 2) {
            d = this.niv + this.energiaExtra;
        }
        enemigo.recibirDano(d);
    }

    public void recibirDano(int dano) {
        this.v = this.v - dano;
    }

    public int getVida() {
        return this.v;
    }
}