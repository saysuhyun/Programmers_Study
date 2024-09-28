import java.util.ArrayList;

class 자연수_뒤집어_배열로_만들기 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.solution(12345);
        for (int item : result){
            System.out.print(item);
        }
    }

    static class Solution {
        public int[] solution(long n) {
            String s = String.valueOf(n);
            int[] answer = new int[s.length()];
            int i = 0;

            while (i < s.length()){
                answer[i] = (int) (n%10);
                i++;
                n /= 10;
            }

            return answer;
        }
    }
}