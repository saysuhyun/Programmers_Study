import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        // k = 최고 점수 사과
        // m = 1상자에 담을 수 있는 최대 사과 수
        Arrays.sort(score);

        int cnt = 1;
        for (int i = score.length - 1; i >= 0; i--) {
            if (cnt != m) {
                cnt++;
            } else {
                answer += score[i] * m;
                cnt = 1;
            }
        }

        return answer;
    }
}
