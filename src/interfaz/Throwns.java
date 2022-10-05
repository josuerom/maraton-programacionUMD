import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Throwns {
    
    public static void main(String[] args) {
        pc2Read();
    }
    
    public static void process(byte n[], String vec[]) {
        byte students = n[0]; //número de estudiantes
        byte commands = n[1]; //cantidad de comandos que lanza Daenerys
        System.out.println(Arrays.deepToString(vec));
    }
    
    public static void pc2Read() {
        String vec[], n[], line;
        byte student[] = new byte[2];
  
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            line = buffer.readLine();
            n = line.split(" ");
            student[0] = Byte.valueOf(n[0]);
            student[1] = Byte.valueOf(n[1]);
            
            line = buffer.readLine();
            vec = line.split(" ");
            buffer.close();
            process(student, vec);
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
