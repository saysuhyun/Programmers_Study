import java.util.Arrays;

public class 예산 {

    public static void main(String[] args) {

    }

    private static class Solution {
        // 최대한 많은 부서
        // 적은 금액을 지원 x
        // 신청 목록 배열과 예산
        // return 최대 몇개의 부서

        // 지향
        // 1. 최대를 덜어낸다
        // 2. 최소 위주로 먼저 담는다.

        // 방법
        // 1. d를 오름차순으로 정렬
        // 2. for문으로 < budget 일때까지 충족
        public int solution(int[] d, int budget) {
            int answer = 0;
            Arrays.sort(d);
            int sum = 0;
            for(int eachDeptBudget : d){
                if(sum+eachDeptBudget>budget){
                    break;
                }
                sum+=eachDeptBudget; // 이걸 위로 해도 됬을것
                answer++;
            }
            return answer;
        }
    }
}