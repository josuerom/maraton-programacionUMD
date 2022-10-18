package interfaz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HanoiTower {

    public static void main(String[] args) {
        pc2Read();
    }

    public static void lastBall(byte n) {
        long result = (n % 2 == 0) ? (long) ((n * n) / 2 + (n - 1)) : (long) ((n * n) / 2 + n);
        System.out.println((result > 2.147.483.647) ? "-41" : result);
    }

    public static void pc2Read() {
        String line;
        int t, n;

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        try {
            line = buffer.readLine();
            t = Integer.valueOf(line);

            while (t-- >= 1) {
                line = buffer.readLine();
                n = Integer.valueOf(line);
                lastBall(n);
            }
            buffer.close();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
