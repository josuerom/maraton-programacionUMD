# Traducción - F. Bit++ - Tomado de CodeForces

### Requisitos
- Límite de tiempo por prueba: 1 segundo
- Límite de memoria por prueba: 256 Mb
- Input: Entrada estándar
- Output: Salida estándar

### Enunciado
El lenguaje de programación clásico de Bitland es Bit++. Este lenguaje es tan peculiar y complicado.

El lenguaje es así de peculiar ya que tiene exactamente una variable, llamada x . Además, hay dos operaciones:

La operación ++ aumenta el valor de la variable x en 1.
Operación : disminuye el valor de la variable x en 1.
Una sentencia en el lenguaje Bit++ es una secuencia que consta exactamente de una operación y una variable x . El enunciado se escribe sin espacios, es decir, solo puede contener los caracteres " + ", " - ", " X ". Ejecutar una declaración significa aplicar la operación que contiene.

Un programa en Bit ++ es una secuencia de declaraciones, cada una de ellas debe ejecutarse. Ejecutar un programa significa ejecutar todas las sentencias que contiene.

Te dan un programa en lenguaje Bit++. El valor inicial de x es 0 . Ejecute el programa y encuentre su valor final (el valor de la variable cuando se ejecuta este programa).

### Entrada
La primera línea contiene un solo número entero n (1 ≤  n  ≤ 150) — el número de sentencias en el programa.

Las próximas n líneas contienen una declaración cada una. Cada sentencia contiene exactamente una operación ( ++ o -- ) y exactamente una variable x (indicada como la letra « X »). Por lo tanto, no hay declaraciones vacías. La operación y la variable se pueden escribir en cualquier orden.

### Salida
Imprime un solo entero: el valor final de x .

### Muestra
| Input |
| ----- |
| 1 |
| ++ X |
| Output |
| ------ |
| 1 |

| Input |
| ----- |
| 2 |
| X++ |
| --X |
| Output |
| ------ |
| 0 |