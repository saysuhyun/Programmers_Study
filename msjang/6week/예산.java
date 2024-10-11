import java.util.Arrays;

public class 예산 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{1, 3, 2, 5, 4}, 9);
        System.out.println(result);
    }

    static class Solution {
        public int solution(int[] d, int budget) {
            int answer = 0;
            Arrays.sort(d);
            for (int item : d ){
                if(item <= budget){
                    budget -= item;
                    answer++;
                }else {
                  break;
                }
            }
            return answer;
        }
    }
}