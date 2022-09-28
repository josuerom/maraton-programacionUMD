# Traducción - 19. ¡La torre de Hanoi vuelve a tener problemas!.pdf

### Requisitos
- Nombre del archivo origen: HanoiTower.c, HanoiTower.cpp, HanoiTower.java, HanoiTower.py
- Tiempo límite: 2000 ms
- Memoria límite: 256144 kB

### Enunciado
Hay muchas variaciones interesantes en el problema de la Torre de Hanoi. Esta versión consta de N clavijas y una bola que contiene cada número de 1, 2, 3,....,∞. Siempre que la suma de los números de dos bolas sea un cuadrado perfecto (es decir, c^2 para algún número entero c), se repelerán entre sí con tanta fuerza que nunca podrán tocarse.

<div align="center"><img src="https://github.com/josuerom/maraton-programacionUMD/blob/main/img/19_Hanoi_Tower.png"></div>

El jugador debe colocar las bolas en las clavijas de una en una, en orden creciente de número de bolas (es decir, primero la bola 1, luego la bola 2, luego la bola 3...). El juego termina donde no hay movimiento que no sea repelente.

El objetivo es colocar tantas bolas en las clavijas como sea posible. La figura de arriba da el mejor resultado posible para 4 clavijas.

### Entrada
La primera línea de la entrada contiene un solo entero *T* que indica el número de casos de prueba (1 <= *T* <= 50). Cada caso de prueba contiene un único número entero *N* (1 <= *N* <= 50) que indica el número de clavijas disponibles.

### Salida
Para cada caso de prueba, imprima una línea que contenga un número entero que indique el número máximo de bolas que se pueden colocar. Imprime "-1" si se puede colocar un número infinito de bolas.

#### Muestra 1
| Input | Output |
| ----- | ------ |
| 2     |        |
| 4     | 11     |
| 25    | 337    |
