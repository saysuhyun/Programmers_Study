import java.util.ArrayList;
import java.util.List;

public class 약수의_개수와_덧셈 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(13,17);
    }

    static class Solution {
        public int solution(int left, int right) {
            int answer = 0;

            for (int i = left ; i<=right; i++){
                int divisor = divisor(i);
                if (divisor % 2 == 0){
                    answer += i;
                }else {
                    answer -= i;
                }

            }

            return answer;
        }

        public int divisor(int num) {
            List<Integer> divisorList = new ArrayList<>();
            for (int i = 1; i * i <= num; i++) {
                if (num % i == 0) {
                    divisorList.add(i);
                    if (i != num / i) {
                        divisorList.add(num / i);
                    }
                }
            }
            return divisorList.size();
        }
    }


}