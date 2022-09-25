package mundo;

import java.util.Scanner;

public class Words {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Ingrese un mensaje: ");
      String mensaje = sc.nextLine();
      String[] items = mensaje.split(" ");
      int aux = 0;

      for (int i = 0; i < items.length-1; i++) {
         for (int j = (i+1); j < items.length; j++) {
            if (items[i].equalsIgnoreCase(items[j]))
               aux++;
         }
         if (aux > 1)
            System.out.printf("['%s', %d]\n", items[i], (aux+1));
         aux = 0;
      }
   }
}