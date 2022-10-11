# Traducción - D. Próxima ronda - Tomado de CodeForces

### Requisitos
- Límite de tiempo por prueba: 3 segundos
- Límite de memoria por prueba: 256 Mb
- Input: Entrada estándar
- Output: Salida estándar

### Enunciado
"El concursante que obtenga una puntuación igual o mayor que la puntuación del finalista en el k -ésimo lugar avanzará a la siguiente ronda, siempre que el concursante obtenga una puntuación positiva..." - un extracto de las reglas del concurso.

Un total de n participantes participaron en el concurso ( n ≥ k ), y ya conoces sus puntajes. Calcula cuántos participantes avanzarán a la siguiente ronda.

### Entrada
La primera línea de la entrada contiene dos números enteros n y k (1 ≤ k ≤ n ≤ 50) separados por un solo espacio.

La segunda línea contiene n enteros separados por espacios $a_1$, $a_2$ , ..., $a_n$ (0 ≤ $a_i$ ≤ 100 ), donde a$i es el puntaje obtenido por el participante que obtuvo el i -ésimo lugar. La sucesión dada es no creciente (es decir, para todo i de 1 a n - 1 se cumple la siguiente condición: $a_i$ ≥ $a_i$ + 1).

### Salida
Muestra el número de participantes que avanzan a la siguiente ronda.

### Muestra
| Input |
| ----- |
| 8 5 |
| 10 9 8 7 7 7 5 5 |
| Output |
| ------ |
| 6 |

| Input |
| ----- |
| 4 2 |
| 0 0 0 0 |

| Output |
| ------ |
| 0 |

### Nota
En el primer ejemplo, el participante en el quinto lugar ganó 7 puntos. Como el participante en el sexto lugar también ganó 7 puntos, hay 6 que avanzaron.

En el segundo ejemplo, nadie obtuvo una puntuación positiva.
