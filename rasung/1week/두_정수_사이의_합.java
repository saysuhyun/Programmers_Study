class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int min = Math.min(a, b);
        int max = Math.max(a, b);

        for (int number = min; number <= max; number++) {
            answer += number;
        }

        return answer;
    }
}
