# Traducción - 4. Cambiando cadenas.pdf

### Requisitos
- Nombre del archivo fuente: Changingstr.c, Changingstr.cpp, Changingstr.java, Changingstr.py
- Límite de tiempo de ejecución 2000 ms (milisegundos)
- Límite de memoria 246144 kB (kilobytes)

### Enunciado
¡Amamos a nuestra UCF (Universidad de Florida Central) y vamos a cambiar todo a UCF! Dada una cadena, cambie la cadena a UCF de la siguiente manera:

- Los caracteres antes de la "U" más a la izquierda en la cadena se cambian por un guión "-".
- Los caracteres antes de la "F" más a la derecha en la cadena se cambian a guión.
- Los caracteres antes de la U más a la izquierda y la F más a la derecha se cambian a "C".

Suponga que la cadena contendrá al menos una "U", al menos una "F" después de esa U y al menos un carácter entre la U y la F.

### Entrada
Solo hay línea de entrada; contiene una cadena de letras mayúsculas. La cadena tendrá como mínimo 3 y como máximo 50 caracteres.

### Salida
Imprime la cadena de entrada convertida a UCF.

#### Muestra 1
| Input                  | Output            |
| ---------------------- | ----------------- |
| ABUDEGHFXYZ            | --UCCCCF---       |
| CCUZF                  | --UCF             |
| ABFABCUABABFABUABFABUAB| ------UCCCCCCCCCCF-----|
| UABCFABCDE             | UCCCF-----             |
