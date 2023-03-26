import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // cantidad de platos
        int m = sc.nextInt(); // cantidad de calorías que Stan puede comer en la primera hora
        int[] calories = new int[n];
        for (int i = 0; i < n; i++) {
            calories[i] = sc.nextInt(); // cantidad de calorías de cada plato
        }
        sc.close();
        
        int maxCalories = m; // cantidad máxima de calorías que Stan puede comer
        int currentCalories = m; // cantidad actual de calorías que Stan puede comer en la hora actual
        int consecutiveHours = 0; // cantidad de horas consecutivas que ha comido
        
        for (int i = 0; i < n; i++) {
            if (calories[i] <= currentCalories) {
                currentCalories -= calories[i];
                consecutiveHours++;
            } else {
                // si el plato actual tiene menos calorías que las que puede comer Stan
                // y además Stan no ha comido en la hora anterior, entonces puede comer
                // el mismo número de calorías que en la primera hora
                if (consecutiveHours == 0) {
                    currentCalories = m;
                } else {
                    currentCalories = currentCalories * 2 / 3;
                    consecutiveHours = 0;
                    i--; // retroceder una hora para volver a considerar el plato actual
                }
            }
            maxCalories += currentCalories;
        }
        
        System.out.println(maxCalories);
    }
}
