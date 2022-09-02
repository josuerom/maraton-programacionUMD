# Traducción - 6. Números pesados

### Requisitos
- Nombre del archivo de origen: Heavy.c, Heavy.cpp, Heavy.java, Heavy.py
- Límite de tiempo de ejecución 2000 ms (milisegundos)
- Límite de memoria 246144 kB (kilobytes)

### Enunciado
Considere un entero positivo a. Definimos el peso de a como:
- (número de dígitos en a) * (suma de los dígitos en a)

Por ejemplo, si a = 5767.
- El peso de a es: (4) * (5 + 7 + 6 + 7) = 100

Dados dos números enteros positivos, determine cuál pesa más, es decir, es más pesado.

### Entrada
Solo hay una línea de entrada; contiene dos enteros separados exactamente por un espacio (en blanco). Suponga que cada número entero está entre 1 y 10^6 (inclusive).

### Salida
Escribe 1 si el primer número es más pesado, 2 si el segundo número es más pesado y 0 si los dos números pesan lo mismo.

#### Muestra 1
| Input       | Output   |
| ----------- | -------- |
| 59 1001     | 1        |
| 8 567       | 2        |
| 123 90      | 0        |
