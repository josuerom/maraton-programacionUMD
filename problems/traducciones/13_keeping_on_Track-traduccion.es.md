# Traducción - 13. Mantener en la pista.pdf

### Requisitos

- Nombre del archivo origen: OnTrack.c, OnTrack.cpp, OnTrack.java, OnTrack.py
- Tiempo límite: 2000 ms
- Memoria límite: 356144 kB

### Enunciado

¡Acmar e Ibmar están en guerra! Estás a cargo de una red ferroviaria que transporta suministros importantes por todo el gran estado de Acmar durante este momento delicado. El sistema ferroviario está formado por un conjunto de vías férreas que se encuentran en varios puntos de unión. Si bien no hay límite para la cantidad de líneas de ferrocarril que pueden encontrarse en un cruce, la red está configurada de modo que solo haya una ruta entre dos cruces. Ha intentado argumentar a favor de cierta redundancia en el sistema, es decir, líneas ferroviarias adicionales para que haya dos o más caminos que conecten algunos cruces, pero estamos en tiempos de guerra y los presupuestos son ajustados.



Sin embargo, esto puede cambiar pronto, ya que acaba de recibir una terrible noticia de los agentes dobles que trabajan en Ibmar: ¡dentro del próximo mes, los espías enemigos planean volar uno de los cruces! Desafortunadamente, no se conoce el cruce exacto, pero conociendo bien a tu enemigo, estás seguro de que indudablemente golpeará el cruce crítico, específicamente el cruce cuya eliminación desconecta la mayoría de los pares de otros cruces restantes en el sistema. No tiene mucho tiempo para actuar, por lo que lo máximo que puede hacer es agregar una nueva línea que conecte dos cruces actualmente no conectados, reduciendo así la cantidad de pares desconectados después de que se haya destruido el cruce crítico. Su trabajo es determinar cómo hacer que el número de pares desconectados sea lo más pequeño posible agregando la mejor línea ferroviaria posible.

### Entrada

La entrada comienza con una línea que contiene un número entero *n* (2 <= *n* <= 10000) que indica el número de líneas ferroviarias en el sistema. A continuación hay *n* líneas de la forma i1 i2 que indican que una línea de ferrocarril conecta los cruces i1 e i2. Los cruces se numeran consecutivamente a partir de 0. Todas las líneas ferroviarias son de dos sentidos y ninguna línea ferroviaria aparece más de una vez en la entrada. Hay exactamente una ruta entre dos puntos de unión dados en la entrada.

### Salida

Muestra dos valores *n1* y *n2*, donde *n1* es el número de pares de cruces que se desconectarán cuando el enemigo destruya el cruce crítico, y *n2* es el número de pares de cruces aún desconectados después de agregar en la línea ferroviaria bert posible. Nunca habrá más de un cruce crítico.


#### Muestra 1

| Input | Output |
| ----- | ------ |
| 6     | 11 5   |
| 0 1   |        |
| 1 2   |        |
| 2 3   |        |
| 2 4   |        |
| 4 5   |        |
| 4 6   |        |

#### Muestra 2

| Input | Output |
| ----- | ------ |
| 2     | 1 0    |
| 2 1   |        |
| 0 1   |        |

