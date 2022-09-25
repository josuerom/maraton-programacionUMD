package mundo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * @author josuerom
 */
public class BigNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String number = buffer.readLine();
        BigInteger bigNumber = new BigInteger(number);
        bigNumber = bigNumber.abs();
        System.out.println(bigNumber);
    }
}