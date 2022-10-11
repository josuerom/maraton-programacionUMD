# Traducción - G.  - Tomado de CodeForces

### Requisitos
- Límite de tiempo por prueba: 2 segundo
- Límite de memoria por prueba: 256 Mb
- Input: Entrada estándar
- Output: Salida estándar

### Enunciado
Tienes una matriz de 5 × 5 , que consta de 24 ceros y un solo número uno. Indexemos las filas de la matriz por números del 1 al 5 de arriba a abajo, indexemos las columnas de la matriz por números del 1 al 5 de izquierda a derecha. En un solo movimiento, puede aplicar una de las dos transformaciones siguientes a la matriz:

Intercambie dos filas de matriz vecinas, es decir, filas con índices i e i  + 1 por algún número entero i (1 ≤  i  < 5) .
Intercambie dos columnas de matriz vecinas, es decir, columnas con índices j y j  + 1 por algún número entero j (1 ≤  j  < 5) .
Piensas que una matriz se ve hermosa , si el único número uno de la matriz está ubicado en su medio (en la celda que está en la intersección de la tercera fila y la tercera columna). Cuente el número mínimo de movimientos necesarios para embellecer la matriz.

### Entrada
La entrada consta de cinco líneas, cada línea contiene cinco números enteros: el j -ésimo entero en la i -ésima línea de la entrada representa el elemento de la matriz que se encuentra en la intersección de la i -ésima fila y la j -ésima columna. Se garantiza que la matriz consta de 24 ceros y un solo número uno.

### Salida
Imprima un solo número entero: el número mínimo de movimientos necesarios para hacer que la matriz sea hermosa.

### Muestra
| Input |
| ----- |
| 0 0 0 0 0 |
| 0 0 0 0 1 |
| 0 0 0 0 0 |
| 0 0 0 0 0 |
| 0 0 0 0 0 |
| Output |
| ------ |
| 3 |

| Input |
| ----- |
| 0 0 0 0 0 |
| 0 0 0 0 0 |
| 0 1 0 0 0 |
| 0 0 0 0 0 |
| 0 0 0 0 0 |
| Output |
| ------ |
| 1 |