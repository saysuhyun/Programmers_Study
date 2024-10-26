import java.lang.reflect.Parameter;

public class _3진법_뒤집기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(45);
    }

    static class Solution {
        public int solution(int n) {
            StringBuilder sb = new StringBuilder(Integer.toString(n, 3));
            Integer result = Integer.parseInt(sb.reverse().toString(),3);
            return result;
        }
    }

}