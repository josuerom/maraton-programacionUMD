# Traducción - 12. ¿Es un? ¿Tiene un? ¿Quién sabe a?.pdf

### Requisitos
- Nombre del archivo orign: Throwns.c, Throwns.cpp, Throwns.java, Throwns.py
- Tiempo limite: 2000 ms
- Memoria límite: 256144 kB

### Enunciado
Dos conceptos familiares en la programación orientada a objetos son las relaciones (is-a) y (has-a). Dadas dos clases **A** y **B**, decimos que A (is-a) B si A es una subclase de B; decimos A (has-a) B si uno de los campos de A es de tipo B. Por ejemplo, podríamos imaginar un lenguaje orientado a objetos (llamémoslo ICPC++) con código como el de la Figura 3, donde la clase ** El día es una hora**, la cita de la clase es tanto una agenda como un recordatorio, y la cita de la clase tiene un día.

Estas dos relaciones son transitivas. Por ejemplo, si A is-a B y B is-a C, se sigue que A is-a C. Esto también es válido si cambiamos todos los is-a en la última oración por has-a. También funciona con combinaciones de is-a y has-a en el ejemplo anterior, La cita tiene un año, ya que la cita es una agenda.

En este problema, habrá dado un conjunto de relaciones is-a y has-a y un conjunto de consultas de from A is/has-a B. Debe determinar si cada consulta es verdadera o falsa.

### Entrada
La entrada comienza con dos enteros *n* y *m*, (1 <= *n. m* <= 10000), donde *n* especifica el número de relaciones dadas es-a y tiene-a y *m* especifica el número de consultas. Cada una de las siguientes *n* líneas contiene una relación dada en el from C1 *r* C2 donde C1 y C2 son nombres de clase de una sola palabra, y *r* es la cadena "is-a" o "has-a". A continuación se encuentran *m* consultas, una por línea, con el mismo formato. Habrá como máximo 500 nombres de clase distintos en las líneas *n + m*, y todos los nombres de clase en las últimas líneas *m* aparecerán al menos una vez. deducida de las *n* relaciones dadas. Las relaciones es-a no pueden ser circulares (aparte de la identitu trivial *"x es-a x"*).

### Salida
Para cada consulta, muestre el número de consulta (a partir de uno) y si la consulta es verdadera o falsa.

#### Muestra 1
| Input | Output |
| ----- | ------ |
| 5 5 | Query 1: true |
| Day is-a Time | Query 2: false |
| Appointment is-a Datebook | Query 3: true |
| Appointment is-a Raminder | Query 4: true |
| Appointment has-a Day | Query 5: true |
| Datebook has-a Year |  |
| Day is-a Time |  |
| Time is-a Day |  |
| Appointment has-a Time |  |
| Appointment has-a year |  |
| Day is-a Day |  |
