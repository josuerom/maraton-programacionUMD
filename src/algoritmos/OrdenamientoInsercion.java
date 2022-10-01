package algoritmos;

import java.util.Arrays;

public class OrdenamientoInsercion {

   public static void main(String[] args) {
      int[] arr = {5, 1, 8, 7, 6, 10, 4, 3, 2, 9}; // 1

      for (int i = 1; i < arr.length; i++) {       // n
         int actual = arr[i];                      // n
         int j = i-1;                              // n

         while (j >= 0 && arr[j] > actual) {       // n^2
            arr[j+1] = arr[j];                     // n^2
            j--;                                   // n^2
         }
         arr[j+1] = actual;                        // n
      }
      
      System.out.println(Arrays.toString(arr));    // 1
      /*
         (Límite superior) Notación Big O. Representa el comportamiento en el peor de los casos 
         La complejidad del algoritmo InsertionShort es de O(n^2) debido a que si simplificamos
         --> 3n^2 + 4n + 2 = O(n^2)
      */
   }
}