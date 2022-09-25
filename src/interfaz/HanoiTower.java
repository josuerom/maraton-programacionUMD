package interfaz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HanoiTower {
    public static void main(String[] args) {
        pc2Read();
    }

    public static void process(byte n) {
        short result = (n % 2 == 0) ? (short) ((n * n) / 2 + (n - 1)) : (short) ((n * n) / 2 + n);
        System.out.println(result);
    }

    public static void pc2Read() {
        String line;
        byte t, n;

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        try {
            line = buffer.readLine();
            t = Byte.valueOf(line);

            while (t-- >= 1) {
                line = buffer.readLine();
                n = Byte.valueOf(line);
                process(n);
            }
            buffer.close();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}