# Traducción - C. Sistema de registro - CodeForces

### Requisitos
- Límite de tiempo por prueba: 5 segundos
- Límite de memoria por prueba: 64 Mb
- Input: Entrada estándar
- Output: Salida estándar

### Enunciado
Próximamente se abrirá un nuevo servicio de correo electrónico "Berlandesk" en Berland. La administración del sitio quiere lanzar su proyecto lo antes posible, por eso te piden ayuda. Se le sugiere implementar el prototipo del sistema de registro del sitio. El sistema debe funcionar según el siguiente principio.

Cada vez que un nuevo usuario quiere registrarse, envía al sistema una solicitud con su nombre. Si dicho nombre no existe en la base de datos del sistema, se inserta en la base de datos y el usuario obtiene la respuesta OK, lo que confirma el registro exitoso. Si el nombre ya existe en la base de datos del sistema, el sistema crea un nuevo nombre de usuario, se lo envía al usuario como una solicitud y también inserta la solicitud en la base de datos. El nuevo nombre está formado por la siguiente regla. Los números, comenzando con 1, se agregan uno tras otro al nombre (nombre1, nombre2, ...), entre estos números se encuentra el menos i, por lo que nombrei aún no existe en la base de datos.

### Entrada
The first line contains number n (1 ≤ n ≤ 10^5). The following n lines contain the requests to the system. Each request is a non-empty line, and consists of not more than 32 characters, which are all lowercase Latin letters.

### Salida
Print n lines, which are system responses to the requests: **OK** in case of successful registration, or a prompt with a new name, if the requested name is already taken.

### Muestra
| Input |
| ----- |
| 4 |
| abacaba |
| acaba |
| abacaba |
| acab |
| Output |
| OK |
| OK |
| abacaba1 |
| OK |

| Input |
| ----- |
| 6 |
| first |
| first |
| second |
| second |
| third |
| third |
| Output |
| OK |
| first1 |
| OK |
| second1 |
| OK |
| third1 |