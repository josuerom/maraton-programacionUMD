package interfaz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * la complejidad del algoritmo en Notación Asítotica Big O es de O(n^2) ya que entre mayor sea el
 *  número de datos de entrada mayor será el tiempo que le tomará entregar la salida.
 * @autor josuerom @fecha 01/10/22
 */
public class PerfectNumbers {

    public static void main(String[] args) {
        pc2Read();
    }

    public static void pc2Read() {
        String line;
        int t, k = 0;
        BigInteger a = new BigInteger("2");
        BigInteger b = new BigInteger("1");
        BigInteger result;

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        try {
            line = buffer.readLine();
            buffer.close();
            t = Integer.valueOf(line);
            int[] primos = new int[t];

            for (int i = 2, count = 0; true; i++) {
                byte pr = 0;
                for (int j = i; j >= 1; j--) {
                    if (i % j == 0) {
                        pr++;
                    }
                }

                if (pr == 2) {
                    if ((i == 2) || (i == 3) || (i == 5) || (i == 7) || (i == 13) || (i == 17) || (i == 19) ||
                    (i == 31) || (i == 61) || (i == 89) || (i == 107) || (i == 127) || (i == 521) || (i == 607) || (i == 1279) ||
                    (i == 2203) || (i == 2281) || (i == 3217) || (i == 4253) || (i == 4423) || (i == 9689) || (i == 9941) ||
                    (i == 11213) || (i == 19937) || (i == 21701) || (i == 23209) || (i == 44497) || (i == 86243) || (i == 110503) ||
                    (i == 132049)) {
                        primos[k++] = i;
                        count++;
                    }
                }
                if (count == t) { break; }
            }

            for (int i = 0; i < t; i++) {
                int x = primos[i];
                int y = x - 1;
                result = a.pow(y).multiply(a.pow(x).subtract(b));
                String digitos = String.valueOf(result);
                System.out.printf("%d -> %s (%d)\n", (i+1), result, digitos.length());
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
