# Traducción - 29. Foto de dron.pdf

### Requisitos
- Nombre del archivo origen: Drone.c, Drone.cpp, Drone.java, Drone.py
- Entrada: Estándar
- Salida: Estándar

### Enunciado
Hoy, como cada año en SWERC, los concursantes n^2 se han reunido fuera del recinto para hacerse una foto con un dron. Jennifer, la administradora de redes sociales del evento, los ha organizado en un cuadrado n × n. Como es muy buena en su trabajo, sabe que el concursante que se encuentra en la intersección de la i-ésima fila con la j-ésima columna tiene ai, j años. Coincidentemente, se da cuenta de que no hay dos concursantes de la misma edad y que todos tienen entre 1 y n^2 años.

Jennifer está planeando que algunos concursantes sostengan una pancarta con el logo del CIPC paralelo al suelo, para que sea claramente visible en la imagen aérea. Estos son los pasos que va a seguir para tomar la foto perfecta del dron SWERC.

- En primer lugar, Jennifer seleccionará a cuatro concursantes parados en los vértices de un rectángulo alineado con el eje.
- Luego, hará que los dos concursantes más jóvenes sostengan uno de los postes, mientras que los dos concursantes mayores sostendrán el otro poste.
- Finalmente, desplegará el estandarte, usando los palos para sostener sus dos extremos. Obviamente, esto solo se puede hacer si los dos polos están paralelos y no se cruzan, como se muestra en las siguientes imágenes.

<div align="center"><img src="https://github.com/josuerom/maraton-programacionUMD/blob/main/img/29_Drone1.png"></div>

Siendo muy indecisa, a Jennifer le gustaría probar todos los arreglos posibles para la pancarta, pero le preocupa que esto pueda causar que los concursantes lleguen tarde a la competencia. ¿De cuántas formas diferentes hay para elegir a los cuatro concursantes que sujetan los postes para sacar una foto perfecta? Dos opciones son
se considera diferente si al menos un competidor está incluido en uno pero no en el otro.

### Entrada
La primera línea contiene un único número entero n (2 ≤ n ≤ 1500).

Las siguientes n líneas describen las edades de los concursantes. Específicamente, la i-ésima línea contiene los números enteros ai,1, ai 2, ....., ai,n (1 ≤ ai,j ≤ n^2).

Se garantiza que ai,j != ak,l si i != k o j != l.

### Salida
Escribe el número de formas en que Jennifer puede elegir a los cuatro concursantes que sostienen los postes.

#### Muestra 1
| Input | Output |
| ----- | ------ |
| 2 | 0 |
| 1 3 |  |
| 4 2 |  |

#### Muestra 2
| Input | Output |
| ----- | ------ |
| 2 | 1 |
| 3 2 |  |
| 4 1 |  |

#### Muestra 3
| Input | Output |
| ----- | ------ |
| 3 | 6 |
| 9 2 4 |  |
| 1 5 3 |  |
| 7 8 6 |  |

### Explicación
#### Explicación del ejemplo 1
Hay 4 concursantes, dispuestos de la siguiente manera.

<div align="center"><img src="https://github.com/josuerom/maraton-programacionUMD/blob/main/img/29_Drone2.png"></div>

Solo hay una forma de elegir a cuatro concursantes, con un poste en manos de los concursantes de 1 y 2 años y el otro de los concursantes de 3 y 4 años. Pero luego, como podemos ver en la imagen, los postes se cruzan.

<div align="center"><img src="https://github.com/josuerom/maraton-programacionUMD/blob/main/img/29_Drone3.png"></div>

Como no hay una forma válida de elegir cuatro concursantes, la respuesta es 0.

#### Explicación del ejemplo 2
Los 4 concursantes están dispuestos de la siguiente manera.

<div align="center"><img src="https://github.com/josuerom/maraton-programacionUMD/blob/main/img/29_Drone4.png"></div>

Una vez más, solo hay una forma de elegir cuatro concursantes, pero esta vez los polos no se cruzan.

<div align="center"><img src="https://github.com/josuerom/maraton-programacionUMD/blob/main/img/29_Drone5.png"></div>

#### Explicación del ejemplo 3
Los 9 concursantes están dispuestos de la siguiente manera.

<div align="center"><img src="https://github.com/josuerom/maraton-programacionUMD/blob/main/img/29_Drone6.png"></div>

Hay 6 formas de elegir a cuatro concursantes para que los polos no se crucen, como se muestra en las siguientes imágenes.

<div align="center"><img src="https://github.com/josuerom/maraton-programacionUMD/blob/main/img/29_Drone7.png"></div>