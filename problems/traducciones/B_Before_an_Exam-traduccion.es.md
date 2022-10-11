# Traducción - B. Antes de un examen - CodeForces

### Requisitos
- Límite de tiempo por prueba: 0.5 segundo
- Límite de memoria por prueba: 64 Mb
- Input: Entrada estándar
- Output: Salida estándar

### Enunciado
Mañana Peter tiene un examen de Biología. No le gusta mucho esta materia, pero hace *d* días se enteró de que tendría que hacer este examen. Los padres estrictos de Peter hicieron que se preparara para el examen de inmediato, para este propósito tiene que estudiar no menos de *minTime$1* y no más de *maxTime$i* horas por cada i-ésimo día. Además, le advirtieron a Peter que un día antes del examen comprobarían cómo había seguido sus instrucciones.

Entonces, hoy es el día en que los padres de Peter le piden que muestre el horario de sus estudios preparatorios. Pero el niño solo ha contado la suma de las horas que *sumTime* dedicó a la preparación, y ahora quiere saber si puede mostrarles a sus padres un calendario *schedule* con *d* números, donde cada número *sсhedule$i* representa el tiempo en horas que Peter dedica cada i -th día en estudios de biología, y satisfaciendo las limitaciones impuestas por sus padres, y al mismo tiempo la suma total de todos los horarios *sсhedule$i* debe ser igual a *sumTime*.

### Entrada
La primera línea de entrada contiene dos números enteros d, sumTime (1 ≤ d ≤ 30, 0 ≤ sumTime ≤ 240) - la cantidad de días durante los cuales Peter estudió y la cantidad total de horas dedicadas a la preparación. Cada una de las siguientes d líneas contiene dos números enteros minTimei, maxTimei (0 ≤ minTimei ≤ maxTimei ≤ 8), separados por un espacio: cantidad mínima y máxima de horas que Peter podría pasar en el i-ésimo día.

### Salida
En la primera línea escriba **YES**, y en la segunda línea escriba d números (separados por un espacio), cada uno de los números - cantidad de horas que Pedro pasó en la preparación en el día correspondiente, si siguió las instrucciones de sus padres; o escriba **NO** en la línea única. Si hay muchas soluciones, imprima cualquiera de ellas.

### Muestra 1
| Input |
| ----- |
| 1 48 |
| 5 7 |
| Output |
| NO |

### Muestra 2
| Input |
| 2 5 |
| 0 1 |
| 3 5 |
| Output |
| YES |
| 1 4 |