public class 삼총사 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution(new int[]{-3, -2, -1, 0, 1, 2, 3});
        System.out.println(result);
    }

    static class Solution {
        public int solution(int[] number) {
            int answer = 0;
            for (int i = 0; i < number.length - 2; i++) {
                for (int k = i + 1; k < number.length - 1; k++) {
                    for (int j = k + 1; j < number.length; j++) {
                        int result = number[i] + number[k] + number[j];
                        if (result==0) {
                            answer++;
                        }
                    }
                }
            }
            return answer;
        }
    }
}