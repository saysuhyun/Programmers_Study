class Solution {
    public int solution(int num) {
        int answer = 0;
        int cnt = 0;
        long findNumber = num;
        boolean isComplete = false;

        while (cnt <= 500) {
            if (findNumber == 1) {
                answer = cnt;
                isComplete = true;
                break;
            }

            if (findNumber % 2 == 0) {
                findNumber /= 2;
            } else {
                findNumber = (findNumber * 3) + 1;
            }

            cnt++;
        }

        if (!isComplete) answer = -1;

        return answer;
    }
}
