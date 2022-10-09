# Traducción - 32. Evolución de las comadrejas.pdf

### Requisitos
- Nombre del archivo origen: Evolution.c, Evolution.cpp, Evolution.java, Evolution.py
- Entrada: Estándar
- Salida: Estándar

### Enunciado
Un basilisco salvaje acaba de aparecer en tu puerta. No estás completamente seguro de qué es un basilisco y te preguntas si evolucionó de tu animal favorito, la comadreja.

¿Cómo puedes saber si los basiliscos evolucionaron a partir de las comadrejas? Ciertamente, un buen primer paso es secuenciar ambos ADN. Luego puedes intentar comprobar si existe una secuencia de posibles mutaciones del ADN de la comadreja al ADN del basilisco.

Tu amigo Ron es un alquimista talentoso y ha estudiado secuencias de ADN en muchos de sus experimentos. Descubrió que las cadenas de ADN consisten en las letras A, B y C y que las mutaciones individuales solo pueden eliminar o agregar subcadenas (una subcadena es una secuencia contigua de caracteres). Las subcadenas que pueden
eliminarse o agregarse por una mutación son AA, BB, CC, ABAB o BCBC. Durante una secuencia de mutaciones, una cadena de ADN puede incluso quedar vacía.

Ron ha accedido a secuenciar el ADN de la comadreja y el basilisco para ti, pero averiguar si existe una secuencia de posibles mutaciones que conduzcan de uno a otro es demasiado difícil para él, así que tienes que hacerlo por tu cuenta.

### Entrada
Cada prueba contiene múltiples casos de prueba. La primera línea contiene un número entero t (1 ≤ t ≤ 100) – el número de casos de prueba. Las descripciones de los casos de prueba t siguen.

La primera línea de cada caso de prueba contiene una cadena u (1 ≤ |u| ≤ 200) – el ADN de la comadreja.

La segunda línea de cada caso de prueba contiene una cadena v (1 ≤ |v| ≤ 200) – el ADN del basilisco.

Los valores |u|, |v| denote las longitudes de las cadenas u y v. Se garantiza que ambas cadenas u y v consisten en las letras A, B y C.

### Salida
Para cada caso de prueba, escriba **YES** si hay una secuencia de mutaciones para pasar de u a v y **NO** en caso contrario.

#### Muestra
| Input | Output |
| ----- | ------ |
| 8 | NO |
| A | NO |
| B | NO |
| B | YES |
| C | YES |
| C | YES |
| A | YES |
| AA | NO |
| BB |  |
| BB |  |
| CC |  |
| CC |  |
| AA |  |
| ABAB |  |
| BCBC |  |
| ABC |  |
| CBA |  |