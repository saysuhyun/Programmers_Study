public class 최대공약수와_최소공배수 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(3, 12);
        for (int item : result) {
            System.out.println(item);
        }
    }

    static class Solution {
        public int[] solution(int n, int m) {
            int comDiv = generateComDiv(n, m);
            int comMulti = generateComMulti(n, m);
            int[] answer = {comDiv, comMulti};
            return answer;
        }

        public int generateComDiv(int n, int m) {
            int min = n > m ? m : n;

            for (int i = min; i > 0; i--) {
                if (n % i == 0 && m % i == 0) {
                    return i;
                }
            }

            return 1;
        }

        public int generateComMulti(int n, int m) {
            int max = n < m ? m : n;

            for (int i = max; i <= n * m; i++) {
                if (i%n == 0 && i % m == 0) {
                    return i;
                }
            }
            return max;
        }
    }

}