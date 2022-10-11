# Traducción - B. Palabras demasiado largas - Tomado de CodeForces

### Requisitos
- Límite de tiempo por prueba: 1 segundo
- Límite de memoria por prueba: 256 Mb
- Input: Entrada estándar
- Output: Salida estándar

### Enunciado
A veces, algunas palabras como "localización" o "internacionalización" son tan largas que escribirlas muchas veces en un mismo texto es bastante tedioso.

Consideremos una palabra demasiado larga, si su longitud es **estrictamente más** de 10 caracteres. Todas las palabras demasiado largas deben reemplazarse con una abreviatura especial.

Esta abreviatura se hace así: escribimos la primera y la última letra de una palabra y entre ellas escribimos el número de letras entre la primera y la última letra. Ese número está en sistema decimal y no contiene ceros a la izquierda.

Por lo tanto, "localización" se escribirá como "l10n", e "internacionalización» se escribirá como "i18n".

Se le sugiere automatizar el proceso de cambiar las palabras con abreviaturas. En ese caso, todas las palabras demasiado largas deben ser reemplazadas por la abreviatura y las palabras que no son demasiado largas no deben sufrir ningún cambio.

### Entrada
La primera línea contiene un número entero n (1 ≤ n ≤ 100). Cada una de las siguientes n líneas contiene una palabra. Todas las palabras consisten en letras latinas minúsculas y poseen longitudes de 1 a 100 caracteres.

### Salida
Imprimir n líneas. La i-ésima línea debe contener el resultado de reemplazar la i-ésima palabra de los datos de entrada.

### Muestra
| Input |
| ----- |
| 4 |
| word |
| localization |
| internationalization |
| pneumonoultramicroscopicsilicovolcanoconiosis |
| Output |
| ------ |
| word |
| l10n |
| i18n |
| p43s |