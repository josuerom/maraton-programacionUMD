package algoritmos;

public class OrdenamientoBurbuja {

   public static void main(String[] args) {
      int[] arr = {1, 10, 8, 7, 6, 5, 4, 3, 2, 9};
      int max = 0;

      for (int i = 0; i < arr.length-1; i++) {
         for (int j = 0; j < arr.length-1; j++) {
            if (arr[j] > arr[j+1]) {
               max = arr[j];
               arr[j] = arr[j+1];
               arr[j+1] = max;
            }
         }
      }

      for (int e : arr) {
         System.out.print(e + " ");
      }
      // La complijidad del algoritmo BubbleShort en Notación Big O es de O(n^2)
   }
}
