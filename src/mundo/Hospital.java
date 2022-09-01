package mundo;
import java.util.Scanner;

public class Hospital {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int total = 0, niños = 0, niñas = 0, cant = 1, genero = 0;

      while (cant > 0) {
         System.out.print("Ingrese la cantidad de recien nacidos por genero: ");
         cant = sc.nextInt();

         if (cant != 0) {
            do {
               System.out.print("Ingrese 1 si fueron niños o 2 si fueron niñas: ");
               genero = sc.nextInt();
            } while (genero > 2 || genero < 1);
         }

         if (genero == 1) {
            niños += cant;
         } else if (genero == 2) {
            niñas += cant;
         }
      }
      System.out.printf("La cantidad total de niños recien nacidos es: %d\n" +
            "La cantidad total de niñas recien nacidad es: %d\n" +
            "Total recien nacidos: %d", niños, niñas, (niñas+niños));
   }
}