import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Divisor {

    public static void main(String[] args) {
        Integer divisor = 10;
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3, 2, 6));
        List<Integer> newArr = arr.stream()
                .filter(a -> a % divisor == 0)
                .sorted()
                .collect(Collectors.toList());

        List<Integer> answer = newArr.size() == 0 ? Arrays.asList(-1) : newArr;
        System.out.println(answer);
    }
}
