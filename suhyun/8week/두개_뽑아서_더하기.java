import java.util.Set;
import java.util.TreeSet;

public class 두개_뽑아서_더하기 {
    public int[] solution(int[] numbers) {
        Set<Integer> resultSet = new TreeSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                resultSet.add(numbers[i] + numbers[j]);
            }
        }

        return resultSet.stream().mapToInt(Integer::intValue).toArray();
    }
}