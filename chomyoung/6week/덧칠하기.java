public class 덧칠하기 {

    public static void main(String[] args) {

    }

    private static class Solution {
        // 페인트 길이 n => 일부만 새로 칠한다. 1,2,3, .... n
        // 롤러 길이 m => length
        // 최초 칠하는 섹션 + m
        // 이후에는 마지막으로 칠해진 섹션보다 num이 같거나 더 큰 경우에 다시 한번 색칠한다.
        public int solution(int n, int m, int[] section) {
            int answer = 0;
            int coloredLastNum = 0;
            for(int num : section){
                if(coloredLastNum <= num) {
                    coloredLastNum = num + m;
                    answer++;
                }
            }
            return answer;
        }
    }
}