public class 기사단원의_무기 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(10, 3, 2));
    }

    private static class Solution {
        // 각 기사는 번호가 지정 : 1~N => for문
        // 자신의 기사 번호의 약수 개수에 해당하는 공격력 => 약수: x % y == 0
        // 협약에 의해 공격력의 제한 수치 -> 제한수치보다 큰 공격력은 협약기간에서 정한 공격력으로
        // return 공격력 sum
        public int solution(int number, int limit, int power) {
            int answer = 0;

            for(int i=1; i<=number; i++){
                int divisorCnt = getDivisorCnt(i);
                answer += overPower(divisorCnt, limit, power);
            }

            return answer;
        }

        public int getDivisorCnt(int num){
            int cnt = 0;
            for(int j=1; j<=Math.sqrt(num); j++){
                if(num % j == 0){
                    cnt += (j!=Math.sqrt(num)) ? 2 : 1;
                }
            }
            return cnt;
        }

        public int overPower(int target, int limit, int power){
            return target > limit ? power : target;
        }
    }

}