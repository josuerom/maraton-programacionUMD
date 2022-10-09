# Traducción - 37. Evento Gastronómico.pdf

### Requisitos
- Nombre del archivo origen: Gastronomic.c, Gastronomic.cpp, Gastronomic.java, Gastronomic.py
- Entrada: Estándar
- Salida: Estándar

### Enunciado
Los organizadores del SWERC quieren realizar un evento gastronómico.

La ubicación del evento es un edificio con n salas conectadas por n − 1 corredores (cada corredor conecta dos salas) de manera que es posible ir de cualquier sala a cualquier otra sala.

En cada sala hay que montar la degustación de un plato típico italiano. Puedes elegir entre n platos típicos italianos valorados del 1 al n en función de su calidad (n es la mejor valoración posible). Los n platos tienen calificaciones distintas.

Desea asignar los n platos a las n habitaciones para que el número de recorridos placenteros sea el máximo. A
agradable recorrido es una secuencia no vacía de habitaciones de modo que:

- Cada habitación de la secuencia está conectada con la siguiente de la secuencia por un pasillo.
- Las calificaciones de los platos en las habitaciones (en el orden dado por la secuencia) van en aumento.

Si asigna los n platos de manera óptima, ¿cuál es el número máximo de recorridos agradables?

### Entrada
La primera línea contiene un número entero n (2 ≤ n ≤ 10^6) – el número de habitaciones.

La segunda línea contiene n − 1 enteros p2, p3, . . ., pn (1 ≤ pi < i). Cada pi indica que hay un pasillo entre la habitación i y la habitación pi. Se garantiza que el edificio tiene la propiedad de que es posible pasar de cualquier habitación a cualquier otra habitación.

### Salida
Imprime el número máximo de recorridos agradables.

#### Muestra 1
| Input | Output |
| ----- | ------ |
| 5 | 13 |
| 1 2 2 2 |  |

#### Muestra 2
| Input | Output |
| ----- | ------ |
| 10 | 47 |
| 1 2 3 4 3 2 7 8 7 |  |

### Explicación
#### Explicación del ejemplo 1
Es óptimo colocar el plato con clasificación 1 en la habitación 1, el plato con clasificación 2 en la habitación 3, el plato con clasificación 3 en la habitación 2, el plato con clasificación 4 en la habitación 5 y el plato con clasificación 5 en la habitación 4.

Los 13 recorridos placenteros posibles son: (1), (2), (3), (4), (5), (1, 2), (3, 2), (2, 4), (2, 5) ), (1, 2, 4), (1, 2, 5), (3, 2, 4), (3, 2, 5).

También hay otras formas de asignar los platos a las habitaciones para que haya 13 agradables recorridos.