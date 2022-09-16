# Traducción - 14. Pregunta de ingestión.pdf

### Requisitos###

Stan Ford es un estudiante universitario típico, lo que significa que una de las cosas más importantes en su mente es dónde será su próxima comida. La fortuna le sonrió cuando lo invitaron a una barbacoa de varios platos organizada por algunos de los patrocinadores corporativos de su equipo de investigación, donde cada plato dura exactamente una hora. Stan es un poco analítico y ha determinado que su patrón de alimentación durante un conjunto de horas consecutivas siempre es muy consistente. En la primera hora, puede ingerir hasta *m* calorías (donde *m* depende de factores como el estrés, los biorritmos, la posición de los planetas, etc.) pero esa cantidad se reduce en un factor de dos tercios. cada hora consecutiva después (siempre truncando en casos de fracciones de caloría). Sin embargo, si deja de comer durante una hora, la hora siguiente puede comer al mismo ritmo que antes de dejar de comer. Entonces, por ejemplo, si *m* = 900 y comió durante cinco horas consecutivas, lo máximo que pudo comer en la tercera hora, entonces podría comer 900, 600, 0, 600 y 400 calorías en cada una de esas horas. Además, si Stan puede abstenerse de comer durante dos horas, entonces la hora siguiente es capaz de comer *m* calorías nuevamente. En el ejemplo anterior, si Stan no comió durante la tercera y cuarta hora, podría consumir 900, 600, 0, 0 y 900 calorías.



Stan está esperando escuchar lo que se cortará cada hora de la barbacoa cuando se da cuenta de que el menú determinará cuándo y con qué frecuencia debe abstenerse de comer. Por ejemplo, si la barbacoa dura 5 horas y los platos servidos cada hora tienen 800, 700,400, 300, 200 calorías, entonces la mejor estrategia cuando *m* = 900 es comer cada hora para un consumo total de 800 + 600 + 400 + 266 + 177 = 2243 calorías. Sin embargo, si el tercer plato se reduce de 400 calorías a 40 calorías (algún plato de apio bajo en calorías), entonces la mejor estrategia es no comer durante la tercera hora, lo que da como resultado un consumo total de 1900 calorías.

La perspectiva de toda esta próxima comida tiene a Stan tan agotado que no puede pensar con claridad. Dada la cantidad de platos y la cantidad de calorías de cada plato, ¿puedes determinar la cantidad máxima de calorías que Stan puede comer?

### Entrada

La entrada comienza con una línea que contiene dos números enteros positivos *n m* (*n* <= 100, *m* <= 20000) que indican la cantidad de platos y la cantidad de calorías que Stan puede comer en la primera hora, respectivamente. La siguiente línea contiene *n* números enteros positivos que indican la cantidad de calorías para cada plato.

### Salida

Muestra el número máximo de calorías que Stan puede consumir.

#### Muestra 1

| Input               | Output |
| ------------------- | ------ |
| 5 900               | 2243   |
| 800 700 400 300 200 |        |

#### Muestra 2

| Input              | Output |
| ------------------ | ------ |
| 5 900              | 1900   |
| 800 700 40 300 200 |        |

