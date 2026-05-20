# La Herencia Maldita - Proyecto RPG

**Empresa:** LaHontanillaSoft S.L.  
**Modulo:** Entornos de Desarrollo - 1 DAW  
**Proyecto:** Guardianes de Codigo

---

## Descripcion

RPG de texto desarrollado en Java como proyecto final de curso. El jugador elige entre un Guerrero o un Mago para enfrentarse al Senor Oscuro en el reino de Hontanilla.

El proyecto aplica los principios de la Programacion Orientada a Objetos:
- Herencia: Guerrero y Mago extienden Personaje.
- Polimorfismo: cada clase implementa atacar() de forma distinta.
- Encapsulamiento: todos los atributos son private con getters/setters.
- Asociacion: un Personaje tiene un Arma.

---

## Estructura del proyecto

```
Proyecto_RPG/
├── Personaje.java
├── Guerrero.java
├── Mago.java
├── Arma.java
├── Main.java
└── PersonajeTest.java
```

---

## Como ejecutar

### Requisitos
- Java 17 o superior
- JUnit 5 (para los tests)

### Compilar y ejecutar
```bash
javac *.java
java Main
```

### Ejecutar tests
```bash
java -jar junit-platform-console-standalone.jar --class-path . --scan-class-path
```

---

## Tests implementados

| Test | Descripcion | Estado |
|------|-------------|--------|
| testGuerreroAtaca() | Verifica que el daño = furia x 2 | OK |
| testVidaNoNegativa() | La vida nunca baja de 0 | OK |
| testCreacion() | El personaje nace con vida maxima | OK |

---

## Bug corregido

El metodo recibirDano() permitia que la vida bajase a valores negativos. Se añadio un if para que nunca baje de 0.

---

*Proyecto desarrollado para LaHontanillaSoft S.L. - 1 DAW, Entornos de Desarrollo.*
