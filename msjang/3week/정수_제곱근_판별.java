public class 정수_제곱근_판별 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        long result = solution.solution(121);
        System.out.println(result);
    }

    static class Solution {
        public long solution(long n) {
            long answer = 0;

            double sqrt = Math.sqrt(n);

            if (sqrt%1 == 0){
                return (long) Math.pow(sqrt+1,2);
            }

            return -1;
        }
    }


}