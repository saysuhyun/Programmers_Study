public class 나머지가_1이_되는_수_찾기 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(10);
    }

    static class Solution {
        public int solution(int n) {
            int answer = 1;

            while (answer < 1000000){
                if (n % answer==1 ){
                    break;
                }
                answer++;
            }
            return answer;
        }
    }
}