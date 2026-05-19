import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class PersonajeTest {

    private Guerrero guerrero;
    private Guerrero enemigo;

    @BeforeEach
    public void setUp() {
        guerrero = new Guerrero("Thorin", 100, 5, 10);
        enemigo = new Guerrero("Orco", 100, 1, 5);
    }

    @Test
    public void testGuerreroAtaca() {
        int vidaAntes = enemigo.getVida();
        guerrero.atacar(enemigo);
        int dano = vidaAntes - enemigo.getVida();
        assertEquals(guerrero.getFuria() * 2, dano);
    }

    @Test
    public void testVidaNoNegativa() {
        enemigo.recibirDano(200);
        assertEquals(0, enemigo.getVida());
    }

    @Test
    public void testCreacion() {
        Guerrero nuevo = new Guerrero("Arthas", 150, 3, 20);
        assertEquals(150, nuevo.getVida());
        assertEquals("Arthas", nuevo.getNombre());
    }
}