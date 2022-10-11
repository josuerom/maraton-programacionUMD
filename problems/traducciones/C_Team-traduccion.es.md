# Traducción - C. Equipo - Tomado de CodeForces

### Requisitos
- Límite de tiempo por prueba: 2 segundos
- Límite de memoria por prueba: 256 Mb
- Input: Entrada estándar
- Output: Salida estándar

### Enunciado
Un día, tres mejores amigas, Petya, Vasya y Tonya, decidieron formar un equipo y participar en concursos de programación. A los participantes se les suelen ofrecer varios problemas durante los concursos de programación. Mucho antes del comienzo, los amigos decidieron que implementarán un problema si al menos dos de ellos están seguros de la solución. De lo contrario, los amigos no escribirán la solución del problema.

Este concurso ofrece n problemas a los participantes. Para cada problema sabemos, qué amigo está seguro de la solución. Ayuda a los amigos a encontrar el número de problemas para los que escribirán una solución.

### Entrada
La primera línea de entrada contiene un solo número entero n ( 1 ≤ n ≤ 1000) — el número de problemas en el concurso. Entonces n líneas contienen tres enteros cada una, cada entero es 0 o 1 . Si el primer número de la línea es igual a 1 , entonces Petya está seguro de la solución del problema; de lo contrario, no está seguro. El segundo número muestra la opinión de Vasya sobre la solución, el tercer número muestra la opinión de Tonya. Los números en las líneas están separados por espacios.

### Salida
Imprime un solo número entero: la cantidad de problemas que los amigos implementarán en el concurso.

### Muestra
| Input |
| ----- |
| 3 |
| 1 1 0 |
| 1 1 1 |
| 1 0 0 |

| Output |
| ------ |
| 2 |

| Input |
| ----- |
| 2 |
| 1 0 0 |
| 0 1 1 |

| Output |
| ------ |
| 1 |