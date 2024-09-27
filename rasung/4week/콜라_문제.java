class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;

        do {
            int returnBottles = (n / a) * b;
            n = n % a + returnBottles;
            answer += returnBottles;
        } while (n >= a);

        return answer;
    }
}
