public class 나머지가_1이_되는_수_찾기 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int n1 = 10;
        int result1 = sol.solution(n1);
        System.out.println(result1);  // 3

    }

    public static class Solution {
        public int solution(int n) {
            for (int i = 1; i <= n; i++) {
                if (n % i == 1) {
                    return i;
                }
            }
            return -1;
        }
    }

}
