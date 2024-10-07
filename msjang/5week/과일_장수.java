import java.util.Arrays;

public class 과일_장수 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(3, 4, new int[]{1, 2, 3, 1, 2, 3, 1});
//        int result2 = solution.solution(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2});
        System.out.println(result);

    }

    static class Solution {
        public int solution(int k, int m, int[] score) {
            int answer = 0;

            Arrays.sort(score);
            int appleNum = 0;

            for (int i = score.length - 1; i >= 0; i--) {
                if (score[i] > k) continue;
                appleNum++;
                if (appleNum == m){
                    answer += score[i] * m;
                    appleNum = 0;
                }
            }
            return answer;
        }
    }

}