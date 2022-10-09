# Traducción - 30. II Derby della Madonnina.pdf

### Requisitos
- Nombre del archivo origen: Derby.c, Derby.cpp, Derby.java, Derby.py
- Entrada: Estándar
- Salida: Estándar

### Enunciado
El derbi entre Milán e Inter se está celebrando pronto y usted ha sido elegido árbitro asistente del partido, también conocido como juez de línea. Tu tarea es moverte a lo largo de la línea de banda, es decir, el lado del campo, siempre mirando con mucho cuidado el partido para comprobar si hay posiciones de fuera de juego y otras infracciones.

El fútbol es un asunto extremadamente serio en Italia, por lo que es fundamental que estés muy cerca del balón durante el mayor tiempo posible. Esto significa que desea maximizar la cantidad de patadas que supervisa de cerca. Puede monitorear de cerca una patada si, cuando ocurre, se encuentra en la posición a lo largo de la línea de banda con una distancia mínima del lugar donde ocurre la patada.

Afortunadamente, los analistas expertos han podido predecir con precisión todos los tiros que ocurrirán durante el juego. Es decir, le han dado dos listas de números enteros, t1, t2, . . ., tn y a1, a2, . . ., an, indicando que ti segundos después del comienzo del partido se pateará el balón y usted podrá seguir de cerca dicho patada si se encuentra en la posición ai a lo largo de la línea de banda.

Al comienzo del juego, comienza en la posición 0 y la velocidad máxima a la que puede caminar a lo largo de la línea de touch es v unidades por segundo (es decir, puede cambiar su posición como máximo v cada segundo). ¿Cuál es el número máximo de patadas que puedes monitorear de cerca?

### Entrada
La primera línea contiene dos números enteros n y v (1 ≤ n ≤ 2 · 10^5, 1 ≤ v ≤ 10^6): el número de patadas que se realizarán y tu velocidad máxima.

La segunda línea contiene n enteros t1, t2, ....., tn (1 ≤ ti ≤ 10^9) – los tiempos de los tiros en el partido. Se garantiza que la secuencia de tiempos sea estrictamente creciente, es decir, t1 < t2 < · · · < tn.

La tercera línea contiene n enteros a1, a2, ....., an (−10^9 ≤ ai ≤ 10^9) – las posiciones a lo largo de la línea de banda donde tienes que estar para monitorear de cerca cada patada.

### Salida
Imprime el número máximo de patadas que puedes monitorear de cerca.

#### Muestra 1
| Input | Output |
| ----- | ------ |
| 3 2 | 2 |
| 5 10 15 |  |
| 7 17 29 |  |

#### Muestra 2
| Input | Output |
| ----- | ------ |
| 5 1 | 3 |
| 5 7 8 11 13 |  |
| 3 3 -2 -2 4 |  |

#### Muestra 3
| Input | Output |
| ----- | ------ |
| 1 2 | 0 |
| 3 |  |
| 7 |  |

### Explicación
#### Explicación del ejemplo 1
Es posible moverse hacia la derecha a máxima velocidad durante los primeros 3,5 segundos y permanecer en la posición 7 hasta que suceda la primera patada, y luego moverse inmediatamente a la derecha también a máxima velocidad para ver la segunda patada en la posición 17. No hay forma de Vigile de cerca la tercera patada después de la segunda patada, de modo que como máximo se puedan ver 2 patadas.