import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class 체육복 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int solution1 = solution.solution(5, new int[]{4, 2}, new int[]{3, 5});
    }

    static class Solution {
        // 해당 번호의 +1, -1 학생에게만 빌려줄 수 있음
        // lost : 도난당한 학생 번호
        // reserve : 여벌의 체육복 가져온 학생 번호
        // 여벌의 체육복을 가져온 학생도 도난 당했을 수 있다.\

        // n - lost.length  = 수업들 을 수 있는수.
        // reserve 와 같은수의 boolean 배열을 만들어 빌려줘는지 아닌지 확인하는 배열 만든다.
        // lost idx 는 자기보다 +-1 숫자를 찾고 빌릴수 있는지 확인하고 아니면 다음으로 넘어간다.
        public int solution(int n, int[] lost, int[] reserve) {
            int answer = n -lost.length;

            Arrays.sort(lost);
            Arrays.sort(reserve);

            for (int i = 0 ; i < lost.length ; i++){
                for (int j = 0 ; j < reserve.length; j++){
                    if (lost[i] == reserve[j]){
                        reserve[j] = -1;
                        lost[i] = -1;
                        answer++;
                        break;
                    }
                }
            }

            for (int i = 0 ; i < lost.length ; i++){
                int lostItem = lost[i];
                if (lostItem == -1){
                    continue;
                }

                for (int j = 0 ; j < reserve.length; j++){
                    if (lostItem + 1 == reserve[j] || lostItem -1 == reserve[j]) {
                        reserve[j] = -1;
                        answer++;
                        break;
                    }
                }
            }



            return answer;
        }
    }
}