public class 약수의_개수와_덧셈 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(13, 17));

    }

    static class Solution {
        public int solution(int left, int right) {
            int sum=0;
            for (int i = left; i <= right; i++) {
                if (isPerfectSqure(i)){
                    sum-=i;
                }
                else{
                    sum +=i;
                }
            }
            return sum;

        }
        private boolean isPerfectSqure(int num) {
            int sqrt = (int) Math.sqrt(num);
            return num == sqrt;
        }
    }
}
