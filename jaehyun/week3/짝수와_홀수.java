package jaehyun.week3;

import java.util.Arrays;

public class 짝수와_홀수 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(6));

    }

    private static class Solution {
        public String solution(int num) {
            if (num % 2 == 0) {
                return "Even";
            }
            return "Odd";
        }
    }
}
