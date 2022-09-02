package mundo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author josuerom
 */
public class Changingstr {
    public static void main(String[] args) {
        pc2Read();
    }

    public static void process(String[] caracters) {
        byte size = (byte) caracters.length, position = 0, lengthF = 0;

        if (size >= 3 && size <= 30) {
            for (byte l = 0; l < size; l++) {
                if (caracters[l].equals("U")) {
                    position = (byte) (l+1);
                    l = size;
                    lengthF = (byte) (size - 1);

                    for (byte i = (byte) (size-1); i >= position; i--) {
                        if (caracters[i].equals("F")) {
                            i = -1;
                        } else {
                            caracters[i] = "-";
                            lengthF--;
                        }
                    }
                    break;
                } else {
                    caracters[l] = "-";
                }
            }

            for (byte k = position; k < lengthF; k++) {
                    caracters[k] = "C";
            }
            // Imprimo la nueva cadena transformada a UCF
            for (String s: caracters) {
                System.out.print(s);
            }
        }
    }

    public static void pc2Read() {
        String strVec[], line = "";
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        try {
            line = buffer.readLine();
            strVec = line.split("");

            process(strVec);
            buffer.close();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
