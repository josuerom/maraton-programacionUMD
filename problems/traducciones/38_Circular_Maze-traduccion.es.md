# Traducción - 38. Laberinto Circular.pdf

### Requisitos
- Nombre del archivo origen: Maze.c, Maze.cpp, Maze.java, Maze.py
- Entrada: Estándar
- Salida: Estándar

### Enunciado
Te dan un laberinto circular como los que se muestran en las figuras.

<div align="center"><img src="https://github.com/josuerom/maraton-programacionUMD/blob/main/img/38_Maze.png"></div>

Determina si se puede resolver, es decir, si hay un camino que va desde el centro hacia el exterior del laberinto que no toca ninguna pared. El laberinto está descrito por n paredes. Cada pared puede ser circular o recta.

- Las paredes circulares están descritas por un radio r, la distancia desde el centro, y dos ángulos θ1, θ2 que describen el comienzo y el final de la pared en el sentido de las agujas del reloj. Observe que al intercambiar los dos ángulos cambia la pared.
- Las paredes rectas se describen mediante un ángulo θ, la dirección de la pared, y dos radios r1 < r2 que describen el principio y el final de la pared.

Los ángulos se miden en grados; el ángulo 0 corresponde a la dirección que apunta hacia arriba; y los ángulos aumentan en el sentido de las agujas del reloj (por lo tanto, la dirección este corresponde al ángulo 90).

### Entrada
Cada prueba contiene múltiples casos de prueba. La primera línea contiene un número entero t (1 ≤ t ≤ 20) – el número de casos de prueba. Las descripciones de los casos de prueba t siguen.

La primera línea de cada caso de prueba contiene un número entero n (1 ≤ n ≤ 5000) – el número de paredes.

Cada una de las siguientes n líneas contiene un carácter (C para circular y S para recto) y tres números enteros:
- ya sea r, θ1, θ2 (1 ≤ r ≤ 20 y 0 ≤ θ1, θ2 < 360 con θ1 != θ2) si la pared es circular,
- o r1, r2 y θ (1 ≤ r1 < r2 ≤ 20 y 0 ≤ θ < 360) si el muro es recto.

Se garantiza que las paredes circulares no se superponen (pero dos paredes circulares pueden cruzarse en uno o dos puntos), y que las paredes rectas no se superponen (pero dos paredes rectas pueden cruzarse en un punto). Sin embargo, las paredes circulares y rectas pueden intersecarse arbitrariamente.

### Salida
Para cada caso de prueba, escriba **YES** si el laberinto se puede resolver y **NO** de lo contrario.

#### Muestra
| Input | Output |
| ----- | ------ |
| 2 |  |
| 5 | YES |
| C 1 180 90 |  |
| C 5 250 230 |  |
| C 10 150 140 |  |
| C 20 185 180 |  |
| S 1 20 180 |  |
| 6 | NO |
| C 1 180 90 |  |
| C 5 250 230 |  |
| C 10 150 140 |  |
| C 20 185 180 |  |
| S 1 20 180 |  |
| S 5 10 0 |  |

### Explicación
Los dos casos de prueba de ejemplo corresponden a los dos laberintos de la imagen.