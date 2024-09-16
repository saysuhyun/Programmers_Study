import java.util.*;

public class Int {
    public static void main(String[] args) {
        long n  = 118372;
        String s  = Long.toString(n);
        char[] c = s.toCharArray();

        ArrayList<Integer> arr = new ArrayList<>();

        for (char ch : c) {
            arr.add(Character.getNumericValue(ch));
        }
       Collections.sort(arr, Collections.reverseOrder());

        StringBuilder str = new StringBuilder();
       arr.stream().forEach((i) -> str.append(String.valueOf(i)));

        long answer = Long.parseLong(str.toString());
        System.out.println(answer);
    }
}