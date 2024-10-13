package jaehyun.week6;

import java.util.Arrays;


public class 예산 {
    public static void main(String[] args) {

        int[] d1 = {1, 3, 2, 5, 4};
        int budget1 = 9;
        System.out.println(solution(d1, budget1));//3

        int[] d2 = {2, 2, 3, 3};
        int budget2 = 10;
        System.out.println(solution(d2, budget2));//4
    }
    public static int solution(int[] d, int budget) {
        Arrays.sort(d);     //배열 오름차순 정렬

        int answer = 0;  // 지원할 수 있는 부서의 수
        int sum = 0;     // 현재까지 사용한 예산 합


        for (int i = 0; i < d.length; i++) {
            if (sum + d[i] <= budget) {
                sum += d[i];
                answer++;
            } else {
                break;  // 예산 초과
            }
        }

        return answer;
    }


}
/*
class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);     //배열 오름차순 정렬

        int answer = 0;  // 지원할 수 있는 부서의 수
        int sum = 0;     // 현재까지 사용한 예산 합


        for (int i = 0; i < d.length; i++) {
            if (sum + d[i] <= budget) {
                sum += d[i];
                answer++;
            } else {
                break;  // 예산 초과
            }
        }

        return answer;
    }
}
*/
