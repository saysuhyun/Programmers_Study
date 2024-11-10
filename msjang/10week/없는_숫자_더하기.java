import java.util.stream.IntStream;

public class 없는_숫자_더하기 {

    public static void main(String[] args) {

        Solution solution = new Solution();
        solution.solution(new int[]{1,2,3,4,6,7,8,0});
    }

    static class Solution {
        public int solution(int[] numbers) {
            int answer = -1;

            answer = IntStream.rangeClosed(0, 9)
                    .filter(i -> IntStream.of(numbers).noneMatch(j -> i == j))
                    .sum();
            return answer;
        }
    }
}