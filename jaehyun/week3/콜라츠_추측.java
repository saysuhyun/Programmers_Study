package jaehyun.week3;

import java.util.Arrays;

public class 콜라츠_추측 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(21));

    }

    private static class Solution {
        public int solution(int num) {
            int count = 0;
            if (num==1){
                return 0;
            }

            while (num>1&&count<500){
                if (num%2==0){
                    num/=2;
                }else{
                    num=num*3+1;
                }
                count++;
            }
            if (num!=1){
                return -1;
            }
            return count;
        }
    }
}
