# Traducción al Problema Coleccionar Monedas
Policarpo tiene tres hermanas: Alicia, Bárbara y Cerene. Están recogiendo monedas. Actualmente, Alicia
tiene monedas, Bárbara tiene monedas y Cerene tiene monedas. Recientemente Policarpo ha regresado de la
viaje alrededor del mundo y trajo monedas.
Quiere repartir todas estas monedas entre sus hermanas de tal manera que el número de
monedas que tiene Alicia es igual al número de monedas que tiene Bárbara y es igual al número de monedas
Cerene tiene. En otras palabras, si Policarpo le da monedas a Alicia, monedas a Bárbara y monedas a
Cereno (A + B + C = n), luego (a + A = b + B = c + C).

Tenga en cuenta que A, B o C (es el número de monedas que Policarpo le da a Alicia, Bárbara y Cerene
correspondientemente) puede ser 0.
Su tarea es averiguar si es posible distribuir todas las monedas entre hermanas de la manera descrita
arriba.
Tienes que responder casos de prueba independientes.

Entrada:
La primera línea de la entrada contiene un número entero t (1-10000), el número de casos de prueba.
Las siguientes líneas t describen casos de prueba. Cada caso de prueba se da en una nueva línea y consta de cuatro números enteros separados por espacios (a, b, c y n) y (ellos deben estar comprendidos entre 1:10 a la 8) — el número de monedas que tiene Alicia, el número de monedas Bárbara, el número de monedas que tiene Cerene y el número de monedas que tiene Policarpo.

Salida:
Para cada caso de prueba, escriba "YES" si Policarpo puede distribuir todas las monedas entre sus hermanas y "NO" de lo contrario.

| Input                         | Output |
| ----------------------------- | ------ |
| 5                             |        |
| 5 3 2 8                       | YES    |
| 100 101 102 105               | YES    |
| 3 2 1 100000000               | NO     |
| 10 20 15 14                   | NO     |
| 101 101 101 3                 | YES    |
