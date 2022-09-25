package algoritmos;

public class OrdenamientoInsercion {

   public static void main(String[] args) {
      int[] arr = {1, 10, 8, 7, 6, 5, 4, 3, 2, 9};
      int max = 0;

      for (int i = 0; i < arr.length-1; i++) {
         for (int j = 1; j < arr.length; j++) {
            if (arr[j-1] > arr[j]) {
               max = arr[j-1];
               arr[j-1] = arr[j];
               arr[j] = max;
            }
         }
      }

      for (int e : arr) {
         System.out.print(e + " ");
      }
   }
}