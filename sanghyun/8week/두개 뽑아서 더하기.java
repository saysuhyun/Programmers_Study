import java.util.*;


public class DoubleReverse {
    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1};

        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < numbers.length; i++) {
            for(int l = i+1; l < numbers.length; l++) {
                set.add(numbers[i] + numbers[l]);
                System.out.println( numbers[i]+" :  " + numbers[l] + " " + numbers[i] + numbers[l]);
            }
        }
        int[] answer = set.stream().mapToInt(Integer::intValue).toArray();

        Arrays.sort(answer);

        System.out.println(sanswer);
    }
}