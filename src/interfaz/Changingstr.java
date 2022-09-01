package interfaz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author josuerom
 */
public class Changingstr {

    public static void main(String[] args) throws IOException {
        pc2Read();
    }
    
    public static void process(String[] caracters) {
        byte size = (byte) caracters.length, lengthU = 0, lengthF = 0, pos = -1;
        boolean primerCaracter = false;
        
        if (caracters.length >= 3 && caracters.length <= 30) { 
            
            for (int i = 0; i < size; i++) {
                for (int j = i; j < size; j++) {
                    if (caracters[j].equals("U")) {
                        pos++;
                        primerCaracter = true;
                    } else if (primerCaracter == false) {
                        lengthU++;
                        pos++;
                    }
                }
                
                for (int l = i; l < lengthU; l++) {
                    caracters[l] = "-";
                }
                
                lengthU = 0;
                i = (pos + 1);
                pos = -1;
                primerCaracter = false;
            }
            System.out.println("Cantidad de letras que hay antes de la primera U: " + lengthU);
            for (String s : caracters) {
                System.out.print(s);
            }
            
        }// fin if
        
    }
    
    public static void pc2Read() {
        String caracters[], line = "";
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            line = buffer.readLine();
            caracters = line.split("");

            process(caracters);
            buffer.close();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }
}
