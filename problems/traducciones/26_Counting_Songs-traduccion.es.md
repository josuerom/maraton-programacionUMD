# Traducción - 26. Contando Canciones.pdf

### Requisitos
- Nombre del archivo origen: Counting.c, Counting.cpp, Counting.java, Counting.py
- Entrada: Entrada estándar
- Salida: Salida estándar
- Autor(es): José Manuel Salazar Meza - UFPS (Graduado)

<div align="center"><img src="https://github.com/josuerom/maraton-programacionUMD/blob/main/img/26_Counting1.png"></div>

### Enunciado
Milton likes music, especially Silvio Rodriguez’s music (Milton knows all his songs by heart). Silvio Rodriguez is a Cuban singer-songwriter, guitarist and poet who has composed more than 500 songs throughout his artistic career. Impressed by that, Milton wondered how many different songs Silvio Rodriguez will ever compose and your job is to help him find out.

First, Milton looked up the following definitions in his old music book:
-  The music is subdivided into consecutive measures: measure 1, measure 2, measure 3, etc.
-  A measure of 4/4 has 4 beats available in it.
-  Musical notes have a value that indicates the fraction of time they occupy within a measure. For example, in the image below we see that the value of a quarter note is 1/4, so we can fill a measure of 4/4 using 4 quarter notes, which total 4 beats.
-  The rest symbols indicate that nothing should sound during the fraction of time indicated by their value.
-  Adding a dot to a note or rest increases its value by 50%.
-  Adding a tie between 2 or more consecutive notes (not rests) makes the notes join with a duration equal to the sum of their values.

<div align="center"><img src="https://github.com/josuerom/maraton-programacionUMD/blob/main/img/26_Counting2.png"></div>

After reading his old music book, Milton wants to know how many different songs of n measures of 4/4 can be created? taking into account the following conditions:
- Any of the notes or rests in the image above can be used.
- Dots can be added to any note or rest except 64th notes.
- Ties can be added between notes, even from different measures.
- Only the rhythm (length of notes and rests) matters, not the sound of the note. That is, it does not matter if it is a C, D, E, F, etc.
- Two songs are different if there is an i such that the i-th measure of a song is different from the i-th measure of the other.
- Two measures are different if the rhythm of a measure is different from the other.

### Entrada
The input consists of a single line with an integer n (1 ≤ n < 2^31) indicating the number of measures.

### Salida
The output consists of a single line with an integer indicating the answer to the problem modulo 1000000007 (10^9 + 7).

#### Muestra 1
| Input | Output |
| ----- | ------ |
| 1 | 461493940 |
| 2 | 361271126 |
| 3 | 999820470 |
| 2022 | 879184852 |

**Nota:**

<div align="center"><img src="https://github.com/josuerom/maraton-programacionUMD/blob/main/img/26_Counting3.png"></div>

3 examples for n = 2. Songs A and B are the same, but songs A and C are different because the 2th measure has a different rhythm.