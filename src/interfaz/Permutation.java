package interfaz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Permutation {

    public static void main(String[] args) {
        pc2Read();
    }

    public static void process(String wd1[], String wd2[]) {
        String permutation = "", order_str = "";

        one : for (int k = 0; k < wd1.length; k++) {
            two: for (int n = 0; n < wd2.length; n++) {
                if (!wd1[k].equals(" ") && (wd1[k].equals(wd2[n]))) {
                    permutation += wd2[n];
                    break two;
                }
            }
        }
        char[] array = permutation.toCharArray();
        Arrays.sort(array);

        for (char c : array) {
            order_str += c;
        }

        permutation = String.valueOf(array[0]);
        for (int i = 1, aux = 0; i < array.length; i++) {
            if (array[i] != permutation.charAt(aux)) {
                permutation += String.valueOf(array[i]);
                aux++;
            }
        }
        System.out.println(permutation);
    }

    public static void pc2Read() {
        String word_one[], word_two[], a, b;

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        try {
            while ((a = buffer.readLine()).length() > 0) {
                b = buffer.readLine();
                word_one = a.split("");
                word_two = b.split("");
                process(word_one, word_two);
            }
            buffer.close();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
