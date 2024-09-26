public class 콜라문제 {

    public static void main(String[] args) {

    }

    private static class Solution {
        // n이 주어지면, 더하기 : n/a*b
        // 가게에 제출한 병: (n/a)*a
        // 남은 병수: n은 n - 가게제출한 병 + 받아온 병 수

        // 언제까지 n<a
        public int solution(int a, int b, int n) {
            int answer = 0;
            while(n>=a){
                answer += n/a*b;
                n = n-(n/a*a) + n/a*b;
            }
            return answer;
        }
    }
}