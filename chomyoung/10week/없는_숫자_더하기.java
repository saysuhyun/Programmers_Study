public class 없는_숫자_더하기 {

    public static void main(String[] args) {

    }

    private static class Solution {
        // 45에서 빼기
        public int solution(int[] numbers) {
            int answer = 45;
            for(int i=0;i<numbers.length; i++){
                answer -= numbers[i];
            }
            return answer;
        }
    }
}