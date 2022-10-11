# Traducción - E. Apilamiento de dominó - Tomado de CodeForces

### Requisitos
- Límite de tiempo por prueba: 2 segundos
- Límite de memoria por prueba: 256 Mb
- Input: Entrada estándar
- Output: Salida estándar

### Enunciado
Te dan un tablero rectangular de M × N cuadrados. También se le da un número ilimitado de piezas de dominó estándar de 2 × 1 cuadrados. Se le permite rotar las piezas. Se le pide que coloque tantas fichas de dominó como sea posible en el tablero para cumplir con las siguientes condiciones:

1. Cada dominó cubre por completo dos cuadrados.
2. No se superponen dos fichas de dominó.
3. Cada dominó se encuentra completamente dentro del tablero. Está permitido tocar los bordes del tablero.

Encuentre el número máximo de fichas de dominó que se pueden colocar bajo estas restricciones.

### Entrada
En una sola línea, se le dan dos números enteros M y N : tamaños de tablero en cuadrados (1 ≤ M ≤ N ≤ 16).

### Salida
Muestra un número: el número máximo de fichas de dominó que se pueden colocar.

### Muestra
| Input |
| ----- |
| 2 4 |
| Output |
| ------ |
| 4 |

| Input |
| ----- |
| 3 3 |
| Output |
| ------ |
| 4 |