# Traducción - 16. Veinticuatro otra vez.pdf

### Requisitos

- Nombre del archivo origen: TwentyFour.c, TwentyFour.cpp, TwentyFour.java, TwentyFour.py
- Tiempo límite: 2000 ms
- Memoria límite: 256144 kB

### Enunciado

Sí, lo sabemos... hemos usado el Desafío 24 antes para problemas de concursos. En caso de que nunca haya oído hablar del Desafío 24 (o tenga muy poca memoria), el objetivo del juego es tomar 4 números dados (los valores base) y determinar si hay una manera de producir el valor 24 a partir de ellos usando el cuatro operaciones aritméticas básicas (y paréntesis si es necesario). Por ejemplo, dados los cuatro valores base 3 5 5 2, puedes producir 24 de muchas maneras. Dos y resta, y que los operadores de igual precedencia se evalúan de izquierda a derecha.



Todo esto es muy familiar para la mayoría de ustedes, pero lo que probablemente no saben es que *pueden calificar* la calidad de las expresiones utilizadas para producir 24. De hecho, estamos seguros de que no saben esto ya que Lo acabo de inventar. Así es como funciona: una calificación perfecta para una expresión es 0. Cada uso de paréntesis agrega un punto a la calificación. Además, cada inversión (es decir, intercambio de dos valores adyacentes) del ordenamiento original de los cuatro valores base suma dos puntos. La primera expresión tiene una mejor calificación de 2 ya que no usa inversiones sino dos juegos de paréntesis. Como ejemplo adicional, el conjunto inicial de cuatro valores base 3 6 2 3 podría producir una expresión de grado 3, a saber (3 + 6 + 3) * 2, pero también tiene una expresión de grado 0 perfecta, a saber, 3 * 6 + 2 * 3. No hace falta decir que cuanto más baja sea la calificación, "mejor" será la expresión.



Usaremos dos reglas adicionales: 1) no puede usar menos unario en ninguna expresión, por lo que no puede tomar los valores base 3 5 5 2 y producir la expresión -3 + 5 * 5 + 2, y 2) la división puede solo se puede usar si el resultado es un número entero, por lo que no puede tomar los valores base 2 3 4 9 y producir la expresión 2/3 * 4 * 9.



Dada una secuencia de valores base, determine la expresión de grado más bajo que da como resultado el valor 24. Y, por cierto, el conjunto inicial de valores base 3 5 5 2 tiene una expresión de grado 1, ¿puede encontrarla?

### Entrada

La entrada consta de una sola línea que contiene 4 valores base. Todos los valores base están entre 1 y 100, inclusive.

### Salida

Muestre la calificación más baja posible usando la secuencia de valores base. Si no es posible producir 24, muestra *imposible*.

#### Muestra 1

| Input   | Output |
| ------- | ------ |
| 3 5 5 2 | 1      |

#### Muestra 2

| Input   | Output     |
| ------- | ---------- |
| 1 1 1 1 | impossible |

