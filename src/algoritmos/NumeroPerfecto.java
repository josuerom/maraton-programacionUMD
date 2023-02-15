/**
 *  author  josuerom
 *  created 14/02/23 09:11
**/
import java.math.BigInteger;
import java.util.Scanner;

public class NumeroPerfecto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aux = 0, amount = 0;
        int n = sc.nextInt();
        int[] primos = new int[n];

        // Generación de números primos
        for (int i = 2, l = 0; amount != n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i%j==0) aux++;
            }
            if (aux == 2) {
                primos[l++] = i; amount++;
            }
            aux = 0;
        }

        //Creación de objetos para almacenar grandes enteros
        BigInteger a = new BigInteger("2");
        BigInteger answer;
        for (int k = 0; k < primos.length; k++) {
            // Formula: 2^n-1 * (2^n - 1)
            answer = a.pow(primos[k]-1).multiply(a.pow(primos[k]).subtract(new BigInteger("1")));
            System.out.println(answer);
        }
    }
}