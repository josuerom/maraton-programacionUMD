# Traducción - 4. Cambiando cadenas.pdf

### Requisitos
- Nombre del archivo fuente: Changingstr.c, Changingstr.cpp, Changingstr.java, Changingstr.py
- Límite de tiempo de ejecución 2000 ms (milisegundos)
- Límite de memoria 246144 kB (kilobytes)

### Enunciado
¡Amamos a nuestra UCF (Universidad de Florida Central) y vamos a cambiar todo a UCF! Dada una cadena, cambie la cadena a UCF de la siguiente manera:

- Los carácteres antes de la "U" más a la izquierda en la cadena se cambian por un guión "-".
- Los carácteres después de la "F" más a la derecha en la cadena se cambian por un guión "-".
- Los carácteres en medio de la "U" y "F" se cambian a una "C".

Suponga que la cadena contendrá al menos una U, al menos una F, debe de ir al menos un carácter entre las "U" y las "F".

### Entrada
Solo hay una línea de entrada; que contiene una cadena de letras mayúsculas. La cadena tendrá como mínimo 3 a 30 carácteres máximos.

### Salida
Imprime la cadena de entrada convertida a UCF.

#### Muestra 1
| Input                  | Output            |
| ---------------------- | ----------------- |
| ABUDEGHFXYZ            | --UCCCCF---       |
| CCUZF                  | --UCF             |
| ABFABCUABABFABUABFABUAB| ------UCCCCCCCCCCF-----|
| UABCFABCDE             | UCCCF-----             |
