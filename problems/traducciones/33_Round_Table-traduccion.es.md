# Traducción - 33. Meza redonda.pdf

### Requisitos
- Nombre del archivo origen: Round.c, Round.cpp, Round.java, Round.py
- Entrada: Estándar
- Salida: Estándar

### Enunciado
Hay n personas, numeradas del 1 al n, sentadas en una mesa redonda. La persona i + 1 está sentada a la derecha de la persona i (con la persona 1 sentada a la derecha de la persona n).

Se le ocurrió una mejor disposición de los asientos, que se da como una permutación p1, p2, . . ., pág. Más específicamente, desea cambiar los asientos de las personas para que, al final, la persona pi+1 esté sentada a la derecha de la persona pi (con la persona p1 sentada a la derecha de la persona pn). Observe que para cada disposición de asientos hay n permutaciones que la describen (que se pueden obtener mediante rotaciones).

Para lograr eso, puedes intercambiar dos personas sentadas en lugares adyacentes; pero hay una trampa: para todos los 1 ≤ x ≤ n−1, no puede intercambiar la persona x y la persona x+ 1 (observe que puede intercambiar la persona n y la persona 1). ¿Cuál es el número mínimo de swaps necesarios? Se puede probar que cualquier arreglo puede ser
logrado.

### Entrada
Cada prueba contiene múltiples casos de prueba. La primera línea contiene un número entero t (1 ≤ t ≤ 10^4) – el número de casos de prueba. Las descripciones de los casos de prueba t siguen.

La primera línea de cada caso de prueba contiene un solo número entero n (3 ≤ n ≤ 2 · 10^5): el número de personas sentadas en la mesa.

La segunda línea contiene n enteros distintos p1, p2, ...., pn (1 ≤ pi ≤ n, pi != pj for i != j) – el orden final deseado de las personas alrededor de la mesa.

La suma de los valores de n sobre todos los casos de prueba no excede 2 · 10^5.

### Salida
Para cada caso de prueba, imprima el número mínimo de intercambios necesarios para lograr el orden deseado.

#### Muestra
| Input | Output |
| ----- | ------ |
| 3 | 1 |
| 4 | 10 |
| 2 3 1 4 | 22 |
| 5 |  |
| 5 4 3 2 1 |  |
| 7 |  |
| 4 1 6 5 3 7 2 |  |

### Explicación
En el **primer caso de prueba**, podemos intercambiar la persona 4 y la persona 1 (que son adyacentes) en la configuración inicial y obtener el orden [4, 2, 3, 1] que es equivalente al deseado. Por lo tanto, en este caso, un solo intercambio es suficiente.