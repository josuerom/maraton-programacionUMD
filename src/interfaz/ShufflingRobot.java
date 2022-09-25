package interfaz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShufflingRobot {
    public static void main(String[] args) {
        pc2Read();
    }

    public static void process(byte n) {
        byte[] arreglo = {0,0,2,3,4,4,6,5,6,6,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40,42,44,46,48,50,52,54,56,58,60,62,64,66,68,70,72,74,76,78,80,82,84,86,88,90,92,94};
        System.out.println(arreglo[n-1]);
    }

    public static void pc2Read() {
        String vec[], line;
        byte arr[], n, n_cartas;
        boolean ordenado = true;

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        try {
            line = buffer.readLine();
            n = Byte.valueOf(line);

            while (n-- >= 1) {
                line = buffer.readLine();
                vec = line.split(" ");
                arr = new byte[vec.length];

                for (int i = 0; i < vec.length; i++) {
                    arr[i] = Byte.valueOf(vec[i]);
                }
                for (int i = 0; i < arr.length - 1; i++) {
                    if (arr[i] > arr[i + 1]) {
                        ordenado = false;
                        break;
                    }
                }

                if (ordenado) {
                    System.out.println("0");
                } else {
                    n_cartas = (byte) vec.length;
                    process(n_cartas);
                }
            }
            buffer.close();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}