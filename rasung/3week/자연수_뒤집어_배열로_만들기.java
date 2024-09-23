class Solution {
    public int[] solution(long n) {
        String stringNumber = n + "";
        int[] answer = new int[stringNumber.length()];
        int index = 0;
        while (n > 0) {
            answer[index] = (int) (n % 10L);
            n /= 10L;
            index++;
        }

        return answer;
    }
}
