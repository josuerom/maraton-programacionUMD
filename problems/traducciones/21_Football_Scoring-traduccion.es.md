# Traducción - 21. Puntuación de Fútbol.pdf

### Requisitos
- Nombre del archivo origen: Game.c, Game.cpp, Game.java, Game.py
- Entrada: Entrada estándar
- Salida: Salida estándar
- Autor(es): Banco de Problemas RPC - Reto Externo Adaptado

<div align="center"><img src="https://github.com/josuerom/maraton-programacionUMD/blob/main/img/21_Game.png"></div>

### Enunciado
Hay cinco formas de sumar puntos en el fútbol americano profesional:

1. Touchdown - 6 puntos
2. Gol de campo - 3 puntos
3. Seguridad - 2 puntos
4. Después del aterrizaje
    (a) 1 punto (Gol de campo o Safety) - Típicamente llamado "Punto después"
    (b) 2 puntos (Touchdown): normalmente se denomina "conversión de dos puntos"

(https://operations.nfl.com/the-rules/nfl-video-rulebook/scoring-plays/)
Dados los valores de puntuación de cuadro para dos equipos que compiten, calcule el total de puntos para cada equipo.

### Entrada
Hay dos líneas de entrada, cada una de las cuales contiene cinco números enteros no negativos separados por espacios, T, F, S, P y C que representan la cantidad de Touchdowns, Field Goals, Safeties, Points-after-touchdown y Conversiones de dos puntos después del touchdown, respectivamente. . (0 ≤ T ≤ 10), (0 ≤ F ≤ 10), (0 ≤ S ≤ 10), (0 ≤ (P +C) ≤ T). La primera línea representa el cuadro de puntuación del equipo visitante y la segunda línea representa el cuadro de puntuación del equipo local.

### Salida
La línea de salida única consta de dos números enteros separados por espacios que muestran el puntaje de los visitantes y el puntaje de los locales, respectivamente.

#### Muestra 1
| Input | Output |
| ----- | ------ |
| 1 3 0 0 1 | 17 26 |
| 3 1 1 1 1 |  |