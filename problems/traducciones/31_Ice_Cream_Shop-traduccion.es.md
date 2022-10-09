# Traducción - 31. Heladería.pdf

### Requisitos
- Nombre del archivo origen: Cream.c, Cream.cpp, Cream.java, Cream.py
- Entrada: Estándar
- Salida: Estándar

### Enunciado
En una playa hay n cabañas en línea perfecta, la cabaña 1 está a la izquierda y la cabaña i + 1 está a 100 metros a la derecha de la cabaña i, para todo 1 ≤ i ≤ n − 1. En la cabaña i hay personas pi .

Hay m heladerías, también alineadas en perfecta línea con todas las casetas. El i-ésimo vendedor de helados tiene su tienda xi metros a la derecha de la primera barraca. Todas las heladerías están en ubicaciones distintas, pero pueden estar en el mismo lugar que una choza.

Quiere abrir una nueva heladería y se pregunta cuál es la mejor ubicación para su tienda. Puedes colocar tu heladería en cualquier lugar de la playa (no necesariamente a una distancia entera de la primera caseta) siempre que esté alineada con las casetas y las otras heladerías, incluso si ya hay otra heladería o una choza en ese lugar. Usted sabe que la gente vendría a su tienda solo si está estrictamente más cerca de su choza que cualquier otra heladería.

Si cada persona que vive en las cabañas quiere comprar exactamente un helado, ¿cuál es la cantidad máxima de helados que puede vender si coloca la tienda de manera óptima?

### Entrada
La primera línea contiene dos números enteros n y m (2 ≤ n ≤ 2 · 10^5, 1 ≤ m ≤ 2 · 10^5): el número de chozas y el número de vendedores de helados.

La segunda línea contiene n enteros p1, p2, ...., pn (1 ≤ pi ≤ 10^9) – el número de personas en cada cabaña.

La tercera línea contiene m enteros x1, x2, ...., xm (0 ≤ xi ≤ 10^9, xi != xj for i != j) – la ubicación de cada heladería.

### Salida
Imprime el número máximo de helados que se pueden vender eligiendo de forma óptima la ubicación de la nueva tienda.

#### Muestra 1
| Input | Output |
| ----- | ------ |
| 3 1 | 7 |
| 2 5 6 |  |
| 169 |  |

#### Muestra 2
| Input | Output |
| ----- | ------ |
| 4 2 | 15 |
| 1 2 7 8 |  |
| 35 157 |  |

#### Muestra 3
| Input | Output |
| ----- | ------ |
| 4 1 | 21360158 |
| 272203905 348354708 848256926 9394041 |  |
| 20 |  |

#### Muestra 4
| Input | Output |
| ----- | ------ |
| 3 2 | 2 |
| 1 1 1 |  |
| 300 99 |  |

### Explicación
#### Explicación del ejemplo 1
Puede colocar la tienda (de color naranja en la imagen de abajo) 150 metros a la derecha de la primera cabaña (por ejemplo) para que sea la tienda más cercana a las dos primeras cabañas, que tienen 2 y 5 personas, para un total de 7 helados vendidos.

<div align="center"><img src="https://github.com/josuerom/maraton-programacionUMD/blob/main/img/31_Cream1.png"></div>

#### Explicación del ejemplo 2
Puedes colocar la tienda 170 metros a la derecha de la primera barraca (por ejemplo) para que sea la tienda más cercana a las dos últimas barracas, que tienen 7 y 8 personas, para un total de 15 helados vendidos.

<div align="center"><img src="https://github.com/josuerom/maraton-programacionUMD/blob/main/img/31_Cream2.png"></div>