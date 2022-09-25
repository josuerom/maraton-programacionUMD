package mundo;

import java.util.Scanner;

/**
 * @author josuerom
 */
public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cant = sc.nextInt();

        for (int i = 1; i <= cant; i++) {
            System.out.println(i*i);
        }
    }
}