class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        /*
         *     6 | 12, 18
         *       ---------
         *        2,   3
         *
         *      최대 공약수 : 6
         *      최소 공배수 : 6 * 2 * 3
         */

        // 최대 공약수 = 공통된 약수중에 가장 큰 수
        answer[0] = getGcd(n, m);

        // 최소 공배수 = 공통된 배수중에 가장 작은 수
        answer[1] = getGcd(n, m) * (n / getGcd(n, m)) * (m / getGcd(n, m));

        return answer;
    }

    private static int getGcd(int max, int min) {
        if (min == 0) {
            return max;
        } else {
            return getGcd(min, max % min);
        }
    }
}
