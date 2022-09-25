package interfaz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author josuerom
 */
public class Heavy {
    public static void main(String[] args) {
        pc2Read();
    }

    public static void convert(String[] arr) {
        int sumaA = 0, sumaB = 0;
        String a[], b[];

        a = arr[0].split("");
        b = arr[1].split("");

        for (int i = 0; i < a.length; i++) {
            sumaA += Integer.valueOf(a[i]);
            if (i == 0) {
                for (int j = 0; j < b.length; j++) {
                    sumaB += Integer.valueOf(b[j]);
                }
            }
        }
        process(sumaA, sumaB, a.length, b.length);
    }
    public static void process(int sumaA, int sumaB, int digitsA, int digitsB) {
        int weightA = digitsA * sumaA;
        int weightB = digitsB * sumaB;

        if (weightA > weightB) {
            System.out.println("1");
        } else if (weightA < weightB) {
            System.out.println("2");
        } else if (weightA == weightB) {
            System.out.println("0");
        }
    }

    public static void pc2Read() {
        String arr[], aux[], line = "";
        int addA = 0, addB = 0;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        try {
            line = buffer.readLine();
            arr = line.split(" ");

            buffer.close();
            convert(arr);
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}