package interfaz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DRMMessage {

    public static void main(String[] args) {
        pc2Read();
    }

    public static void decryptMessage(char abecedario[], int a[], int b[]) {
        String decryptedMessage = "";
        int size = b.length;
        int[] vec = new int[size];

        /* Encuentro las posiciones de las letras del mensaje cifrado dentro de las dos partes */
        for (int i = 0; i < size; i++) {
            int add = (a[i] + b[i]);

            if (add > 25) {
                vec[i] = add - 26;
            } else {
                vec[i] = add;
            }
        }

        /* Guardo e imprimo el mensaje descifrado en una variable independiente */
        for (int d = 0; d < size; d++) {
            decryptedMessage += abecedario[vec[d]];
        }
        System.out.println(decryptedMessage);
    }

    public static void process(char a[], char b[]) {
        char[] abecedario = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','V','U','W','X','Y','Z'};
        int size = a.length, sum_positions1 = 0, sum_positions2 = 0, k = 0;
        int[] smp1 = new int[size];
        int[] smp2 = new int[size];
        Arrays.sort(abecedario);

        /* Realizo una búsqueda binaria para sumar el número de la posicion donde se encuentre la letra */
        for (int i = 0, pos1 = 0, pos2 = 0; i < size; i++) {
            sum_positions1 += pos1 = Arrays.binarySearch(abecedario, a[i]);
            sum_positions2 += pos2 = Arrays.binarySearch(abecedario, b[i]);
            smp1[i] = pos1;
            smp2[i] = pos2;
        }

        /* Encuentro el carácter al rotar cada una de las letras de ambas partes */
        for (int s = 0; s < size; s++) {
            int add1 = smp1[s] + sum_positions1;
            int add2 = smp2[s] + sum_positions2;
            int result1 = add1 - 26;
            int result2 = add2 - 26;

            if (result1 > 25) {
                for (int j = 1; j <= 200; j++) {
                    if (result1 > 25) {
                        result1 -= 26;
                    } else {
                        break;
                    }
                }
            }
            if (result2 > 25) {
                for (int j = 1; j <= 200; j++) {
                    if (result2 > 25) {
                        result2 -= 26;
                    } else {
                        break;
                    }
                }
            }
            smp1[s] = result1;
            smp2[s] = result2;
        }
        decryptMessage(abecedario, smp1, smp2);
    }

    public static void pc2Read() {
        char x[], y[];
        String message, a, b;
        int m = 0;

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        try {
            message = buffer.readLine();
            buffer.close();
            m = message.length() / 2;

            a = message.substring(0, m);
            b = message.substring(m);

            x = a.toCharArray();
            y = b.toCharArray();
            process(x, y);
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}