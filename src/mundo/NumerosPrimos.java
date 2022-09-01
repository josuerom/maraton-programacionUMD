package mundo;

/**
 * @deprecated este programa imprime los primeos números primos antes del 100
 * @author josuerom
 */
public class NumerosPrimos {

    public static void main(String[] args) {
        short numero = 200, aux = 0;

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