# Traducción - 9. Cráteres.pdf
Liga Colombiana de Programación Colegiada - CCPL 2018

### Requisitos
- Nombre del archivo de origen: Craters.c, Craters.cpp, Craters.java, Craters.py
- Límite de tiempo: 2000ms
- Límite de memoria: 256144 kB
- Entrada estándar (Scanner, BufferedReader, etc)
- Salida estándar (println, print, etc)

### Enunciado
El general Warren Pierce tiene un pequeño problema. Está a cargo de un nuevo tipo de explosivo lanzado por drones y lo han estado probando en el desierto de Nevada, lo suficientemente lejos de cualquier centro de población para evitar víctimas civiles y miradas indiscretas. Desafortunadamente, se ha corrido la voz sobre estos experimentos y ahora existe la posibilidad de que haya espectadores descuidados, espías nefastos o, lo que es peor, ¡reporteros entrometidos! Para mantenerlos alejados del área de prueba, Warren quiere elegir una sola cerca que rodee todos los cráteres circulares producidos por las explosiones. Sin embargo, debido a varios recortes de fondos (para apoyar los recortes de impuestos para el ya-sabes-quién) no puede simplemente poner millas y millas de vallas como en los viejos tiempos. Piensa que si puede mantener a la gente a una distancia de al menos 10 metros de cualquier cráter, estará bien, pero no está seguro de la cantidad de cercas que debe solicitar. Dadas las ubicaciones y los tamaños de los cráteres, ¿puedes ayudar al general a determinar la cantidad mínima de cerca que necesita? A continuación se muestra un ejemplo con tres cráteres (especificados en la entrada de muestra 1).

<div align="center"><img src="https://github.com/josuerom/maraton-programacionUMD/blob/main/img/9_Craters.png"></div>

### Entrada
La primera línea de entrada contiene un único entero positivo *n* (*n* ≤ 200), el número de cráteres. Después de esto, hay n líneas que especifican la ubicación y el radio de cada cráter. Cada una de estas líneas contiene 3 enteros *x* *y* *r*, donde *x* y *y* especifican las ubicaciones de un cráter (|*x,y*| ≤ 10000) y *r* es su radio (0 < *r* ≤ 5000). Todas las unidades están en yardas.

### Salida
Muestre la cantidad mínima de cerca (en yardas) necesaria para acordonar los cráteres. Muestra este número con exactamente tres lugares decimales, redondeados.

#### Muestra 1
| Entrada | Salida |
| ----- | ------ |
| 3 | 1715.912 |
| 0 0 100 | |
| -60 200 40 | |
| 350 50 150 | |
