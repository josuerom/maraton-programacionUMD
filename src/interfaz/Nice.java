package mundo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nice {
    public static void main(String[] args) {
        pc2Read();
    }

    /**
     * @param n cantidad de miembros del equipo
     * @param r aumento fijo ofrecido
     * @param vec salario actual de cada miembro
     */
    public static void process(int n, int r, int vec[]) {
        int fixed_salary = 0, double_salary = 0;

        for (int i = 0; i < vec.length; i++) {
            if (vec[i] < r && vec[i] != 0) {
                fixed_salary++;
            } else if (vec[i] > r && vec[i] != 0) {
                double_salary++;
            }
        }
        if (fixed_salary == double_salary) {
            System.out.println("0");
        } else if (fixed_salary > double_salary) {
            System.out.println("1");
        } else {
            System.out.println("2");
        }
    }

    public static void pc2Read() {
        String strSalary[], line = "";
        int n, r, vec[];

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        try {
            line = buffer.readLine();
            strSalary = line.split(" ");
            n = Integer.parseInt(strSalary[0]);
            r = Integer.parseInt(strSalary[1]);

            vec = new int[n];

            for (int i = 0; i < n; i++) {
                line = buffer.readLine();
                vec[i] = Integer.parseInt(line);
            }
            process(n, r, vec);
            buffer.close();

        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}