public class 약수의_개수와_덧셈 {

    public static void main(String[] args) {

    }

    private static class Solution {
        // left ~ right
        // 약수의 개수가 짝수인 수는 +
        // 약수의 개수가 홀수인 수는 - => 약수의 갯수가 홀수인 수는 제곱이 되는 수
        public int solution(int left, int right) {
            int answer = 0;
            for(int i=left; i<=right; i++){
                double sqrt = Math.sqrt(i);
                if(sqrt == Math.floor(sqrt)){
                    answer -= i;
                } else{
                    answer += i;
                }
            }
            return answer;
        }
    }
}