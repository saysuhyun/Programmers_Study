import java.util.Arrays;

public class x만큼_간격이있는_n개의숫자 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(2, 5)));
    }

    private static class Solution {
        // x+x+x+..
        // 더할떄마다 배열에 추가
        // for문 돌려서
        // x를 곱해나가도 될듯
        public long[] solution(int x, int n) {
            long[] answer = new long[n];
            for(int i=0; i<n; i++){
                answer[i] = (long) (i+1) * x;
            }
            return answer;
        }
    }

}