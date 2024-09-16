public class 이상한_문자_만들기 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String result = solution.solution("try hello world");
        System.out.println(result);
    }

    private static class Solution {

        public String solution(String s) {
            StringBuilder sb = new StringBuilder();
            int i = 1;
            for (char item : s.toCharArray()) {
                if (' ' == item) {
                    i = 1;
                    sb.append(' ');
                    continue;
                }

                //짝수 홀수 판별
                if (i % 2 == 0) {
                    sb.append(Character.toLowerCase(item));
                } else {
                    sb.append(Character.toUpperCase(item));
                }
                i++;
            }

            return sb.toString();
        }
    }
}