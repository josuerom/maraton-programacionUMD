import java.util.*;

public class ICPCProblem {
    
    static Map<String, List<String>> hasMap = new HashMap<>();
    static Map<String, List<String>> isMap = new HashMap<>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Número de relaciones
        int m = sc.nextInt(); // Número de consultas
        
        // Procesar relaciones
        for (int i = 0; i < n; i++) {
            String C1 = sc.next();
            String r = sc.next();
            String C2 = sc.next();
            
            if (r.equals("has-a")) {
                if (!hasMap.containsKey(C1)) {
                    hasMap.put(C1, new ArrayList<>());
                }
                hasMap.get(C1).add(C2);
            } else {
                if (!isMap.containsKey(C1)) {
                    isMap.put(C1, new ArrayList<>());
                }
                isMap.get(C1).add(C2);
            }
        }
        
        // Procesar consultas
        for (int i = 0; i < m; i++) {
            String C1 = sc.next();
            String r = sc.next();
            String C2 = sc.next();
            boolean result = isRelated(C1, r, C2);
            System.out.println((i+1) + " " + (result ? "true" : "false"));
        }
    }
    
    static boolean isRelated(String C1, String r, String C2) {
        if (r.equals("has-a")) {
            if (!hasMap.containsKey(C1)) {
                return false;
            }
            List<String> list = hasMap.get(C1);
            if (list.contains(C2)) {
                return true;
            }
            for (String s : list) {
                if (isRelated(s, r, C2)) {
                    return true;
                }
            }
        } else {
            if (!isMap.containsKey(C1)) {
                return false;
            }
            List<String> list = isMap.get(C1);
            if (list.contains(C2)) {
                return true;
            }
            for (String s : list) {
                if (isRelated(s, r, C2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
