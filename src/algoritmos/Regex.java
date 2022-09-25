package algoritmos;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author josuerom
 */
public class Regex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String evaluar = "josue.romero@uniminuto.edu.co";
        String regex;

        while (true) {
            regex = sc.nextLine();
            if (regex.equals("exit"))
                break;
            Pattern patron = Pattern.compile(regex);
            Matcher mach = patron.matcher(evaluar);
            boolean coincidencia = mach.find();
            System.out.println("Existe alguna coincidencia? " + coincidencia);
        }
    }
}

/*
* Patrones REGEX para memorizar
* () --> Los parentesis redondos ayuda a encerrar lo que se desea buscar en una iteración.
* [] --> Dentro del parentesis cuadrado se pasa un patron
* {} --> Dentro de las llaves sólo se coloca el número de veces que debe encontrar esa secuencia y siempre se coloca despues de los parentesis cuadrados []
* ? --> Indica que despues lo que está antes es opcional
- * --> Significa que pueden haber cero o varios


1. [abch][^s]ola ==> Si la cadena contiene algun carácter como la (a,b,c o h) y sean distinto de s, y lo que continue al
    haber hallado coincidencia sea un (ola), retornará true.
2. ^ ==> indica el incio del patron
3. $ ==> indica el fin del patron
4. ([A-Z]{1}[a-z]+) ==> indica que sólo debe encontrar una letra en mayúscula, y luego debe haber una o más letras minúsculas
5.
6.
7.
8.
[a-zA-Z0-9-_-]+@[a-zA-Z0-9._-]+\.[a-zA-Z] --> Encuentra el correo electronico

*/