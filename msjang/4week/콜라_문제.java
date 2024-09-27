public class 콜라_문제 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(2, 1, 20);
        System.out.println(result);
    }

    static class Solution {
        public int solution(int a, int b, int n) {
            int answer = 0;

            while (true) {
                answer += (n / a) * b;
                n = n % a + (n / a) * b;
                if (n < a) {
                    break;
                }
            }

            return answer;
        }
    }
}