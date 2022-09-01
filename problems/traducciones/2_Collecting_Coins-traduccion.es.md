# Traducción - 2. Coleccionar Monedas.pdf

### Requisitos
- Límite de tiempo de ejecución 2000 ms (2s)
- Límite de memoria 262144 kB (kilobytes)

### Enunciado

Policarpo tiene tres hermanas: **Alicia, Bárbara y Cerene.** Están recogiendo monedas. Actualmente, Alicia
tiene *a* monedas, Bárbara tiene *b* monedas y Cerene tiene *c* monedas. Recientemente Policarpo ha regresado de
viaje alrededor del mundo y trajo *n* monedas.
Quiere repartir todas estas monedas *n* entre sus tres hermanas de tal manera que el número de
monedas que tiene Alicia es igual al número de monedas que tiene Bárbara y es igual al número de monedas
de Cerene. En otras palabras, si Policarpo le da *A* moendas a Alicia, *B* monedas a Bárbara y *C* monedas a
Cereno: (A + B + C = n), luego (a + A = b + B = c + C).

**Tenga en cuenta que:** A, B o C (es el número de monedas que Policarpo le da a Alicia, Bárbara y Cerene
correspondientemente) puede ser 0.
Su tarea es averiguar si es posible distribuir todas las monedas entre sus hermanas de la manera descrita
arriba.
Tienes que responder casos de prueba independientes.

### Entrada

La primera línea de la entrada contiene un número entero *t* (1 ≤ *t* ≤ 10^4), el número de casos de prueba.

Las siguientes líneas *t* describen casos de prueba. Cada caso de prueba se da en una nueva línea y consta de cuatro números enteros separados por espacios (a, b, c y n) deben estar comprendidos entre (1 ≤ *a,b,c,n* ≤ 10^8) — el número de monedas que tiene Alicia, el número de monedas de Bárbara, el número de monedas que tiene Cerene y el número de monedas que tiene Policarpo.

### Salida

Para cada caso de prueba, escriba "YES" si Policarpo puede distribuir todas las monedas entre sus hermanas y "NO" de lo contrario.

#### Muestra 1
| Input                    | Output |
| ------------------------ | ------ |
| 5                        |        |
| 5  3  2  8               | YES    |
| 100  101  102  105       | YES    |
| 3  2  1  100000000       | NO     |
| 10  20  15  14           | NO     |
| 101  101  101  3         | YES    |