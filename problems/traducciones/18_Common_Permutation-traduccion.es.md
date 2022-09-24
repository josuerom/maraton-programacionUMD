# Traducción - 18. Permutación común.pdf

### Requisitos
- Nombre del archivo origen: Permutation.c, Permutation.cpp, Permutation.java, Permutation.py
- Tiempo límite: 2000 ms
- Memoria límite: 256144kB

### Enunciado
Dadas dos cadenas *a* y *b*, imprima la cadena más larga *X* de letras tal que haya una permutación de *X* que sea una subsecuencia de *a* y una permutación de *X* que sea una subsecuencia de *b*.

### Entrada
El archivo de entrada contiene varios casos, cada uno de los cuales consta de dos líneas consecutivas. Esto significa que las líneas 1 y 2 son un sólo caso de prueba, las líneas 3 y 4 son otro caso de prueba, y así sucesivamente. Cada línea contiene una cadena de caracteres en minúsculas, con la primera línea de un par que se denota con *a* y la segunda que se denota con *b*. Cada cadena consta de un máximo de 1000 carácteres.

### Salida
Para cada conjunto de entrada, genere una línea que contenga *X*. Si varios *X* cumplen los criterios anteriores, elija el primero en orden alfabético.

#### Muestra 1
| Input   | Output |
| ------- | ------ |
| pretty  |      |
| women   | e    |
| walking |      |
| down    | nw   |
| the     |        |
| street  | et     |
