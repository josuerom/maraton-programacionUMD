package interfaz;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author josuerom
 */
public class CollectingCoins {

    public static void main(String[] args) throws IOException {
        pc2Read();
    }
    
    public static void process(int test_case, String vec[]){
        byte size = (byte) vec.length;
        int[] coins = new int[size];
        for (int i = 0; i < size; i++) {
            coins[i] = Integer.valueOf(vec[i]);
        }
        // Coleccionar monedas
        while (test_case >= 1) {
            
            test_case--;
        }
    }
    
    public static void pc2Read() {
        String vec[], line = "";
        int test_case;
        
        BufferedReader buffer = new BufferedReader( new InputStreamReader(System.in));
        
        try {
            line = buffer.readLine();
            test_case = Integer.valueOf(line);
            
            line = buffer.readLine();
            vec = line.split(" ");
            process(test_case, vec);
            buffer.close();
            
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}