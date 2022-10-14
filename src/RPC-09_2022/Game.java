import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {
    public static void main(String[] args) {
        String vec[], line = "";
        byte array[] = new byte[5];
        short igualdad = 0, a = 0, b = 0;
        byte j = 0, x = 0;

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        try {
            while (j < 2) {
                line = buffer.readLine();
                vec = line.split(" ");

                for (byte i = 0; i < 5; i++) {
                    array[i] = Byte.valueOf(vec[i]);
                }

                byte T = array[0], F = array[1], S = array[2], P = array[3], C = array[4], add = (byte) (P + C);

                if ((T >= 0 && T <= 10) && (F >= 0 && F <= 10) && (S >= 0 && S <= 10) && (C >= 0 && add <= T)) {
                    array[0] = (byte) (T * 6);
                    array[1] = (byte) (F * 3);
                    array[2] = (byte) (S * 2);
                    array[3] = (byte) (P * 1);
                    array[4] = (byte) (C * 2);
                    igualdad = 0;

                    for (byte i = 0; i < 5; i++) {
                        igualdad += array[i];
                    }
                    if (j == 0)
                        a = igualdad;
                    else if (j == 1) {
                        b = igualdad;
                        System.out.printf("%d %d", a, b);
                    }
                } else {
                    break;
                }
                j++;
            }
            buffer.close();

        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}