package jaehyun.week3;

public class 평균_구하기 {
    public static void main(String[] args) {
        Solution sol = new Solution();

    }

    private static class Solution {
        public double solution(int[] arr) {
            int sum = 0;
            for (int num : arr) {
                sum += num;
            }
            return (double) sum / arr.length;
        }
    }
}
