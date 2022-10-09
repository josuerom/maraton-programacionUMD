# Traducción - 36. Perímetro.pdf

### Requisitos
- Nombre del archivo origen: Boundary.c, Boundary.cpp, Boundary.java, Boundary.py
- Entrada: Estándar
- Salida: Estándar

### Enunciado
A Bethany le gustaría colocar azulejos en su baño. El baño tiene ancho w centímetros y largo l centímetros. Si Bethany simplemente usara los mosaicos básicos de tamaño 1 × 1 centímetros, usaría w · l de ellos.

Sin embargo, ella tiene algo diferente en mente.
- En el interior del suelo quiere utilizar las losetas 1×1. Ella necesita exactamente (w − 2) · (l − 2) de estos.
- En el límite del piso, quiere usar mosaicos de tamaño 1 × a para algún número entero positivo a. Los mosaicos también se pueden girar 90 grados.

¿Para qué valores de una lata Bethany embaldosa el piso del baño como se describe? Tenga en cuenta que a también puede ser 1.

### Entrada
Cada prueba contiene múltiples casos de prueba. La primera línea contiene un número entero t (1 ≤ t ≤ 100) – el número de casos de prueba. Las descripciones de los casos de prueba t siguen.

Cada caso de prueba consta de una sola línea, que contiene dos números enteros w, l (3 ≤ w, l ≤ 10^9): las dimensiones del baño.

### Salida
Para cada caso de prueba, imprima un entero k (0 ≤ k) – el número de valores válidos de a para el caso de prueba dado – seguido de k enteros a1, a2, ...., ak (1 ≤ ai) – el valor válido valores de a. Los valores a1, a2, ...., ak deben ordenarse de menor a mayor.

Se garantiza que bajo las restricciones del problema, la salida contiene como máximo 2 · 10^5 enteros.

#### Muestra
| Input | Output |
| ----- | ------ |
| 3 | 3 1 2 3 |
| 3 5 | 3 1 2 11 |
| 12 12 | 2 1 2 |
| 314159265 35897932 |  |

### Explicación
En el **primer caso de prueba**, el baño mide 3 centímetros de ancho y 5 centímetros de largo. Hay tres valores de tal que Bethany puede embaldosar el piso como se describe en el enunciado, a saber, a = 1, a = 2 y a = 3.
Los tres mosaicos están representados en las siguientes imágenes.

<div align="center"><img src="https://github.com/josuerom/maraton-programacionUMD/blob/main/img/36_Boundary.png"></div>