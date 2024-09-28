public class 짝수와_홀수 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution(2);
        System.out.println(result);
    }

    static class Solution {
        public String solution(int num) {
            return num%2==0 ? "Even" : "Odd";
        }
    }
}

