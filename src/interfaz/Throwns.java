import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Throwns {
    
    public static void main(String[] args) {
        pc2Read();
    }
    
    public static void process(byte n[], String vec[]) {
        byte n = n[0]; //número de estudiantes
        byte k = n[1]; //cantidad de comandos que lanza Daenerys
    }
    
    public static void pc2Read() {
        String vec[], line;
        byte n[] = new byte[2];
  
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            line = buffer.readLine();
            n = (byte) line.split(" ");
            
            line = buffer.readLine();
            vec = line.split(" ");
            buffer.close();
            process(n, vec);
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
