public class 음양_더하기 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] absolutes1 = {4, 7, 12};
        boolean[] signs1 = {true, false, true};
        System.out.println(solution.solution(absolutes1, signs1));

    }

    static class Solution {
        public int solution(int[] absolutes, boolean[] signs) {
            int sum = 0;
            for (int i = 0; i < absolutes.length; i++) {
                sum += (signs[i] ? absolutes[i] : -absolutes[i]);
            }
            return sum;
        }
    }
}
