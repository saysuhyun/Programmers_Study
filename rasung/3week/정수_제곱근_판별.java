class Solution {
    public long solution(long n) {
        long answer;
        double number = Math.sqrt(n);

        if (number != Math.floor(number)) {
            answer = -1;
        } else {
            answer = (long) Math.pow(number + 1, 2);
        }

        return answer;
    }
}
