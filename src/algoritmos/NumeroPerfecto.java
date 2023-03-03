/**
 *  author  josuerom
 *  created 17/02/23 16:24
**/

/*
// LA PEOR SOLUCIÓN
import java.util.Scanner;

public class NumeroPerfecto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long amount = 0, n = sc.nextInt();

        for (long i = 6; amount != n; i+=2) {
            long aux = 0;
            for (long j = 1; j < i; j++) {
                if (i%j == 0) aux += j;
            }
            if (aux == i) {
                System.out.println(i);
                ++amount;
            }
        }
    }
}
*/

// UNA SOLUCIÓN MÁS ÓPTIMA
import java.math.BigInteger;
import java.util.Scanner;

public class NumeroPerfecto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Creación de arreglo con 51 números primos
        int[] primos = {2,3,5,7,13,17,19,31,61,89,107,127,521,607,1279,2203,2281,
        3217,4253,4423,9689,9941,11213,19937,21701,23209,44497,86243,110503,132049,
        216091,756839,859433,1257787,1398269,2976221,3021377,6972593,13466917,20996011,24036583,
        25964951,30402457,32852657,37156667,42643801,43112609,57885161,74207281,77232917,82589933};

        // Creación de objetos tipo BigInteger para almacenar enteros muy grandes
        BigInteger a = new BigInteger("2");

        /* Para que el programa sea compelijidad eficiente O(n) tuve que implementar la fórmula de Euclides.
           que es: 2^n-1 * (2^n - 1); de donde n es un número primo que se encuentra en el arreglo
           Y el próximo bucle for le imprime los resultados al usuario.
        */
        for (int k = 0; k < n; k++) {
            System.out.println(a.pow(primos[k]-1).multiply(a.pow(primos[k]).subtract(new BigInteger("1"))));
        }
        // Éste programa solo muestra los primeros 51 números perfectos nada más.
    }
}
