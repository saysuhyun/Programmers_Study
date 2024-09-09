import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringSort {
    public static String[] main(String[] args) {
        String[] str = { "sun", "bed", "car", "jan" };

        ArrayList<String> strArr = new ArrayList<>(Arrays.asList(str));
        int n = 1;
        strArr.sort((a, b) -> {

            char aChar = a.toCharArray()[n];
            char bChar = b.toCharArray()[n];

            if(aChar == bChar) {
                return a.compareTo(b);
            }

            return Character.compare(aChar, bChar);
        });

        String[] answer = strArr.toArray(new String[0]);

        return answer;

    }
}
