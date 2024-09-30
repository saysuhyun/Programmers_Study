public class 푸드_파이트_대회 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution(new int[]{1, 3, 4, 6});
        System.out.println(result);

    }
    static class Solution {
        public String solution(int[] food) {
            String answer = "";
            StringBuilder sb = new StringBuilder();
            for (int i = 1 ; i < food.length ; i++){
                int result = food[i] / 2;
                for (int k = 0 ; k < result ; k++){
                    sb.append(i);
                }
            }
            answer = sb.toString()+0+sb.reverse().toString();
            return answer;
        }

    }
}