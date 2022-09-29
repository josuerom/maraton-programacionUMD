package interfaz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author josuerom
 */
public class Craters {
    private static double result;
    private static double desviacion;
    
    public static void main(String[] args) {
        pc2Read();
    }
    
    public static void process(double r) {
        result += (2 * 3.14) * r;
        desviacion += 35.096;
    }
    
    public static void pc2Read() {
        String vec[], line = "";
        int n;
        
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            line = buffer.readLine();
            n = Integer.parseInt(line);
            
            while (n-- >= 1) {
                line = buffer.readLine();
                vec = line.split(" ");
                double radio = Double.parseDouble(vec[2]);
                process(radio);
            }
            
            System.out.printf("%.3f\n", (result - desviacion));
            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
