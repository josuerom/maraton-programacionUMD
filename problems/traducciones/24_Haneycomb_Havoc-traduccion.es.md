# Traducción - 24. Estragos de Panal.pdf

### Requisitos
- Nombre del archivo origen: Honey.c, Honey.cpp, Honey.java, Honey.py
- Entrada: Entrada estándar
- Salida: Salida estándar
- Autor(es): Carlos Fernando Calderón Rivero - UFPS (Estudiante)

<div align="center"><img src="https://github.com/josuerom/maraton-programacionUMD/blob/main/img/24_Honey.png"></div>

### Enunciado
Honeycomb Havoc es un minijuego que se encuentra en Mario Party 2. En este juego, los jugadores hacen cola y se turnan debajo de un árbol con varios tipos de frutas y panales. En su turno, cada jugador selecciona una de las dos opciones: Tomar los siguientes 1 o 2 elementos del Árbol. Si el jugador solo obtiene frutas, sigue jugando y vuelve al final de la cola. De lo contrario, si el jugador obtiene un panal, será eliminado y esperará afuera hasta el final del juego. El jugador que permanece en la cola cuando todos los demás son eliminados gana el juego.

Algunas reglas son:
- Si el jugador selecciona dos elementos, pero el primero es un panal, será eliminado inmediatamente y no obtendrá el elemento adicional.
- Antes de que comience el minijuego, se genera un número aleatorio de frutas y panales y se organizan en una línea. Los jugadores obtendrán los artículos en el orden en que fueron generados. Si, por alguna razón, no hay un ganador después de que terminen los artículos, solo se entregarán panales del árbol para terminar el juego.
- La cola inicial de jugadores se ordena por el número de cada jugador. El jugador 1 es el primero, el jugador 2 es el segundo y así sucesivamente.
- Un jugador controlado por la CPU siempre seleccionará una cantidad de elementos en cada turno según el número del jugador:
    - El jugador 2 siempre tomará 1 artículo
    - El jugador 3 siempre tomará 2 artículos
    - El jugador 4 se alternará. En su primer turno tomará 1 ítem, luego 2 ítems, luego 1 nuevamente y así sucesivamente.

En pocas palabras, Bob está a punto de ganar todo el juego, pero necesita ganar este último minijuego y hará cualquier cosa para lograrlo. Está jugando contra otros tres jugadores controlados por la CPU. Todos los jugadores pueden ver la línea ordenada de elementos, por lo que a Bob le gustaría saber si puede ganar el juego eligiendo de manera eficiente la cantidad de elementos que debe seleccionar en cada uno de sus turnos.

### Entrada
La primera línea de entrada contiene un número T (T <= 100) con el número de casos de prueba. Cada caso comienza con una línea que contiene dos números enteros: N (1 ≤ N ≤ 1000), el número de elementos del árbol. La segunda línea contendrá una cadena de tamaño N que contiene solo las letras "F" y "H", donde F es una fruta y H es un panal. El orden de cada letra es el orden de los elementos. El ítem i será el i-ésimo entregado por el árbol.

### Salida
Imprima una sola línea con la palabra POSSIBLE si Bob puede ganar el juego. De lo contrario, imprima IMPOSSIBLE.

#### Muestra 1
| Input | Output |
| ----- | ------ |
| 6 | IMPOSSIBLE |
| 5 | POSSIBLE |
| FHHFH | IMPOSSIBLE |
| 6 | POSSIBLE |
| FFFFFF | POSSIBLE |
| 5 | IMPOSSIBLE |
| FFFFF |  |
| 7 |  |
| FFFFFFF |  |
| 8 |  |
| FFHHFFHF |  |
| 5 |  |
| HFFFF |  |