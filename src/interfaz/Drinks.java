package interfaz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Drinks {

    public static void main(String[] args) {
        pc2Read();
    }

    public static void process(int n, String[] vec) {
        double result = 0;

        for (String s : vec) {
            double p = Double.parseDouble(s);
            result += (p != 0) ? (p / n) : 0;
        }
        System.out.printf("%,.12f", result);
    }

    public static void pc2Read() {
        String vec[], line;
        int n;

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        try {
            line = buffer.readLine();
            n = Integer.parseInt(line);

            line = buffer.readLine();
            buffer.close();
            vec = line.split(" ");
            process(n, vec);
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
