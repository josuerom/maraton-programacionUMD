# Traducción - 34. Restricciones pandémicas.pdf

### Requisitos
- Nombre del archivo origen: Pandemic.c, Pandemic.cpp, Pandemic.java, Pandemic.py
- Entrada: Estándar
- Salida: Estándar

### Enunciado
Después de mucho tiempo viviendo en el extranjero, ha decidido regresar a Italia y tiene que encontrar un lugar para vivir, pero las cosas no son tan fáciles debido a la pandemia mundial en curso.

Tus tres amigos Fabio, Flavio y Francesco viven en los puntos de coordenadas (x1, y1), (x2, y2) y (x3, y3), respectivamente. Debido a las restricciones de movilidad en respuesta a la pandemia, las reuniones están limitadas a 3 personas, por lo que solo podrás reunirte con 2 de tus amigos a la vez. Además, con el fin de contener la propagación de la infección, las autoridades han impuesto la siguiente medida adicional: para cada reunión, la suma de los trayectos de cada uno de los asistentes desde su lugar de residencia hasta el lugar de la reunión no debe exceder de r .

¿Cuál es el valor mínimo de r (que puede ser cualquier número real no negativo) para el que existe un lugar de residencia que le permite realizar las tres reuniones posibles entre usted y dos de sus amigos?. Tenga en cuenta que el lugar de residencia elegido no necesita tener coordenadas enteras.

### Entrada
La primera línea contiene los dos números enteros x1, y1 (−10^4 ≤ x1, y1 ≤ 10^4) – las coordenadas de la casa de tu amigo Fabio.

La segunda línea contiene los dos números enteros x2, y2 (−10^4 ≤ x2, y2 ≤ 10^4) – las coordenadas de la casa de tu amigo Flavio.

La tercera línea contiene los dos números enteros x3, y3 (−10^4 ≤ x3, y3 ≤ 10^4) – las coordenadas de la casa de tu amigo Francesco.

Se garantiza que sus tres amigos viven en diferentes lugares (es decir, se garantiza que los tres puntos (x1, y1), (x2, y2), (x3, y3) son distintos).

### Salida
Imprime el valor mínimo de r que te permita encontrar un lugar de residencia que satisfaga las condiciones anteriores. Su respuesta se considera correcta si su error absoluto no excede 10^−7.

Formalmente, deje que su respuesta sea a, y la respuesta del jurado sea b. Su respuesta se acepta si y solo si (|a-b|/max(1, |b|) ≤ 10^-7).

#### Muestra 1
| Input | Output |
| ----- | ------ |
| 0 0 | 5.0686143166 |
| 5 0 |  |
| 3 3 |  |

#### Muestra 2
| Input | Output |
| ----- | ------ |
| -1 0 | 2.0000000000 |
| 0 0 |  |
| 1 0 |  |

### Explicación
#### Explicación del ejemplo 1
Fabio, Flavio y Francesco viven en los puntos de coordenadas (0, 0), (5, 0) y (3, 3) respectivamente. El lugar de residencia óptimo, representado por una casa verde en la imagen de abajo, está en el punto con coordenadas (2.384..., 0.4151...).

<div align="center"><img src="https://github.com/josuerom/maraton-programacionUMD/blob/main/img/34_Pandemic1.png"></div>

Por ejemplo, es posible que te encuentres con Flavio y Francesco en el punto que se muestra a continuación, de modo que la suma de las distancias recorridas por los tres asistentes sea como máximo (y de hecho igual a) r = 5,0686....

<div align="center"><img src="https://github.com/josuerom/maraton-programacionUMD/blob/main/img/34_Pandemic2.png"></div>

#### Explicación del ejemplo 2
Cualquier punto en el segmento {(x, 0) : −1 ≤ x ≤ 1} es un lugar óptimo de residencia.