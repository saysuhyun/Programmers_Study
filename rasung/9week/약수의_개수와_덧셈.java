class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        // 1, 4, 9, 16, 25, 36....
        for (int num = left; num <= right; num++) {
            double sqrt = Math.sqrt(num);
            if (sqrt == Math.floor(sqrt)) {
                answer -= num;
            } else {
                answer += num;
            }
        }

        return answer;
    }
}
