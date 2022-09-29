# Traducción - 10. Mensajes DRM.pdf

### Requisitos
- Nombre del archivo orign: DRMMessages.c, DRMMessages.cpp, DRMMessages.java, DRMMessages.py
- Tiempo limite: 2000 ms
- Memoria límite: 256144 kB

### Encunciado
El cifrado DRM es un nuevo tipo de cifrado. Dada una cadena cifrada (que llamaremos mensaje DRM), el proceso de descifrado consta de tres pasos: dividir, rotar y fusionar. Este proceso se describe en el siguiente ejemplo con el mensaje DRM "EWPGAJRB":

**Dividir** - Puño, dividir el mensaje por la mitad en "EWPG" y "AJRB".

**Rotar** - Para cada mitad, calcule su valor de rotación sumando los valores de cada carácter (A = 0, B = 1... Z = 25). El valor de rotación de "EWGP" es 4 + 22 + 15 + 6 = 47. Rote cada carácter en "EWPG" 47 posiciones hacia adelante (cambiando de Z a A cuando sea necesario) para obtener la nueva cadena "ZRKB". Siguiendo el mismo proceso en "AJRB" da como resultado "BKSC".

**Fusionar**: el último paso es combinar estas nuevas cadenas ("ZRKB" y "BKSC") girando cada carácter de la primera cadena por el valor del carácter correspondiente de la segunda cadena. para la primera posición, rotar 'Z' por 'B' significa moverlo 1 carácter hacia adelante, lo que lo envuelve a 'A'. Continuar con este proceso para cada carácter da como resultado el mensaje final descifrado, "ABCD".

### Entrada
La entrada contiene un solo mensaje DRM para descifrar. Todos los caracteres de la cadena son letras mayúsculas y la longitud de la cadena es par y <= 15000. La entrada debe leerse desde la entrada estándar.

### Salida
Muestra el mensaje DRM decrppted. La salida debe escribirse en la salida estándar.

##### Muestra 1
| Input | Output |
| ----- | ------ |
| EWPGAJRB | ABCD |


##### Muestra 2
| Input | Output |
| ----- | ------ |
| UEQBJPJCBUDGBNKCAHXCVERXUCVK | ACMECNACONTEST |
