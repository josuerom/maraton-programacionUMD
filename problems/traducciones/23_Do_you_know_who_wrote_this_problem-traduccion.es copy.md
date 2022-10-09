# Traducción - 23. ¿Sabes quíen escribió este problema?.pdf

### Requisitos
- Nombre del archivo origen: Know.c, Know.cpp, Know.java, Know.py
- Entrada: Entrada estándar
- Salida: Salida estándar
- Autor(es): Milton Jesús Vera Contreras - UFPS (Profesor)

<div align="center"><img src="https://github.com/josuerom/maraton-programacionUMD/blob/main/img/23_Do_you_know.png"></div>

### Enunciado
Los alumnos líderes del grupo de estudio de programación competitiva de la UFPS ganaron el Concurso Regional del ICPC y pasarán a la Final Mundial del ICPC en Europa. Los graduados de ese grupo ahora tienen mucho dinero, por lo que donaron dinero para que los estudiantes viajaran. Luego los alumnos líderes podrán visitar n lugares turísticos diferentes numerados del 1 al n.

Aunque los graduados tienen mucho dinero, su donación solo cubre comida, hotel y boleto de entrada, pero no incluye el costo del transporte. Los estudiantes encontraron en un sitio web algunas alternativas de transporte baratas:

- Alternativas básicas: que te permiten viajar de un lugar turístico u a un lugar turístico v por un costo de w, pero son peligrosas.
- Alternativas con origen fijo y destino variable: permiten viajar desde un lugar turístico de origen fijo u hacia cualquier destino del rango [l, r].
- Alternativas con destino fijo y origen variable: permiten viajar desde cualquier lugar turístico del rango [l, r] a un destino fijo u.

Sin embargo, la limitación de las alternativas de transporte barato es que solo se pueden utilizar una vez.

Los tres estudiantes son excelentes programadores y resuelven varios tipos de problemas. Entonces decidieron escribir un programa de computadora para estimar la cantidad mínima de dinero que tendrán que gastar y hacer un presupuesto que les permita visitar tantos lugares turísticos como sea posible en Europa.

¿Quieres clasificarte para la final mundial del ICPC? Si resuelve este problema, estará en la final mundial del ICPC.

### Entrada
La primera línea de la entrada contiene tres 3 enteros n, p y g (1 ≤ n, p ≤ 10^5; 1 ≤ g ≤ n):

- n: Número de lugares turísticos.
- p: Número de alternativas de transporte económico.
- g: Posición inicial de los alumnos.

Las siguientes p líneas contienen la descripción de las alternativas de transporte económico. Cada línea comienza con una cadena s, que define el tipo de alternativa (básica, origen fijo, destino fijo). Si la alternativa es de tipo básica, entonces seguirán tres 3 enteros v, u y w donde w es el costo (1 ≤ v, u ≤ n, 1 ≤ w ≤ 10^9).

De lo contrario, cuatro enteros 4 seguirán a u, l, r y w, donde w es el costo (1 ≤ u ≤ n, 1 ≤ l ≤ r ≤ n, 1w10^9).

### Salida
Imprime una sola línea con n enteros separados por un espacio. El i-ésimo número es el costo de ir desde la posición inicial del estudiante hasta el i-ésimo destino, o −1 si es imposible llegar.

#### Muestra 1
| Input | Output |
| ----- | ------ |
| 6 8 1 | 0 31 24 31 31 25 |
| fixed-origin 4 3 6 95 |  |
| fixed-destination 3 1 3 24 |  |
| fixed-destination 6 4 4 12 |  |
| fixed-origin 5 1 2 9 |  |
| basic 3 3 20 |  |
| fixed-destination 4 2 6 32 |  |
| basic 1 6 25 |  |
| fixed-origin 6 1 5 6 |  |

#### Muestra 2
| Input | Output |
| ----- | ------ |
| 5 4 1 | 0 -1 -1 12 -1 |
| fixed-origin 2 3 4 10 |  |
| basic 2 4 16 |  |
| fixed-destination 4 1 3 12 |  |
| basic 2 5 25 |  |

**Nota:** Este problema es una adaptación no autorizada de un problema anterior. Espero que os guste y lo solucionéis.