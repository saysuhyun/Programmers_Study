public class x만큼_간격이_있는_n개의_숫자 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        long[] result = solution.solution(-4, 2);
        for (long item : result) {
            System.out.println(item);
        }
    }

    static class Solution {
        public long[] solution(int x, int n) {
            long[] answer = new long[n];
            long result = x;
            answer[0] = result;
            for (int i = 1; i < n ; i++){
                result += x;
                answer[i] = result;
            }
            return answer;
        }
    }
}