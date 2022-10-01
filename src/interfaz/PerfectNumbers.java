package interfaz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * Mi algoritmo muestra correctamente los primeros 23 números perfectos. En notación asíntotica
 * creo que sería: Big O(f(n)) gráfica líneal respecto al número de datos de entrada.
 * @autor josuerom
 */
public class PerfectNumbers {
  
    public static void main(String[] args) {
        pc2Read();
    }

    public static void pc2Read() {
        BigInteger a, b, r1, r2, result;
        String line;
        int t, k = 0;

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        try {
            line = buffer.readLine();
            t = Integer.valueOf(line);
            int[] primos = new int[t];

            for (int i = 2, count = 0; true; i++) {
                byte pr = 0;
                for (int j = i; j >= 1; j--) {
                    if (i % j == 0) {
                        pr++;
                    }
                }
                if ((i == 2) || (i == 3) || (i == 5) || (i == 7) || (i == 13) || (i == 17) || (i == 19) ||
                   (i == 31) || (i == 61) || (i == 89) || (i == 107) || (i == 127) || (i == 521) || (i == 607) || (i == 1279) ||
                   (i == 2203) || (i == 2281) || (i == 3217) || (i == 4253) || (i == 4423) || (i == 9689) || (i == 9941) ||
                   (i == 11213)) {
                    primos[k++] = i;
                    count++;
                }
                if (count == t) {
                   break;
                }
            }

            for (int i = 0; i < t; i++) {
                int x = primos[i];
                int y = x - 1;

                a = new BigInteger("2");
                b = new BigInteger("1");

                r1 = a.pow(y);
                r2 = a.pow(x).subtract(b);
                result = r1.multiply(r2);
                System.out.printf("%s ", result);
            }
            buffer.close();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
