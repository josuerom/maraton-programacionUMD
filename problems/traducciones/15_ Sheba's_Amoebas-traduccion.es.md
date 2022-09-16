# Traducción - 15. Amebas de sheba.pdf

### Requisitos

- Nombre del archivo de origen: Amoebas.c, Amoebas.cpp, Amoebas.java, Amoebas.py
- Tiempo límete: 2000 ms
- Memoria límite: 256144 kB

### Enunciado

Después de una exitosa campaña de Kickstarter, Sheba Arriba ha recaudado suficiente dinero para su empresa de suministros biológicos por correo. "Sheba's Amoebas" puede enviar placas de Petri ya pobladas con una colonia de esos diminutos organismos unicelulares. Sin embargo, Sheba necesita poder verificar la cantidad de amebas que envía su empresa. Para cada plato, tiene una imagen en blanco y negro que ha sido preprocesada para mostrar cada ameba como un simple bucle cerrado de píxeles negros. (Un bucle es un conjunto mínimo de píxeles negros en el que cada píxel es adyacente exactamente a otros dos píxeles del conjunto; adyacente significa compartir un borde o una esquina de un píxel). Todos los píxeles negros de la imagen pertenecen a algún bucle.



A Sheba le gustaría que escribieras un programa que cuente los bucles cerrados en una matriz rectangular de píxeles en blanco y negro. No hay dos bucles cerrados en la imagen que se toquen o superpongan. Se sabe que una especie particularmente desagradable de ameba caníbal rodea y engulle a sus vecinos; en consecuencia, puede haber amebas dentro de las amebas. Por ejemplo, cada una de las imágenes de la Figura 4 contiene cuatro amebas.

### Entrada

La primera línea de entrada contiene dos números enteros *m* y *n*, (1 <= *m, n* <= 100). A esto le siguen *m* líneas, cada una de las cuales contiene *n* caracteres. Un '#' denota un píxel negro, un '.' denota un píxel blanco. Por cada píxel negro, exactamente.

### Salida

Muestra un único entero que representa el número de bucles en la entrada.

#### Muestra 1

| Input        | Output |
| ------------ | ------ |
| 12 12        | 4      |
| .##########. |        |
| #..........# |        |
| #..#...#..#  |        |
| #.##..#..#.# |        |
| #......#.#.# |        |
| #....#..#..# |        |
| #...#..#..#  |        |
| #..#...#...# |        |
| .#..#.#....# |        |
| #....#.....# |        |
| #.........#. |        |
| .#########.. |        |

#### Muestra 2

| Input      | Output |
| ---------- | ------ |
| 12 10      | 4      |
| .#####.... |        |
| #.....#... |        |
| #..#..#... |        |
| #.#.#.#... |        |
| #..#..#... |        |
| .#...#.... |        |
| ..###..... |        |
| ......#... |        |
| .##..#.#.. |        |
| #..#..#... |        |
| .##....... |        |
| .......... |        |

