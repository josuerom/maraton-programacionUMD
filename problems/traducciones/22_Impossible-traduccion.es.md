# Traducción - 22. Imposible.pdf

### Requisitos
- Nombre del archivo origen: Impossible.c, Impossible.cpp, Impossible.java, Impossible.py
- Entrada: Entrada estándar
- Salida: Salida estándar
- Autor(es): Milton Jesús Vera Contreras - UFPS (Profesor)

<div align="center"><img src="https://github.com/josuerom/maraton-programacionUMD/blob/main/img/22_Impossible.png"></div>

### Enunciado
Dos matemáticos y un ingeniero están auditando transacciones bancarias en cajeros automáticos. Cada transacción se identifica con un número de identificación único que es consecutivo. Tienen la lista de transacciones desordenadas, pero falta un número de identificación. Los matemáticos dicen que no es posible encontrar el número de identificación que falta. El ingeniero dice que hay casos que se pueden resolver. *¿Puedes ayudarlos?*

### Entrada
Varios casos de prueba. Cada caso de prueba comienza con un número 10^3 ≤ n ≤ 10^6, que corresponde al número de transacciones. Luego sigue una lista de n−1 números de identificación xi, 10^5 ≤ xi ≤ 10^9. Los números de identificación son consecutivos y desordenados, no hay números duplicados y falta un número.

### Salida
Para cada caso de prueba, imprima el número de identificación de la transacción xi que falta o IMPOSSIBLE si los matemáticos están en lo correcto y "no es posible encontrar el número de identificación que falta".

#### Muestra 1
| Input | Output |
| ----- | ------ |
| 10 | 123462 |
| 123465 123460 123459 123457 123458 |  |
| 123463 123461 123464 123456 |  |

#### Muestra 2
| Input | Output |
| ----- | ------ |
| 11 | IMPOSSIBLE |
| 789065 789060 789059 789057 789058 |  |
| 789062 789063 789061 789064 789056 |  |

**Nota:** Debido a la cantidad de datos, se utiliza un ejemplo con un número n menor.