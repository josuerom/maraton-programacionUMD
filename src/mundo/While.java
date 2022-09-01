package mundo;

public class While {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 1000000) {
            System.out.printf("%d, ", i);
            i++;
        }
    }
}