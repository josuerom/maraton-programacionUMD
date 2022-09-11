package interfaz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DirectionChange {

   public static void main(String[] args) {
      pc2Read();
   }

   public static void process(String[] vec) {
      int n = Integer.valueOf(vec[0]), m = Integer.valueOf(vec[1]);

      if ((n >= 1 && n <= 1000000000) && (m >= 1 && m <= 1000000000)) {
         if (n == 1 && m == 1) {
            System.out.println("0");
         } else if ((n == 1 && m == 2) || (n == 2 && m == 1)) {
               System.out.println("1");
         } else if ((n == 1 && m >= 3) || (n >= 3 && m == 1)) {
            System.out.println("-1");
         } else {
            if ((n % 2 == 0 && m % 2 == 0) || (n % 3 == 0 && m % 3 == 0)) {
               if (n == m) {
                  System.out.println((n * 2) - 2);
               } else {
                  System.out.println((n > m) ? ((n * 2) - 2) : ((m * 2) - 3));
               }
            }
            if ((n % 2 == 0 && m % 3 == 0) || (n % 3 == 0 && m % 2 == 0)) {
               System.out.println((n > m) ? ((n * 2) - 2) : ((m * 2) - 3));
            }
         }
      }// fin instrucción de control principal
   }

   public static void pc2Read() {
      String vec[], line;
      int t;

      BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

      try {
         line = buffer.readLine();
         t = Integer.parseInt(line);

         if (t >= 1 && t <= 1000) {
            while (t >= 1) {
               line = buffer.readLine();
               vec = line.split(" ");
               process(vec);
               t--;
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