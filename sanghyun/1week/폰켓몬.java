import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PhonCatMon {
    public static int main(String[] args) {
        int[] arr = { 3, 3, 3, 2, 2, 4};
        System.out.println(arr.length);
        int n = arr.length / 2;

        Set<Integer> set = new HashSet<>();
        IntStream stream = Arrays.stream(arr);
        stream.forEach(set::add);

        Integer answer = set.size();

        return answer > n ? n : answer;
    }
}
