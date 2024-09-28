public class 하샤드_수 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean result = solution.solution(12);
        System.out.println(result);
    }

    static class Solution {
        public boolean solution(int x) {
            String str = String.valueOf(x);
            int sum = 0;

            for (char item : str.toCharArray()) {
                sum += item - '0';
            }
            if (x % sum == 0)
                return true;

            return false;
        }
    }
}