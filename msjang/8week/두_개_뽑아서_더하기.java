import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class 두_개_뽑아서_더하기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(new int[]{2, 1, 3, 4, 1});
    }

    static class Solution {
        public int[] solution(int[] numbers) {

            Set<Integer> set = new TreeSet<>();
            for (int i = 0; i < numbers.length - 1; i++) {
                for (int k = i+1; k < numbers.length; k++) {
                    set.add(numbers[i]+numbers[k]);
                }
            }

            int[] answer = set.stream()
                    .mapToInt(i -> i)
                    .toArray();

            return answer;
        }
    }
}