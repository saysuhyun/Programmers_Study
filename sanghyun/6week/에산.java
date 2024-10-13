import java.util.*;
import java.util.stream.Collectors;

public class Budget {
    public static void main(String[] args) {
        int[] d = { 1,3,2,5,4};
        int budget = 9;

       List<Integer> arr = Arrays.stream(d)
        .boxed()  
        .sorted()
        .collect(Collectors.toList());

        int total = 0;
        int answer = 0;
        for (Integer i : arr) {
            if (total + i > budget) {
                break;
            }
            total += i;
            answer++;
        }
       
        System.out.println(answer);
    }
}