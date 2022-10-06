package interfaz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Itsamod {

    public static void main(String[] args) {
        pc2Read();
    }

    public static void process(int p, int q, int n) {
        int[] arr = new int[2];
        for (int i = 1; i <= n; i++) {
            arr[0] = (p*i);
            arr[1] += (arr[0] % q);
        }
        System.out.println(arr[1]);
    }

    public static void pc2Read() {
        String vec[], line = "";
        int p = 0, q = 0, n = 0;
        int test = 0;

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        try {
            line = buffer.readLine();
            test = Integer.valueOf(line);
            vec = new String[3];

            while (test-- >= 1) {
                line = buffer.readLine();
                vec = line.split(" ");

                p = Integer.valueOf(vec[0]);
                q = Integer.valueOf(vec[1]);
                n = Integer.valueOf(vec[2]);
                process(p, q, n);
            }
            buffer.close();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
