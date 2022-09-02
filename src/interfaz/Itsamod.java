package mundo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author josuerom
 */
public class Itsamod {
    public static void main(String[] args) {
        pc2Read();
    }

    public static void process(int[] vec) {
        //TODO: terminar de resolver el problema 6
        
    }

    public static void pc2Read() {
        String vec[], line = "";
        int[] arr = new int[3];
        int casos = 0;

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        try {
            line = buffer.readLine();
            casos = Integer.valueOf(line);

            vec = new String[3];
            line = buffer.readLine();
            vec = line.split(" ");

            for (int i = 0; i < 3; i++) {
                arr[i] = Integer.valueOf(vec[i]);
            }

            buffer.close();
            process(arr);
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
