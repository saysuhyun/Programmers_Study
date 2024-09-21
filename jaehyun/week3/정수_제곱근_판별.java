package jaehyun.week3;

public class 정수_제곱근_판별 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(10000));
    }
    private static class Solution {
        public long solution(long n) {
            double sqrt = Math.sqrt(n);
            if (sqrt == (long)sqrt){
                return (long)Math.pow(sqrt+1, 2);
            }
            else {
                return -1;
            }
        }
    }
}
