class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long sum = x;

        for (int index = 0; index < n; index++) {
            answer[index] = sum;
            sum += x;
        }

        return answer;
    }
}
