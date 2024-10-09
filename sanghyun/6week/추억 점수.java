import java.util.*;

public class Memory {
    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"} , {"may", "kein", "brin", "deny"} , {"kon", "kain", "may", "coni"}};

        

        int[] answer = new int[photo.length];

        int ii = 0;
        for(String[] p : photo) {
            HashMap<String,Integer> hMap = new HashMap<>();
            for(int i = 0; i < p.length; i++) {
                String personName = p[i];

                Integer point = hMap.get(personName);
                int idx = Arrays.asList(name).indexOf(personName);
                if(idx < 0) {
                    continue;
                }
                if(point == null) {
                    hMap.put(personName, yearning[idx]);
                } else {
                    hMap.put(personName, point+ yearning[idx]);
                }
                
            }
            int total = 0;
            for (Map.Entry<String, Integer> entry : hMap.entrySet()) {
                total += entry.getValue();
            }
            answer[ii] = total;
            ii++;
        }
    }
}