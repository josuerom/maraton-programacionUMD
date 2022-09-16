package interfaz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
  * @author Josué Romero
  * @param 15/septiembre/2022 - 20:44 COL
*/
public class Abstract {

    public static void main(String[] args) {
        pc2Read();
    }

    public static void process(String vec[]) {
        int array[] = new int[vec.length];
        for (int i = 0; i < array.length; i++) {
            if (Integer.parseInt(vec[i] >= 3 && Integer.parseInt(vec[i]) <= 20)) {
                array[i] = Integer.parseInt(vec[i]);
            } else{
                break;
            }
        }

    }

    public static void pc2Read() {
        String vec[], line;
        int n;

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        try {
            line = buffer.readLine();
            n = Integer.parseInt(line);

            if (n >= 1 && n <= 100) {
                while (n >= 1) {
                    line = buffer.readLine();
                    vec = line split(" ");
                    process();
                    n--;
                }
            }
            buffer.close();
        } catch(NullPointerException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
