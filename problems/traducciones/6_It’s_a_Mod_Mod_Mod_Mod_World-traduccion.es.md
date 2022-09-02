# Traducción - 6. Es un mundo mod.pdf

### Requisitos
- Nombre del archivo de origen: Itsamod.c, Itsamod.cpp, Itsamod.java, Itsamod.py
- Límite de tiempo de ejecución 2000 ms (milisegundos)
- Límite de memoria 246144 kB (kilobytes)

### Enunciado
Tiene varios problemas con tres números enteros p, q y n, encuentre (sumatoria de n hasta i=1 [(pi * i) mod q]). Es decir, los primeros n múltiplos de p, módulo q, sumados. Tenga en cuenta que la suma total no tiene módulo.

### Entrada
Cada entrada comenzará con una línea con un solo número entero W (1 ≤ W ≤ 10^5), que es el número de casos que debe resolver.

Cada una de las siguientes W líneas contendrá tres números enteros ***p***, ***q*** y ***n*** separados por espacios (1 ≤ p, q, n ≤ 10^6), que son los parámetros del problema descrito anteriormente.

### Salida
Salida W líneas, cada una con la respuesta para una instancia determinada del problema, en el orden en que aparecen en la entrada.

#### Muestra 1
| Input    | Output  |
| -------- | ------- |
| 3        |         |
| 2 7 2    | 6       |
| 1 4 5    | 7       |
| 3 8 10   | 37      |
