import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.alg.connectivity.ConnectivityInspector;
import org.jgrapht.alg.interfaces.ShortestPathAlgorithm;
import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;

import java.util.*;

public class RailroadSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el número de líneas ferroviarias en el sistema
        int n = scanner.nextInt();

        // Crear el grafo
        Graph<Integer, DefaultEdge> graph = new SimpleGraph<>(DefaultEdge.class);
        for (int i = 0; i < n; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            graph.addVertex(u);
            graph.addVertex(v);
            graph.addEdge(u, v);
        }

        // Encontrar el cruce crítico
        int criticalCrossroad = findCriticalCrossroad(graph);

        // Encontrar la mejor línea ferroviaria posible
        int[] bestLine = findBestLine(graph, criticalCrossroad);

        // Mostrar los resultados
        System.out.println((n - 1) - countConnectedPairs(graph, criticalCrossroad));
        graph.addEdge(bestLine[0], bestLine[1]);
        System.out.println((n - 1) - countConnectedPairs(graph, criticalCrossroad));
    }

    private static int findCriticalCrossroad(Graph<Integer, DefaultEdge> graph) {
        int criticalCrossroad = -1;
        int maxComponents = 0;

        // Iterar sobre todos los cruces para encontrar el cruce crítico
        for (int crossroad : graph.vertexSet()) {
            // Eliminar el cruce y contar el número de componentes conexas resultantes
            Graph<Integer, DefaultEdge> subGraph = new SimpleGraph<>(DefaultEdge.class);
            Graphs.addGraph(subGraph, graph);
            subGraph.removeVertex(crossroad);
            ConnectivityInspector<Integer, DefaultEdge> connectivityInspector = new ConnectivityInspector<>(subGraph);
            int components = connectivityInspector.connectedSets().size();

            // Actualizar el cruce crítico y la cantidad máxima de componentes conexas
            if (components > maxComponents) {
                criticalCrossroad = crossroad;
                maxComponents = components;
            }
        }

        return criticalCrossroad;
    }

    private static int[] findBestLine(Graph<Integer, DefaultEdge> graph, int criticalCrossroad) {
        int[] bestLine = new int[2];
        int minDisconnectedPairs = Integer.MAX_VALUE;

        // Encontrar la distancia más corta entre todos los pares de cruces no conectados
        ShortestPathAlgorithm<Integer, DefaultEdge> shortestPathAlgorithm = new DijkstraShortestPath<>(graph);
        for (int u : graph.vertexSet()) {
            for (int v : graph.vertexSet()) {
                if (u >= v || graph.containsEdge(u, v)) {
                    continue;
                }

                // Calcular el número de pares desconectados después de agregar la nueva línea ferroviaria
                double distance = shortestPathAlgorithm.getPathWeight(u, criticalCrossroad)
                        + shortestPathAlgorithm.getPath
