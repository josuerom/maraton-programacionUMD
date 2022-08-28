package interfaz;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author josuerom
 */
public class Drinks {

    public static void main (String[ ] args) throws IOException {
        pc2Read();
    }
	
    public static void process(int n, String vec[]) {
        byte size = (byte) vec.length;
        int pi[] = new int[size];
        double result = 0;
        
        for(int i = 0; i < size; i++) {
            pi[i] = Integer.parseInt(vec[i]);
        }

        for(int j = 0; j < size; j++) {
            if (pi[j] != 0) {
                double x = pi[j];
                result += (x / n);
            }
        }
        System.out.printf("%.12f\n", result);
    }
	
    public static void pc2Read() {
        String vec[], line = "";
        int n;

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
	  
        try { 
            line = buffer.readLine();
            n = Integer.parseInt(line);

            line = buffer.readLine();
            vec = line.split(" ");
            process(n, vec);
            buffer.close();
        }
        catch(NullPointerException e) {
            e.printStackTrace();		  
        }
        catch (IOException e) {
            e.printStackTrace(); 
        }
    }
}