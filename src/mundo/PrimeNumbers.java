package mundo;

/**
 * @author josuerom
 */
public class PrimeNumbers {

    public static void main(String[] args) {
        short numero = 32749;
        byte aux = 0;

        for (short i = 2; i <= numero; i++) {
            for (short j = i; j > 0; j--) {
                if (i % j == 0) {
                    aux++;
                }
            }
            if (aux == 2) {
                System.out.print(i + " ");
            }
            aux = 0;
        }
    }
}