import java.util.Scanner;

public class Craters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] craters = new int[n][3];
        for (int i = 0; i < n; i++) {
            craters[i][0] = scanner.nextInt();
            craters[i][1] = scanner.nextInt();
            craters[i][2] = scanner.nextInt();
        }
        // Encuentra el círculo más externo que cubra todos los cráteres
        int[] outerCircle = craters[0];
        for (int i = 1; i < n; i++) {
            int[] crater = craters[i];
            if (Math.sqrt(Math.pow(crater[0] - outerCircle[0], 2) + Math.pow(crater[1] - outerCircle[1], 2)) + crater[2] > outerCircle[2]) {
                // El cráter está fuera del círculo más externo actual, actualiza el círculo
                double d = Math.sqrt(Math.pow(crater[0] - outerCircle[0], 2) + Math.pow(crater[1] - outerCircle[1], 2));
                outerCircle[0] = (int) (crater[0] + (crater[2] - d) * (crater[0] - outerCircle[0]) / d);
                outerCircle[1] = (int) (crater[1] + (crater[2] - d) * (crater[1] - outerCircle[1]) / d);
                outerCircle[2] = (int) (crater[2] + (crater[2] - d));
            }
        }
        // Calcula el perímetro del círculo más externo
        double perimeter = 2 * Math.PI * outerCircle[2];
        // Redondea el resultado y lo muestra
        System.out.printf("%.3f\n", perimeter);
    }
}
