# Traducción - 8. Arte abstracto.pdf
Liga Colombiana de Programación Colegiada - CCPL 2018

### Requisitos
- Nombre del archivo de origen: Abstract.c, Abstract.cpp, Abstract.java o Abstract.py
- Tiempo límite: 2000 ms
- Memoria límite: 262144 kB

### Enunciado
Arty ha sido un artista abstracto desde la infancia y su trabajo ha tomado muchas formas. Sus últimas (y más costosas) creaciones se conocen cariñosamente como Arte Abstracto dentro de la comunidad de arte abstracto (no son el grupo más original cuando se trata de apodos amorosos). Aquí hay un ejemplo de uno de los trabajos recientes de Arty:

- Un ejemplo del arte de Arty, se encuentra en el PDF orignal por lo que no es necesaria verla.

Como puede ver, el arte abstracto se crea pintando polígonos (posiblemente superpuestos). Cuando Arty pinta uno de sus diseños siempre pinta cada polígono completamente antes de pasar al siguiente.

El precio de las piezas individuales del arte abstracto de Arty varía mucho según su atractivo estético, pero los coleccionistas exigen dos datos sobre cada pintura:
1. La cantidad total de pintura utilizada, y
2. La cantidad total de lona cubierta.

Tenga en cuenta que el primer valor será mayor que el segundo siempre que haya superposición entre dos o más polígonos. Ambos valores se pueden calcular a partir de una lista que contiene los vértices de todos los polígonos utilizados en las pinturas, pero Arty no puede perder el tiempo en actividades tan plebeyas: ¡tiene un gran arte para producir! Supongo que depende de ti.

### Entrada
La primera línea de entrada contiene un único número entero *n* (1 ≤ *n* ≤ 100) que representa el número de polígonos que se pintarán. A continuación hay n líneas, cada una de las cuales describe un polígono pintado. Cada descripción de polígono comienza con un número entero *m* (3 ≤ *m* ≤ 20) que indica el número de lados del polígono, seguido de *m* pares de números enteros *x y* (0 ≤ *x, y* ≤ 1000) que especifican las coordenadas de los vértices del polígono en orden consecutivo. Los polígonos pueden ser cóncavos pero ningún polígono se cruzará a sí mismo. Ningún punto del lienzo será tocado por más de dos segmentos de borde de polígono.

### Salida
Muestre tanto la cantidad total de pintura utilizada como la cantidad de lienzo cubierto. Muestra estos números con exactamente tres lugares decimales, redondeados.

#### Muestra 1
| Entrada | Salida |
| ------- | ------ |
| 3 | |
| 8 7 10 7 17 10 20 17 20 20 17 20 10 17 7 10 7 | 315.000|
| 4 0 0 0 8 8 8 8 0 | 258.500 |
| 4 3 3 3 13 13 13 13 3 | |

#### Enlace al PDF original
[8. Abstract_Art.pdf](https://github.com/josuerom/maraton-programacionUMD/blob/main/problems/8.%20Abstract_Art.pdf)
