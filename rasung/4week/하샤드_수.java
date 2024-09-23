class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int sum = 0;
        int number = x;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }

        if (number % sum == 0)
            answer = true;

        return answer;
    }
}
