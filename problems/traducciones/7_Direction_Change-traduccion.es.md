# Traducción - 7. Cambio de dirección.pdf

### Requisitos
- Nombre del archivo de origen: DirectionChangue.c, DirectionChangue.cpp, DirectionChangue.java, DirectionChangue.py
- Límite de tiempo: 1000ms
- Límite de memoria: 262144 kB

### Enunciado
Tienes una cuadrícula con n filas y m columnas. Las filas y columnas se numeran del 1 al n y del 1 al m. La inserción de la a-ésima fila y la b-ésima columna se denota por (a, b).

Inicialmente, estás parado en la esquina superior izquierda (1,1). Tu objetivo es llegar a la esquina inferior derecha (n, m).

Puede moverse en cuatro direcciones desde (a, b): hacia arriba (a - 1, b), hacia abajo (a + 1, b), hacia la izquierda (a,b - 1) o hacia la derecha (a,b + 1).

Puedes moverte en la misma dirección en dos movimientos consecutivos y no puedes salir de la cuadrícula. ¿Cuál es el número mínimo de movimientos para llegar a (n, m)?

### Entrada
La entrada consiste en múltiples casos de prueba. La primera línea contiene un solo entero *t* (1 < *t* < 10^3) - el número de casos de prueba. A continuación se presenta la descripción de los casos de prueba.

La primera línea de cada caso de prueba contiene dos números enteros *n* y *m* (1 ≤ *n, m* ≤ 10^9), el tamaño de la cuadrícula.

### Salida
Para cada caso de prueba, imprima un solo número entero: -1 si es imposible alcanzar (n, m) en las condiciones dadas, de lo contrario, el número mínimo de movimientos.

#### Muestra 1
| Input| Output|
| -----| ------|
| 6    |       |
| 1 1  | 0     |
| 2 1  | 1     |
|1 3   | -1    |
| 4 2  | 6     |
| 4 6  | 10    |
| 10 5 | 17    |

### Nota
- **Caso de prueba 1:** n = 1, m = 1, e inicialmente estás parado en (1,1), por lo que se requiere 0 movimientos para llegar a (n,m) = (1,1).
- **Caso de prueba 2:** debes bajar para llegar a (2,1).
- **Caso de prueba 3:** es imposible llegar a (1,3) sin moverse a la derecha dos veces consecutivas, o sin salir de la cuadrícula.
- **Caso de prueba 4:** una secuencia de movimiento óptima podría ser: (1,1) -> (1,2) -> (2,2) -> (2,1) -> (3,1) -> (3,2 ) -> (4,2). Se puede demostrar que esta es la solución óptima. Entonces la respuesta es 6.
