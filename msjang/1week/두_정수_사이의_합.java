
public class 두_정수_사이의_합 {

    public static void main(String[] args) {
         Solution solution = new Solution();
          long solution1 = solution.solution(5, 3);
          System.out.println(solution1);
    }

    static class Solution {
        public long solution(int a, int b) {
            // a == 작은수
            // b == 큰수
            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            } else if (a == b) {
                return a;
            }

            long answer = 0;

            for (int i = a ; i <= b ; i++) {
                answer += i;
            }

            return answer;
        }
    }
}