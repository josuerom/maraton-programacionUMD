package interfaz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DirectionChange {

   public static void main(String[] args) {
      pc2Read();
   }

   public static void process(String[] vec) {
      long n = Long.valueOf(vec[0]), m = Long.valueOf(vec[1]);

      if (n == 1 && m == 1) {
         System.out.println("0");
      } else if ((n == 1 && m == 2) || (n == 2 && m == 1)) {
         System.out.println("1");
      } else if ((n == 1 && m >= 3) || (n >= 3 && m == 1)) {
         System.out.println("-1");
      } else {
         if (n % 2 == 0 && m % 2 == 0) {
            if (n < m) {
               System.out.println((m * 2) - 2);
            } if (n > m) {
               System.out.println((n * 2) - 2);
            } if (n == m) {
               System.out.println((n * 2) - 2);
            }
         } if (n % 3 == 0 && m % 3 == 0) {
            if (n < m) {
               System.out.println((m * 2) - 2);
            } if (n > m) {
               System.out.println((n * 2) - 2);
            } if (n == m) {
               System.out.println((n * 2) - 2);
            }
         }

         if (n % 2 == 0 && m % 2 == 1) {
            if (n < m) {
               System.out.println((m * 2) - 3);
            } else {
               System.out.println((n * 2) - 3);
            }
         } if (n % 2 == 1 && m % 2 == 0) {
            if (n < m) {
               System.out.println((m * 2) - 3);
            } else {
               System.out.println((n * 2) - 3);
            }
         }
      }
   }

   public static void pc2Read() {
      String vec[], line;
      int t;

      BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

      try {
         line = buffer.readLine();
         t = Integer.parseInt(line);

         while (t-- >= 1) {
            line = buffer.readLine();
            vec = line.split(" ");
            process(vec);
         }
         buffer.close();
      } catch (NullPointerException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}