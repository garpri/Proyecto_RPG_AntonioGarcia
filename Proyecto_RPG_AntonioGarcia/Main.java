import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,
            "LA HERENCIA MALDITA\n\nEl reino de Hontanilla está en peligro.\nDebes elegir tu héroe.");

        String[] opciones = {"Guerrero", "Mago"};
        int eleccion = JOptionPane.showOptionDialog(null,
            "¿Quién serás?", "Elige tu héroe",
            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
            null, opciones, opciones[0]);

        Personaje heroe;
        Personaje villano = new Guerrero("Señor Oscuro", 60, 10, 8);

        if (eleccion == 0) {
            heroe = new Guerrero("Thorin", 100, 5, 12);
            JOptionPane.showMessageDialog(null, "Has elegido al Guerrero Thorin!\nVida: 100 | Furia: 12");
        } else {
            heroe = new Mago("Gandalf", 80, 7, 60, 18, 10);
            JOptionPane.showMessageDialog(null, "Has elegido al Mago Gandalf!\nVida: 80 | Mana: 60");
        }

        Arma arma = new Arma("Espada Ancestral", 15);
        heroe.equiparArma(arma);
        JOptionPane.showMessageDialog(null, "Has encontrado la Espada Ancestral!\nDaño base: 15");

        int ronda = 1;
        while (heroe.estaVivo() && villano.estaVivo()) {
            int vidaVillanoAntes = villano.getVida();
            heroe.atacar(villano);
            int danoHecho = vidaVillanoAntes - villano.getVida();

            if (!villano.estaVivo()) break;

            int vidaHeroeAntes = heroe.getVida();
            villano.atacar(heroe);
            int danoRecibido = vidaHeroeAntes - heroe.getVida();

            JOptionPane.showMessageDialog(null,
                "Ronda " + ronda + "\n" +
                heroe.getNombre() + " ataca por " + danoHecho + "\n" +
                villano.getNombre() + " contraataca por " + danoRecibido + "\n\n" +
                "Tu vida: " + heroe.getVida() + " | Enemigo: " + villano.getVida());
            ronda++;
        }

        if (heroe.estaVivo()) {
            JOptionPane.showMessageDialog(null, "¡VICTORIA!\n" + heroe.getNombre() + " ha ganado!\nVida: " + heroe.getVida());
        } else {
            JOptionPane.showMessageDialog(null, "DERROTA...\nEl Señor Oscuro ha vencido.");
        }

        heroe.guardarPartida();
    }
}