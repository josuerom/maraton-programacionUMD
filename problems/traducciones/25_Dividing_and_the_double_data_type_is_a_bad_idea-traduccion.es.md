# Traducción - 25. Dividir y el tipo de dato doble es una mala idea.pdf

### Requisitos
- Nombre del archivo origen: Dividing.c, Dividing.cpp, Dividing.java, Dividing.py
- Entrada: Entrada estándar
- Salida: Salida estándar
- Autor(es): Milton Jesús Vera Contreras - UFPS (Profesor)

### Enunciado
Carlos es un estudiante que utiliza varias divisiones y tipos de datos dobles en sus programas de computadora. Su profesor ha advertido que la división da como resultado errores de precisión, por ejemplo, cuando la división no es exacta y se genera un número decimal periódico. Pero Carlos insiste en usar división y tipo de datos doble. Luego, su profesor creó este problema simple y desafió a Carlos a resolverlo.

### Entrada
La entrada consiste en múltiples casos de prueba. Cada caso de prueba consta de dos números enteros a y n (1 ≤ a ≤ 100, 0 ≤ n ≤ 10^4).

### Salida
Para cada caso de prueba, se deben imprimir dos enteros m y x si la división 1/a^n es exacta y m es el entero más pequeño que satisface esta igualdad (en el conjunto de enteros):

<div align="center"><img src="https://github.com/josuerom/maraton-programacionUMD/blob/main/img/25_Dividing.png"></div>

Si la división 1/a^n es inexacta, imprima: *Precision Error*

#### Muestra 1
| Input | Output |
| ----- | ------ |
| 1 9999 | 0 1 |
| 2 6 | 6 15625 |
| 5 11 | 11 2048 |
| 10 15 | 15 1 |
| 80 15 | 60 28421709430404007434844970703125 |
| 7 19 | Precision Error |
| 99 23 | Precision Error |

**Nota:** Una división es exacta cuando el resto es cero. El dividendo es igual al divisor multiplicado por el cociente. El cociente es un número entero o un número de punto flotante no periódico, por ejemplo: (1/16 = 0,0625), (1/125 = 0,008).

Una división es inexacta cuando sobra un resto. El dividendo es igual al divisor multiplicado por el cociente más el resto. El cociente es un número de punto flotante periódico, por ejemplo: (1/7 = 0, 142857 142857 142857...) con punto (decimal periódico) 142857, (1/14 = 0, 0 714285 714285 714285...) con punto (decimal periódico) 714285.