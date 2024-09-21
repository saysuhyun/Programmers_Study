package jaehyun.week3;

import java.util.Arrays;

public class 최대_공약수와_최소_공배수 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(3,15)));

    }

    private static class Solution {
        public int[] solution(int n, int m) {
            int gcd = gcd(n,m);
            int lcm = (n*m)/gcd;
            return new int[]{gcd,lcm};

        }
        public int gcd(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
    }
}
