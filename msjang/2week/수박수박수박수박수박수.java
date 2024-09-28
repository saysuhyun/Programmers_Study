public class 수박수박수박수박수박수 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution(3);
        System.out.println(result);
    }

    static class Solution {
        public String solution(int n) {
            StringBuilder sb = new StringBuilder();
            for (int i = 1 ; i <= n ; i++){
                sb.append(i % 2 == 0 ? "박" : "수");
            }
            return sb.toString();
        }
    }
}