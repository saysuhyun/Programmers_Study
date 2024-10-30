public class 음양_더하기 {

    public static void main(String[] args) {

    }

    private static class Solution {
        // 정수들, 절댓값을 차례대로 담은 정수 배열
        // 부호를 차례대로 담은 배열 boolean
        public int solution(int[] absolutes, boolean[] signs) {
            int answer = 0;
            for(int i=0; i<absolutes.length; i++){
                answer = signs[i] ? answer + absolutes[i] : answer - absolutes[i] ;
            }
            return answer;
        }
    }
}