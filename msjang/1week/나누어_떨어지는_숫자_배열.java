import java.util.ArrayList;
import java.util.Arrays;

public class 나누어_떨어지는_숫자_배열 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] resultList = solution.solution(new int[]{2, 36, 1, 3}, 1);
        for (int i : resultList) {
            System.out.println(i);
        }
    }

    static class Solution {
        public int[] solution(int[] arr, int divisor) {
            int[] intList = Arrays.stream(arr)
                    .filter(item -> item % divisor == 0)
                    .sorted()
                    .toArray();
            if (intList.length == 0) {
                return new int[]{-1};
            }

            return intList;
        }
    }
}