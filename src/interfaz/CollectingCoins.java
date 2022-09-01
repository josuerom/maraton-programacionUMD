package interfaz;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CollectingCoins {
    public static void main(String[] args) {
        pc2Read();
    }

    public static void pc2Read() {
        String strVec[], line = "";
        int[] vec = new int[4];
        int test_case, a = 0, b = 0, c = 0, n = 0, dif = 0;
        boolean continuar = false;

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        try {
            line = buffer.readLine();
            test_case = Integer.parseInt(line);

            while (test_case >= 1) {
                line = buffer.readLine();
                strVec = line.split(" ");

                for (int i = 0; i < 4; i++) {
                    vec[i] = Integer.valueOf(strVec[i]);
                    if (i == 0) a = vec[i];
                    if (i == 1) b = vec[i];
                    if (i == 2) c = vec[i];
                    if (i == 3) n = vec[i];
                }

                Arrays.sort(vec, 0, 3);
                //System.out.println(Arrays.toString(vec));
                if ((a == b && b == c) && (n % 3 == 0)) {
                    System.out.println("YES");
                } else if ((a == b && b == c) && (n % 3 != 0)) {
                    System.out.println("NO");
                } else {
                    if (vec[0] < vec[2]) {
                        dif = (vec[2] - vec[0]);
                        a += dif;
                        n -= dif;
                        if (n < 0) {
                            System.out.println("NO");
                            break;
                        } else {
                            continuar = true;
                        }
                    }
                    if (continuar && vec[1] < vec[2]) {
                        dif = (vec[2] - vec[1]);
                        b += dif;
                        n -= dif;
                        if (n < 0) {
                            System.out.println("NO");
                            break;
                        } else {
                            continuar = true;
                        }
                    }
                    if (continuar && n % 3 == 0) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                } // Fin else
                test_case--;
            } // Fin while
            buffer.close();

        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}