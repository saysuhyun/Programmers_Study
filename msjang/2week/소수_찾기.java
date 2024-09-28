public class 소수_찾기 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(11);
        System.out.println(result);

    }

    static class Solution {
        public int solution(int n) {
            int answer = 0;
            for (int i = 2 ; i <= n ; i++){
                if (isPrime(i)){
                    answer++;
                }
            }
            return answer;
        }

        boolean isPrime(int n){
            for (int i = 2 ; i * i <= n; i++){
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}