# Traducción - 11. Juego de lanzamientos.pdf

### Requisitos
- Nombre del archivo orign: Throwns.c, Throwns.cpp, Throwns.java, Throwns.py
- Tiempo limite: 2000 ms
- Memoria límite: 256144 kB

### Encunciado
Daenerys frecuentemente inventa juegos para ayudar a enseñar a su clase de Informática de segundo grado sobre varios aspectos de la disciplina.
o la lección de esta semana hace que los niños formen un círculo y (con cuidado) arrojen un huevo de dragón petrificado.

Los *n* niños están numerados de 0 a *n* - 1 (después de todo, es una clase de informática) en el sentido de las agujas del reloj alrededor del círculo.
El niño 0 siempre comienza con el huevo. Daenerys dirá una de dos cosas:

1. Un número *t*. indicando que el huevo se debe lanzar al niño que está en las posiciones *t* en el sentido de las agujas del reloj desde el portahuevos actual, envolviéndolo si es necesario. Si *t* es negativo, el lanzamiento es en sentido antihorario.
2. La frase deshacer *m*, que indica que se deben deshacer los últimos lanzamientos de *m*. Tenga en cuenta que los comandos de deshacer nunca deshacen otros comandos de deshacer; simplemente deshacen los comandos descritos en el punto 1 anterior.

Por ejemplo, si hay 5 niños y el maestro dice los cuatro comandos twrow 8 -2 3 undo 2, los lanzamientos comenzarán del niño 0 al niño 3, luego del niño 1 al niño 4. Después de esto, el deshacer 2 Las instrucciones darán como resultado que el huevo sea arrojado de vuelta del niño 4 al niño 1 y luego del niño 1 al niño 3. Si Daenerys dice 0 (o *n, -n, 2n, -2n, etc.*), entonces el niño con el huevo simplemente lo lanza hacia arriba en el aire y (con cuidado) lo atrapa de nuevo.

A Daenerys le gustaría un pequeño programa que determine dónde debe terminar el huevo si sus comandos se ejecutan correctamente. No preguntes qué pasa con los niños si este no es el caso.

###Entrada
La entrada consta de dos líneas. La primera línea contiene dos números enteros positivos *n k* (1 <= *n* <= 30, 1 <= *k* <= 30) que indican el número de estudiantes y cuántos comandos lanza Daenerys, respectivamente. La siguiente línea contiene los comandos *k* throw. Cada comando es un número entero *p* (-10000 <= *p* <= 10000) que indica cuántas posiciones lanzar el huevo en el sentido de las agujas del reloj o deshacer *m (m >= 1)* que indica que los últimos lanzamientos de *m* deben ser deshecho La entrada debe leerse desde la entrada estándar.

### Salida
Muestre el número del niño con el huevo al final del juego. La salida debe escribirse en la salida estándar.

##### Muestra 1
| Input | Output |
| ----- | ------ |
| 5 4 | 3 |
| 8 -2 3 undo 2 | |

##### Muestra 2
| Input | Output |
| ----- | ------ |
| 5 10 | 2 |
|  7 -3 undo 1 4 3 -9 5 undo 2 undo 1 6|  |
