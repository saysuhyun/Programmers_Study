public class 소수_만들기 {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int result = solution.solution(new int[]{1, 2, 7, 6, 4});
        System.out.println(result);
        System.out.println(solution.isPrime(6));

    }

    static class Solution {
        public int solution(int[] nums) {
            int answer = 0;

            for (int i = 0; i < nums.length - 2; i++) {
                for (int k = i + 1; k < nums.length - 1; k++) {
                    for (int j = k + 1; j < nums.length; j++) {
                        int result = nums[i] + nums[k] + nums[j];
                        if (isPrime(result)) {
                            answer++;
                        }
                    }
                }
            }

            return answer;
        }

        boolean isPrime(int n) {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

}