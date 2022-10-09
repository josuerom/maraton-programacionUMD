# Traducción - 20. Palindromos en código morse.pdf

### Requisitos
- Nombre del archivo origen: Palindromes.c, Palindromes.cpp, Palindromes.java, Palindromes.py
- Entrada: Entrada estándar
- Salida: Salida estándar
- Autor(es): Banco de Problemas RPC - Reto Externo Adaptado

### Enunciado
Un palíndromo es una palabra, número, frase u otra secuencia de caracteres que se lee igual hacia atrás que hacia adelante, como *madam o racecar o 1881*. Los palíndromos de fase ignoran las mayúsculas, la puntuación y los límites de las palabras. Por ejemplo:

*Madam I´m Adam*

El código Morse es un método utilizado en telecomunicaciones para codificar caracteres de texto como secuencias estandarizadas de dos duraciones de señal diferentes, llamadas puntos y rayas, o puntos y rayas. El código Morse lleva el nombre de Samuel Morse, uno de los inventores del telégrafo. El código morse internacional para letras y dígitos es (Tenga en cuenta que el código para letras mayúsculas y minúsculas es el mismo).

<div align="center"><img src="https://github.com/josuerom/maraton-programacionUMD/blob/main/img/20_Morse_Code1.png"></div>

Una palabra, número o frase es un **palíndromo en código Morse** si el código Morse para la letra y los dígitos de la palabra, número o frase se lee igual hacia adelante o hacia atrás (ignore los espacios entre los códigos de caracteres). Por ejemplo:

<div align="center"><img src="https://github.com/josuerom/maraton-programacionUMD/blob/main/img/20_Morse_Code2.png"></div>

Escriba un programa que tome como entrada una cadena y determine si la cadena es un *palíndromo en código Morse*.

### Entrada
La única línea de entrada contiene una cadena de hasta 80 caracteres, que posiblemente incluya espacios y otros caracteres imprimibles no alfanuméricos.

### Salida
La única línea de salida consta de la cadena YES si la cadena de entrada (ignorando todo excepto las letras y los dígitos) es un palíndromo en código Morse. De lo contrario, la línea de salida consta de la cadena NO. Si no hay letras o dígitos en la cadena de entrada, la salida debe ser NO.

#### Muestra 1
| Input | Output |
| ----- | ------ |
| hello | NO |
| 159 | YES |
| Madam I'm Adam | NO |
| footstool | YES |
| SOS | YES |