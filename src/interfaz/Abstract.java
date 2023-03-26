import java.util.*;

public class Abstract {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); // número de polígonos

        List<int[]> vertices = new ArrayList<>();
        // leer vértices de los polígonos
        for (int i = 0; i < n; i++) {
            int m = input.nextInt(); // número de lados del polígono
            int[] polygon = new int[2 * m]; // coordenadas de los vértices
            for (int j = 0; j < 2 * m; j++) {
                polygon[j] = input.nextInt();
            }
            vertices.add(polygon);
        }

        double area = calculateArea(vertices); // calcular área total
        double paint = area * 2.0; // cantidad total de pintura (factor de k = 2)
        double canvas = calculateConvexHullPerimeter(vertices); // cantidad total de lienzo cubierto

        // mostrar resultados con tres lugares decimales, redondeados
        System.out.printf("%.3f %.3f\n", paint, canvas);
    }

    // calcular el área total de los polígonos
    public static double calculateArea(List<int[]> vertices) {
        double area = 0.0;
        for (int[] polygon : vertices) {
            area += shoelace(polygon);
        }
        return area;
    }

    // calcular el área de un polígono utilizando la fórmula de Shoelace
    public static double shoelace(int[] polygon) {
        int n = polygon.length / 2;
        double sum1 = 0.0, sum2 = 0.0;
        for (int i = 0; i < n; i++) {
            sum1 += polygon[2 * i] * polygon[(2 * i + 3) % (2 * n)];
            sum2 += polygon[2 * i + 1] * polygon[(2 * i + 2) % (2 * n)];
        }
        return Math.abs(sum1 - sum2) / 2.0;
    }

    // calcular el perímetro de la envolvente convexa de los vértices
    public static double calculateConvexHullPerimeter(List<int[]> vertices) {
        int n = vertices.size();
        int[][] points = new int[n][2];
        for (int i = 0; i < n; i++) {
            points[i][0] = vertices.get(i)[0];
            points[i][1] = vertices.get(i)[1];
        }
        int[] hull = GrahamScan.getConvexHull(points);
        double perimeter = 0.0;
        for (int i = 0; i < hull.length; i++) {
            int[] p1 = points[hull[i]];
            int[] p2 = points[hull[(i + 1) % hull.length]];
            perimeter += distance(p1, p2);
        }
        return perimeter;
    }

    // calcular la distancia euclidiana entre dos puntos
    public static double distance(int[] p1, int[] p2) {
        int dx = p1[0] - p2[0];
        int dy = p1[1] - p2[1];
        return Math.sqrt(dx * dx + dy * dy);
    }
}
