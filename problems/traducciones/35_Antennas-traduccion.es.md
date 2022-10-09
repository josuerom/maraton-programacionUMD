# Traducción - 35. Antenas.pdf

### Requisitos
- Nombre del archivo origen: Antennas.c, Antennas.cpp, Antennas.java, Antennas.py
- Entrada: Estándar
- Salida: Estándar

### Enunciado
Hay n antenas equidistantes en una línea, numeradas del 1 al n. Cada antena tiene una potencia nominal, la potencia de la i-ésima antena es pi.

La i-ésima y la j-ésima antena pueden comunicarse directamente si y solo si su distancia es como máximo el mínimo de sus potencias, es decir, |i − j| ≤ min(pi, pj ). Enviar un mensaje directamente entre dos antenas de este tipo tarda 1 segundo.

¿Cuál es la cantidad mínima de tiempo necesaria para enviar un mensaje de la antena a a la antena b, posiblemente usando otras antenas como repetidores?

### Entrada
Cada prueba contiene múltiples casos de prueba. La primera línea contiene un número entero t (1 ≤ t ≤ 10^5) – el número de
Casos de prueba. Las descripciones de los casos de prueba t siguen.

La primera línea de cada caso de prueba contiene tres números enteros n, a, b (1 ≤ a, b ≤ n ≤ 2 · 10^5) – el número de
antenas, y la antena de origen y de destino.

La segunda línea contiene n enteros p1, p2, ...., pn (1 ≤ pi ≤ n) – las potencias de las antenas.

La suma de los valores de n sobre todos los casos de prueba no excede 2 · 10^5.

### Salida
Para cada caso de prueba, imprima el número de segundos necesarios para transmitir un mensaje de a a b. Se puede demostrar que bajo las restricciones del problema, siempre es posible enviar tal mensaje.

#### Muestra
| Input | Output |
| ----- | ------ |
| 3 | 4 |
| 10 2 9 | 0 |
| 4 1 1 1 5 1 1 1 1 5 | 2 |
| 1 1 1 |  |
| 1 |  |
| 3 1 3 |  |
| 3 3 1 |  |

### Explicación
En el **primer caso de prueba**, debemos enviar un mensaje desde la antena 2 a la antena 9. Una secuencia de comunicaciones que requiere 4 segundos, que es el mínimo tiempo posible, es la siguiente:

- En 1 segundo enviamos el mensaje de la antena 2 a la antena 1. Esto es posible ya que |2 − 1| ≤ min(1, 4) = min(p2, p1)
- En 1 segundo enviamos el mensaje de la antena 1 a la antena 5. Esto es posible ya que |1 − 5| ≤ min(4, 5) = min(p1, p5)
- En 1 segundo enviamos el mensaje de la antena 5 a la antena 10. Esto es posible ya que |5 − 10| ≤ min(5, 5) = min(p5, p10
- En 1 segundo enviamos el mensaje de la antena 10 a la antena 9. Esto es posible ya que |10 − 9| ≤ min(5, 1) = min(p10, p9).