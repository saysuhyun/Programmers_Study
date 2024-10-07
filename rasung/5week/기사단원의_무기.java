class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for (int num = 1; num <= number; num++) {
            int cnt = searchSubmultipleCnt(num);
            if (cnt > limit) {
                answer += power;
            } else {
                answer += cnt;
            }
        }

        return answer;
    }

    private static int searchSubmultipleCnt(int num) {
        int sum = 0;
        int sqrt = (int) Math.sqrt(num);

        for (int i = 1; i <= sqrt; i++) {
            if (num % i == 0) {
                if (Math.pow(i, 2) == num) {
                    sum += 1;
                } else {
                    sum += 2;
                }
            }
        }

        return sum;
    }
}
