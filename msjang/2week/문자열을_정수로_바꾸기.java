public class 문자열을_정수로_바꾸기 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int result = solution.solution("-1234");
        System.out.println(result);
    }

    static class Solution {
        public int solution(String s) {
            //Integer.valueOf(s);
            //Integer.parseInt(s);

            int answer = 0;
            int multi = 1;
            boolean isNegative = false;

            //부호 확인, 문자열 길이 조정.
            if (s.charAt(0) == '-' || s.charAt(0) == '+') {
                if (s.charAt(0) == '-') {
                    isNegative = true;
                }
                s = s.substring(1);
            }

            int i = s.length() - 1;
            //length 길이 만큼 큰수에서 작은수로 돌면서, 각 10씩 곱한다.
            while (i >= 0) {
                answer += (s.charAt(i) - '0') * multi;
                i--;
                multi *= 10;
            }

            //음수이면 - 넣어준다.
            if (isNegative) {
                return -answer;
            }

            return answer;
        }
    }
}