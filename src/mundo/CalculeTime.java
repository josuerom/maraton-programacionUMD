public class CalculeTime {

   public static void main(String[] args) throws InterruptedException {
      long inicio = System.currentTimeMillis();
      for (long i = 1; i <= 10000; i++) {
         System.out.printf("%d ", i);
      }
      long fin = System.currentTimeMillis();
      long tiempo = (fin - inicio);
      System.out.printf("\n%d ms", tiempo);
    }
}