# Traducción - 1. Bebidas.pdf

**Requisitos**
- Límite de tiempo de ejecución 2000 ms (2s)
- Límite de memoria 262144 kB (kilobytes)

**Enunciado**

El pequeño **Vasya** ama mucho el jugo de naranja. Es por eso que cualquier comida y bebida en su cocina contiene necesariamente 
jugo de naranja. Hay *n* bebidas en su refrigerador, la fracción de volumen de jugo de naranja en la *i-th* bebida es igual 
a *pi* por ciento.

Un día, **Vasya** decidió prepararse un cóctel de naranja. Tomó proporciones iguales de cada una de las *n* bebidas y las mezcló. 
Luego se preguntó, cuánto jugo de naranja tiene el coctel. 

Encuentra la fracción de volumen de jugo de naranja en la bebida final.

**Entrada**

La primera línea de entrada contiene un solo número entero *n* (1 ≤ *n* ≤ 100) - la cantidad de bebidas que contienen 
naranja en el refrigerador de Vasya. La segunda línea contiene *n* enteros *pi* (0 ≤ *pi* ≤ 100) — el volumen
fracción de jugo de naranja en la *i-th* bebida, en porcentaje. Los números están separados por un espacio.

**Salida**

Imprima la fracción de volumen en porcentaje de jugo de naranja en el cóctel de Vasya. La respuesta se considerará
correcta si el error absoluto o relativo no supera los 10^-4.

**Muestra 1**
| Input              | Output          |
| ------------------ | --------------- |
| 3                  |                 |
| 50  50  100        | 66.666666666667 |

**Muestra 2**

| Input              | Output          |
| ------------------ | --------------- |
| 4                  |                 |
| 0  25  50 75       | 37.500000000000 |
