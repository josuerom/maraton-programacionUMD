# Traducción - 17. Entrenamiento para una mancuerna.pdf

### Requisitos

- Nombre del archivo origen: Workout.c, Workout.cpp, Workout.java, Workout.py
- Tiempo límite: 2000 ms
- Memoria límite: 256144 kB

### Enunciado

Jim Ratt acaba de unirse a un gimnasio local. está especialmente entusiasmado con una secuencia de 10 máquinas que recorre tres veces para su entrenamiento. Tiene un tiempo fijo que pasa en cada máquina, así como un tiempo fijo de recuperación después de usar una máquina. Jim no es el tipo más inteligente del mundo, pero en ausencia de cualquier otra cosa, incluso él sería capaz de calcular fácilmente cuánto tiempo le tomaría su entrenamiento.



Pero, por supuesto, Jim no es la única persona que usa el gimnasio y no lo sabrías, pero cuando Jim aparece, siempre hay otras 10 personas allí, cada una usando una de las diez máquinas exclusivamente. Al igual que Jim, cada peson tiene un tiempo fijo que usan en su máquina, así como un tiempo de recuperación fijo. Esto a veces hará que Jim tenga que esperar por una máquina en particular, y el uso de Jim a veces hace que otras personas también tengan que esperar (aunque si tanto Jim como otra persona quieren comenzar a usar una máquina al mismo tiempo, Jim es cortés suficiente para dejar que la otra persona vaya primero). Jim ha ido al centro con tanta frecuencia que tiene una buena idea de cuál es el uso y los tiempos de recuperación de todos, pero tiene problemas para determinar cuánto tiempo le llevará realizar su entrenamiento. Ahí es donde vas a flexionar tus músculos de programación.

### Entrada

La entrada comienza con una línea que contiene veinte enteros; los dos primeros dan el tiempo de uso y recuperación de Jim para la máquina 1, los dos siguientes dan el tiempo de uso y recuperación de Jim para la máquina 2, etc. La siguiente línea contiene 3 enteros *u r t*; los dos primeros valores son los tiempos de uso y recuperación de la persona que está usando la máquina 1, y *t* es el tiempo en el que comienza a usar la máquina por primera vez. Las siguientes 9 líneas especifican información similar para las máquinas 2 a 10. Todos los tiempos de uso y recuperación son positivos y <= 5000000 y todos los tiempos de inicio *t* satisfacen |*t*| <= 5000000. Debe suponer que Jim está listo para usar la máquina 1 en el momento 0.

### Salida

Muestra la hora en que Jim ha terminado su entrenamiento, es decir, el momento en que ha terminado su tiempo de uso en la máquina 10 por tercera vez (no cuente el último tiempo de recuperación de esa máquina).

#### Muestra 1

| Input                                   | Output |
| --------------------------------------- | ------ |
| 5 5 3 3 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 | 100    |
| 2 2 1                                   |        |
| 8 3 0                                   |        |
| 1 1 0                                   |        |
| 1 1 0                                   |        |
| 1 1 0                                   |        |
| 1 1 0                                   |        |
| 1 1 0                                   |        |
| 1 1 0                                   |        |
| 1 1 0                                   |        |
| 1 1 0                                   |        |

