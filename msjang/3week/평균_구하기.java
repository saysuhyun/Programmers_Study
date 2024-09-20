public class 평균_구하기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        double result = solution.solution(new int[]{1,2,3,4});
        System.out.println(result);
    }

    static class Solution {
        public double solution(int[] arr) {
            double answer = 0;

            for (int item : arr){
                answer += item;
            }

            return answer/arr.length;
        }
    }
}