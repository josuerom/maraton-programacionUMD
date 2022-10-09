# Traducción - 27. Tour universitario amazónico.pdf

### Requisitos
- Nombre del archivo origen: Amazonia.c, Amazonia.cpp, Amazonia.java, Amazonia.py
- Entrada: Entrada estándar
- Salida: Salida estándar
- Autor(es): Juan José Ortiz Plaza - Uni. Amazonía (Estudiante)

### Enunciado
Amazonía Univesity te ha contratado para enseñar los n principales sitios que los nuevos estudiantes deben conocer. Para ello se debe definir una ruta en la que cada sitio se visite una sola vez en el recorrido y decir cuál es la distancia más corta posible.

Cada sitio está numerado por un valor único y están conectados por m caminos bidireccionales. El recorrido debe iniciar en la puerta principal de la universidad, identificada con el número x. Y el recorrido puede terminar en cualquier lugar.

### Entrada
La primera línea de entrada contiene tres números n, m y x. n es el número de sitios, m es el número de vías y x es el identificador de la puerta principal de la universidad. 2 ≤ norte ≤ 16, 1 ≤ metro ≤ norte ∗ (norte - 1)/2, 1 ≤ x ≤ 10^5.

Las siguientes m líneas contienen la descripción de los caminos, la i − ésima línea contiene tres números: ui, vi, wi (1 ≤ ui, vi, wi ≤ 10^5, ui != vi) indicando que puedes ir desde el sitio ui al sitio vi y viceversa con una distancia wi.

### Salida
Muestre la distancia mínima posible visitando todos los sitios una vez, comenzando desde x. Si es imposible entonces mostrar −1.

#### Muestra 1
| Input | Output |
| ----- | ------ |
| 5 6 1 | 152 |
| 1 4 50 |  |
| 4 3 2 |  |
| 3 50 1 |  |
| 50 2 100 |  |
| 50 4 1 |  |
| 4 2 1 |  |

#### Muestra 2
| Input | Output |
| ----- | ------ |
| 5 6 2 | 153 |
| 1 4 50 |  |
| 4 3 2 |  |
| 3 50 1 |  |
| 50 2 100 |  |
| 50 4 1 |  |
| 4 2 1 |  |

#### Muestra 3
| Input | Output |
| ----- | ------ |
| 5 6 50 | -1 |
| 1 4 50 |  |
| 4 3 2 |  |
| 3 50 1 |  |
| 50 2 100 |  |
| 50 4 1 |  |
| 4 2 1 |  |
