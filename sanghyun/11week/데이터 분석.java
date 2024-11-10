import  java.util.*;
import java.util.stream.*;

public class Data {
    public static void main(String[] args) {
        int[][] data = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};
        String ext ="date"; 
        int val_ext =20300501; 
        String sort_by = "remain";

        Map<String, Integer> order = new HashMap<>();
        order.put("code", 0);
        order.put("date", 1);
        order.put("maximum", 2);
        order.put("remain", 3);

        int[][] answer = Arrays.stream(data).filter(a -> a[order.get(ext)] < val_ext).toArray(int[][]::new);
        Arrays.sort(answer, (a, b) ->  a[order.get(sort_by)] - b[order.get(sort_by)]);

    }
}