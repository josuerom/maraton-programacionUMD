# Traducción - 28. Organizando SWERC.pdf

### Requisitos
- Nombre del archivo origen: Organizing.c, Organizing.cpp, Organizing.java, Organizing.py
- Entrada: Estándar
- Salida: Estándar

### Enunciado
Gianni, el juez principal de SWERC, recibió una gran cantidad de problemas de alta calidad de parte de los jueces y ahora tiene que elegir un conjunto de problemas para SWERC.

Recibió n problemas y les asignó una puntuación de belleza y una dificultad a cada uno de ellos. El i-ésimo problema tiene una puntuación de belleza igual a bi y una dificultad igual a di. La belleza y la dificultad son números enteros entre 1 y 10.

Si no hay problemas con cierta dificultad (las posibles dificultades son 1, 2, ....., 10) entonces Gianni pedirá más problemas a los jueces.

De lo contrario, por cada dificultad entre 1 y 10, pondrá en el conjunto de problemas uno de los problemas más hermosos con tal dificultad (por lo que el conjunto de problemas contendrá exactamente 10 problemas con distintas dificultades).
Deberá calcular la belleza total del conjunto de problemas, que es la suma de las puntuaciones de belleza de los problemas.
elegido por Gianni.

### Entrada
Cada prueba contiene múltiples casos de prueba. La primera línea contiene un número entero t (1 ≤ t ≤ 100) – el número de casos de prueba. Las descripciones de los casos de prueba t siguen.

La primera línea de cada caso de prueba contiene el número entero n (1 ≤ n ≤ 100) – cuántos problemas recibió Gianni de los jueces.

Las siguientes n líneas contienen dos enteros cada una. La i-ésima de dichas líneas contiene bi y di (1 ≤ bi, di ≤ 10) – la puntuación de belleza y la dificultad del i-ésimo problema.

### Salida
Para cada caso de prueba, imprima la belleza total del conjunto de problemas elegido por Gianni. Si Gianni no puede crear un conjunto de problemas (porque no hay problemas con cierta dificultad), imprima la cadena **MOREPROBLEMS** (todas las letras están en mayúsculas, no hay espacios).


#### Muestra
| Input | Output |
| ----- | ------ |
| 2 | MOREPROBLEMS |
| 3 | 93 |
| 8 4 |  |
| 9 3 |  |
| 6 7 |  |
| 12 |  |
| 3 10 |  |
| 10 1 |  |
| 10 2 |  |
| 10 3 |  |
| 10 4 |  |
| 3 10 |  |
| 10 5 |  |
| 10 6 |  |
| 10 7 |  |
| 10 8 |  |
| 10 9 |  |
| 1 10 |  |

### Explicación
En el **primer caso de prueba**, Gianni ha recibido solo 3 problemas, con dificultades 3, 4, 7 que no son suficientes para crear un conjunto de problemas (por ejemplo, porque no hay un problema con dificultad 1).

En el **segundo caso de prueba**, Gianni creará un conjunto de problemas tomando los problemas 2, 3, 4, 5, 7, 8, 9, 10, 11 (que tienen una belleza igual a 10 y todas las dificultades de 1 a 9) y uno de los problemas 1 y 6 (que tienen belleza 3 y dificultad 10). La belleza total del conjunto de problemas resultante es 10 · 9 + 3 = 93.