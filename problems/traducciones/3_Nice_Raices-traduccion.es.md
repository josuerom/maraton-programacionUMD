# Traducción - 3. Raíces agradables.pdf

### Requisitos
- Nombre del archivo fuente: Nice.c Nice.cpp Nice.javaNice.py
- Límite de tiempo de ejecución 2000 ms (milisegundos)
- Límite de memoria 262144 kB (kilobytes)

### Enunciado

Todo el mundo sabe que los entrenadores del equipo de programación de la UCF son los mejores entrenadores del mundo y que de ellos salen algunos de los mejores solucionadores de problemas y programadores. Los miembros del equipo de la UCF son muy solicitados por diferentes empresas. FAAMG Inc ha organizado un buen paquete de aumento para atraer a los miembros del equipo de la UCF. A la hora de dar aumentos, FAAMG Inc da a cada miembro del equipo dos opciones: un aumento fijo o el doble de su salario. Cada miembro del equipo puede decidir qué opción desea. Por ejemplo, si el aumento fijo ofrecido por FAAMG Inc es de 5.000 dólares, un miembro del equipo que gane 3.000 dólares elegirá la opción de aumento fijo (5.000 dólares), pero un miembro del equipo que gane 8.000 dólares elegirá la opción del doble de salario, ya que será un aumento mejor (8.000 dólares en lugar de 5.000 dólares).

Teniendo en cuenta el aumento fijo ofrecido por FAAMG Inc y el salario de cada miembro del equipo, determine qué opción es la más elegida.

### Entrada

La primera línea de entrada contiene dos enteros: n (1 ≤ n ≤ 30), que indica el número de miembros del equipo y r (1 ≤ r ≤ 500000), que indica el aumento fijo ofrecido por FAAMGInc. Cada una de las siguientes n líneas de entrada contiene un número entero (entre 1 y 200000, ambos inclusive) que indica el salario actual de un miembro del equipo.

### Salida

La salida será un único entero: 1, 2 o 0. Imprime 1 si la mayoría de los miembros del equipo elige la opción de aumento fijo, 2 si la mayoría elige la opción de duplicar el salario, y 0 si las dos opciones son elegidas por el mismo número de miembros del equipo.

Si un miembro del equipo termina con el mismo aumento eligiendo cualquiera de las dos opciones, ese miembro del equipo no cuenta para ninguno de los dos grupos. Por ejemplo, si el aumento fijo es de 2.000 dólares y el salario actual de un miembro del equipo es de 2.000 dólares, el aumento fijo y el doble de salario terminan con el mismo aumento para este miembro del equipo, por lo que el miembro del equipo no cuenta para ninguno de los dos grupos.

#### Muestra 1
| Input              | Output |
| ------------------ | ------ |
| 6 1000             | 1      |
| 200                |        |
| 3000               |        |
| 500                |        |
| 2000               |        |
| 800                |        |
| 700                |        |

#### Muestra 2
| Input              | Output |
| ------------------ | ------ |
| 4 600              | 0      |
| 10                 |        |
| 9000               |        |
| 20                 |        |
| 8000               |        |


#### Muestra 3
| Input              | Output |
| ------------------ | ------ |
| 3 400              | 2      |
| 10000              |        |
| 9000               |        |
| 20                 |        |


#### Muestra 4
| Input              | Output |
| ------------------ | ------ |
| 6 2500             | 0      |
| 100                |        |
| 100000             |        |
| 2500               |        |
| 100                |        |
| 2500               |        |
| 200000             |        |
