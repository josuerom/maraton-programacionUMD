package algoritmos;

import java.util.Arrays;

public class OrdenamientoSeleccion {

   public static void main(String[] args) {
      int[] arr = {1, 10, 8, 7, 6, 5, 4, 3, 2, 9};
      int[] vec = new int[arr.length];

      for (int i = 0, min = 0; i < arr.length-1; i++) {
         for (int j = 0; j < arr.length-1; j++) {
            if (arr[i] < arr[j+1]) {
               min = arr[i];
            }
         }
         vec[i] = min;
      }
      System.out.println(Arrays.toString(vec));
      // La complijidad del algoritmo SelectionShort en Notación Big O es de O(n^2)
   }
}
