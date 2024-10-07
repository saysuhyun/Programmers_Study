import java.util.Arrays;

public class 과일장수 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}));
    }

    private static class Solution {
        // 1~k점 => 사과 품질
        // 한 상자 m개
        // 가장 낮은 점수 p가 한 상자의 갯수당 가격
        // ** 각 상자마다 최저가 높아야한다.
            // 간단하게 score를 정렬하고
            // m개씩 쪼갠다.
            // 그리고 최저에 해당하는 녀석들만 구한다.
        // return 최대 이익 => 남는 사과는 버린다.

        public int solution(int k, int m, int[] score) {
            int answer = 0;
            int cnt = 0;
            Arrays.sort(score);
            int length = score.length;
            for(int j=length-1; j>=0; j--){
                // 남는 사과 버리기
                if(length - m <0){
                    break;
                }
                // 최저에 해당하는 인덱스
                // ** 갯수만 신경쓰고, m개가 찼다면 이 인덱스의 값은 최저
                cnt++;
                if(cnt==m){
                    answer+= score[j] * m;
                    cnt=0;
                }
            }
            return answer;
        }
    }
}