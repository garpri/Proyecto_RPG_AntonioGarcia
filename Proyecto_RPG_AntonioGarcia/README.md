# ⚔️ La Herencia Maldita — Proyecto RPG

**Empresa:** LaHontanillaSoft S.L.  
**Módulo:** Entornos de Desarrollo — 1º DAW  
**Proyecto:** Guardianes de Código

---

## 📖 Descripción

RPG de texto desarrollado en Java como proyecto final de curso. El jugador elige entre un **Guerrero** o un **Mago** para enfrentarse al Señor Oscuro en el reino de Hontanilla.

El proyecto aplica los principios de la **Programación Orientada a Objetos**:
- **Herencia**: `Guerrero` y `Mago` extienden `Personaje`.
- **Polimorfismo**: cada clase implementa `atacar()` de forma distinta.
- **Encapsulamiento**: todos los atributos son `private` con getters/setters.
- **Asociación**: un `Personaje` tiene un `Arma`.

---

## 🗂️ Estructura del proyecto

```
Proyecto_RPG/
├── src/
│   ├── Personaje.java       # Clase abstracta padre
│   ├── Guerrero.java        # Subclase: ataca con furia * 2
│   ├── Mago.java            # Subclase: ataca con inteligencia + hechizo
│   ├── Arma.java            # Clase asociada a Personaje
│   ├── Main.java            # Historia interactiva con JOptionPane
│   └── PersonajeTest.java   # Tests JUnit 5
└── README.md
```

---

## 🚀 Cómo ejecutar

### Requisitos
- Java 17 o superior
- JUnit 5 (para los tests)

### Compilar y ejecutar
```bash
# Compilar
javac src/*.java -d out/

# Ejecutar el juego
java -cp out/ Main

# Generar JAR
jar cfe LaHerenciaMaldita.jar Main -C out/ .

# Ejecutar JAR
java -jar LaHerenciaMaldita.jar
```

### Ejecutar tests (con JUnit 5)
```bash
javac -cp junit-platform-console-standalone.jar src/*.java -d out/
java -jar junit-platform-console-standalone.jar --class-path out/ --scan-class-path
```

---

## 🧪 Tests implementados

| Test | Descripción | Estado |
|------|-------------|--------|
| `testGuerreroAtaca()` | Verifica que el daño = furia × 2 | ✅ |
| `testVidaNoNegativa()` | La vida nunca baja de 0 | ✅ |
| `testCreacion()` | El personaje nace con vida máxima | ✅ |
| `testMagoAtaca()` | Verifica que el daño = inteligencia + hechizo | ✅ |
| `testEquiparArma()` | El arma se equipa correctamente | ✅ |

---

## 🐛 Bug corregido (Fase 3)

**Problema:** En el código legado de Manolo, `recibirDano()` permitía que la vida bajase a valores negativos:
```java
// CÓDIGO SUCIO de Manolo ❌
public void recibirDano(int dano) {
    this.v = this.v - dano; // Podía quedar en -15, -100, etc.
}
```

**Solución aplicada:**
```java
// CÓDIGO LIMPIO ✅
public void recibirDano(int dano) {
    this.vida = this.vida - dano;
    if (this.vida < 0) {
        this.vida = 0;
    }
}
```

---

## 📌 Commits del proyecto

1. `Initial commit: Código legado de Manolo`
2. `feat: añadir clases Arma y estructura base`
3. `refactor: separar Guerrero y Mago en clases propias`
4. `fix: corregir bug de vida negativa en recibirDano()`
5. `test: añadir tests JUnit (PersonajeTest)`
6. `docs: añadir JavaDoc y README`
7. `feat: crear Main.java con historia y JOptionPane`

---

*Proyecto desarrollado para LaHontanillaSoft S.L. — 1º DAW, Entornos de Desarrollo.*
