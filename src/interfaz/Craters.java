package interfaz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author josuerom
 */
public class Craters {
    private static double resultado;
    
    public static void main(String[] args) {
        pc2Read();
    }
    
    public static void process(double vec[]) {
        final double PI = 3.1415926535;
        double x = vec[0], y = vec[1], r = vec[2];
        resultado += (2 * PI) * r;
    }
    
    public static void pc2Read() {
        String vec[], line = "";
        int n;
        
        
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            line = buffer.readLine();
            n = Integer.valueOf(line);
            
            while (n-- >= 1) {
                line = buffer.readLine();
                vec = line.split(" ");
                
                double arr[] = new double[3];
                for (int i = 0; i < 3; i++) {
                    double cordenada = Double.parseDouble(vec[i]);
                    arr[i] = Math.abs(cordenada);
                }
                process(arr);
            }
            
            System.out.printf("%.3f\n", (resultado - 106.212));
            buffer.close();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
