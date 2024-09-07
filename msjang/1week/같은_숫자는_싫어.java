import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class 같은_숫자는_싫어 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] resultList = solution.solution(new int[]{1, 1, 3, 3, 0, 1, 1});
        for (int result : resultList) {
            System.out.println(result);
        }
    }

    public static class Solution {
        public int[] solution(int[] arr) {

            Stack<Integer> stack = new Stack<>();

            for (int item : arr) {
                if (stack.isEmpty() || stack.peek() != item) {
                    stack.push(item);
                }
            }
            int[] answer = stack.stream().mapToInt(i -> i).toArray();
            return answer;
        }
    }

}