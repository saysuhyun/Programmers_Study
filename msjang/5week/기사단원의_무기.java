import java.util.Arrays;

public class 기사단원의_무기 {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int result = solution.solution(10, 3, 2);
//        System.out.println(result);

        solution.findDivisorNum(12);
    }

    static class Solution {
        public int solution(int number, int limit, int power) {
            int answer = 0;
            for (int i = 1; i <= number; i++) {
                int divisorNum = findDivisorNum(i);
                if (limit < divisorNum){
                    answer += power;
                }else {
                    answer +=divisorNum;
                }
            }

            return answer;
        }

        public int findDivisorNum(int num) {
            int totNum = 0;

            for (int j = 1; j <= (int) Math.sqrt(num); j++){
                if (num % j == 0){
                    totNum += 2;
                }
                if (j * j == num){
                    totNum -= 1;
                }
            }
            return totNum;
        }
    }
}